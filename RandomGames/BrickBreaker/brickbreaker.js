/*
 * Author: Samuel Kellum
 * Date: December 20, 2020
 * Program Description: A modified version of the classic brickbreaker game.
 * This program was created with the assistance of a textbook titled "Hands-On Intro to Programming Book" by Chris DeLeon
 */

//canvas and graphics variables
let canvas = document.getElementById("gameCanvas");
let canvasContext;
const FRAMES_PER_SECOND = 60;

//ball variables
let ballX = canvas.width * 0.5; //400
let ballY = canvas.height * 0.8833; //530
const BALL_RADIUS = canvas.width * 0.0125; //10
let ballVelocityX = 0; 
let ballVelocityY = 0;

//paddle variables and consts
const PADDLE_WIDTH = canvas.width * 0.10625; //85
const PADDLE_THICKNESS = canvas.height * 0.0167; //10
let paddleX = (canvas.width / 2) - (PADDLE_WIDTH / 2); //400 - 42.5 = 357.5
const PADDLE_Y = canvas.height * .9; //540
const DELTA_DIVIDER = 5; //determines the magnitude of the ball's horizontal velocity based on the position the ball is hit by the paddle

//brick variables and consts
const BRICK_W = canvas.width * .1; //80
const BRICK_H = canvas.height * .03333; //20
const BRICK_GAP = canvas.height * .00333; //2
const BRICK_COLS = 10; //number of brick columns 
const NUM_EMPTY_ROWS = 4; //number of empty rows at top of brick
const BRICK_ROWS = 10; //number of rows that will contain bricks
const TOTAL_BRICK_ROWS = NUM_EMPTY_ROWS + BRICK_ROWS; //total number of brick rows, including both empty rows(0 to NUM_EMPTY_ROWS) and rows with brick(NUM_EMPTY_ROWS + 1 to TOTAL_NUM_ROWS)
let brickGrid = new Array(BRICK_COLS * TOTAL_BRICK_ROWS); //array of bricks for game, should be 140 bricks with the first 40 bricks always 0
let numBricksRemaining = 0; //starts at 0 but will increment for each brick printed to the console (starting with the 41st brick and ending with the 140th brick)


//player variables
const STARTING_SCORE = 0; //for the purposes of resetting the game after a player runs out of lives
const STARTING_LIVES = 5; //for the purposes of resetting the game after a player runs out of lives
let playerScore = 0; //initialized to zero to begin the game
let playerHighScore = 0; //matches the player score if it is higher than the high score of any previous game
let playerLives = STARTING_LIVES;
let currentLevel = 1; //increments for each level

//game variables
let levelInSession = false; //these two variables are important because it determines when the user has power to move the paddle and click to start a level or reset the game screen
let gameOver = false;

//audio
let pointAudio = new Audio("point.mp3"); //audio that plays when user breaks a brick and, as a result, scores a point
let dieAudio = new Audio("die.mp3"); //audio that plays when user fails to return the ball with the paddle

//calculates mouse position to move paddle based on mouse movement
function calculateMousePos(evnt) {
    let rect = canvas.getBoundingClientRect();
    let root = document.documentElement;
    let mouseX = evnt.clientX - rect.left - root.scrollLeft;
    let mouseY = evnt.clientY - rect.left - root.scrollLeft;
    return {
        x: mouseX,
        y: mouseY
    };

}
//starts and resets game when player clicks mouse but only when a level is not in session
function handleMouseClick(evnt) {
    //starts level when user clicks
    if (levelInSession == false) {
        startlevel();
    }
    if (gameOver == true) {
        gameReset();
    }
}

//allows paddle to move based on position of paddle when a level is in session
function handleMouseMove(evnt) {
    if (levelInSession == true) {
        let mousePos = calculateMousePos(evnt);
        //mouse position is centered with the paddle
        paddleX = mousePos.x - (PADDLE_WIDTH / 2);
    }
}

//everything that loads when the user loads or resets the page
window.onload = function () {
    canvasContext = canvas.getContext('2d');
    //the moveEverything() and drawEverything() functions update 60 times per second
    setInterval(function () {
        moveEverything();
        drawEverything();
    }, 1000 / FRAMES_PER_SECOND);
    canvas.addEventListener("mousedown", handleMouseClick);
    canvas.addEventListener("mousemove", handleMouseMove);
    resetBricks();
}

//controls ball movement across the canvas and against walls and bricks
/*
IMPORTANT: left = negative, right = positive, up = negative, down = positive
(0,0) represents top left of canvas (game screen)
*/
function moveEverything() {
    //moves ball a certain number of pixels per frame
    ballX += ballVelocityX;
    ballY += ballVelocityY;

    //ball changes horizontal direction at the same velocity (bounces off the wall) when its perimeter coordinate reaches either edge of the game screen (canvas)
    if (ballX >= canvas.width - BALL_RADIUS) {
        ballVelocityX *= -1;
    }
    if (ballX <= 0 + BALL_RADIUS) {
        ballVelocityX *= -1;
    }

    //ball changes vertical direction at the same velocity (bounces off the paddle) when its center's coordinate reaches either edge of the game screen (canvas)
    if ((ballY >= PADDLE_Y - BALL_RADIUS) && (ballVelocityY > 0)/* avoids bug: ensures that ball only reflects off paddle if traveling down the game screen (canvas)*/) {
        
        //checks that ball's x value is in between the paddles when its y value approaches the paddle
        if ((ballX < paddleX + PADDLE_WIDTH + BALL_RADIUS) && (ballX > paddleX - BALL_RADIUS)) {
            
            //calculates difference between ball's x coordinate and center of paddle (possible values: -42.5 to 42.5 (-width/2 to width/2))
            let deltaX = ballX - (paddleX + (PADDLE_WIDTH / 2));

            //randomizes horizontal velocity from -5 to 5 if user does not move paddle after beginning a level,
            //preventing the user from doing nothing and breaking every middle block at the beginning of the game
            if (deltaX == 0 && paddleX == ((canvas.width / 2) - (PADDLE_WIDTH / 2))) {
                ballVelocityX = ((Math.random() * 10) - 5);
            }

            //ball's horizontal velocity changes based on the location the user hits the ball with the paddle (possible values -8.5 to 8.5 if paddle width is 85 and delta divider is 5)
            else {
                ballVelocityX = (deltaX / DELTA_DIVIDER);
            }

            //ball's vertical direction always changes to negative (upward) at the same velocity when it contacts the paddle
            //(basically, it bounces off the padle and returns at the same vertical direction)
            ballVelocityY *= -1;
        }

        //plays sound effect, decreases life, and resets level (repositions paddle and ball) when the ball is not hit by the paddle
        else {
            playerLives--;
            dieAudio.play();
            levelReset();
        }
    }

    //ball changes vertical direction to positive (downward) at the same velocity (bounces off the wall) when its perimeter coordinate reaches top of the game screen (canvas)
    if (ballY <= 0) {
        ballVelocityY = -ballVelocityY;
    }
}
//converts tile column and tile row coordinates to brick index
function brickTileToIndex(tileCol, tileRow) {
    return (tileCol + BRICK_COLS * tileRow);
}


//checks if brick has been broken by user
function isBrickAtTileCoord(brickTileCol, brickTileRow) {
    let brickIndex = brickTileToIndex(brickTileCol, brickTileRow);
    return (brickGrid[brickIndex] == 1);
}

//resets bricks when user completes level or runs out of lives for the next game
function resetBricks() {
    //resets the number of bricks remaining to zero in case user run out of lives before bricks are redrawn
    numBricksRemaining = 0;

    for (let eachRow = 0; eachRow < TOTAL_BRICK_ROWS; eachRow++) { //for each row of bricks
        for (let eachCol = 0; eachCol < BRICK_COLS; eachCol++) { //for each column of bricks
            let brickIndex = brickTileToIndex(eachCol, eachRow);
            if (eachRow >= NUM_EMPTY_ROWS) { //sets value of brick in brick index to 1
                brickGrid[brickIndex] = 1;
                numBricksRemaining++;
            } else { //sets value of brick in brick index to 0 which will prevent any brick from forming in an empty row
                brickGrid[brickIndex] = 0;
            }

        }
    }
}

//conditions/varibles that change when user clicks to begin level
function startlevel() {
    levelInSession = true; //gives user ability to drag mouse to move paddle, removes user ability to click to start level or reset game (because the level is already in session)
    ballVelocityX = 0;
    ballVelocityY = -((canvas.height * 0.0167) + Math.pow(currentLevel - 1, 1.667)); //-10 for level 1, -11 for level 2, -13.17 for level 3, etc.
}


//conditions/varibles that change when a new level or game is reset
function levelReset() {
    levelInSession = false;
    ballX = canvas.width * 0.5; //repositions ball to x = 400
    ballY = canvas.height * 0.8833; //repositions ball to y = 530
    paddleX = (canvas.width / 2) - (PADDLE_WIDTH / 2); //repositions paddle X to center of game screen 400 - 42.5 = 357.5
    ballVelocityX = 0; //prevents ball from moving until user clicks to start level
    ballVelocityY = 0; //prevents ball from moving until user clicks to start level
}

//actions that occur when the player runs out of lives
function endOfGame() {
    gameOver = true; //gives user ability to click to reset game (which will also start a new level)
    levelInSession = false; //removes user ability to drag mouse to move paddle, gives user ability to click to start new level (because a level is not in session)
    ballX = -100; //removes ball from canvas (game screen)
    ballY = -100; //removes ball from canvas (game screen)
    ballVelocityX = 0; //prevents ball from moving until user clicks to start level
    ballVelocityY = 0; //prevents ball from moving until user clicks to start level
    paddleX = canvas.width - 1000; //removes paddle from canvas (game screen)
    //game over text
    canvasContext.font = "35px sarif";
    canvasContext.fillStyle = "red";
    canvasContext.fillText("GAME OVER!", 290, 350);
    canvasContext.fillText("Your score: " + playerScore, 295, 410);
    canvasContext.fillText("Click to reset", 300, 470);
}

//resets score to default value and resets bricks
function gameReset() {
    playerScore = STARTING_SCORE;
    currentLevel = 1;
    playerLives = STARTING_LIVES;
    resetBricks();
    levelReset();
    gameOver = false;
}

//
function breakAndBounceOffBrickAtPixelCoord(pixelX, pixelY) {
    //converts pixel coordinates to tile row and column
    let tileCol = Math.floor(pixelX / BRICK_W);
    let tileRow = Math.floor(pixelY / BRICK_H);

    //avoids error from checking an illegal array index
    if (tileRow >= TOTAL_BRICK_ROWS || tileRow < 0 || tileCol >= BRICK_COLS || tileCol < 0) {
        return;
    }
    //
    let brickIndex = brickTileToIndex(tileCol, tileRow);

    if (brickGrid[brickIndex] == 1) {

        let prevBallX = ballX - ballVelocityX;
        let prevBallY = ballY - ballVelocityY;
        let prevTileCol = Math.floor(prevBallX / BRICK_W);
        let prevTileRow = Math.floor(prevBallY / BRICK_H);

        let bothTestsFailed = true;

        if (prevTileCol != tileCol) { //must have come in horizontally
            let adjacentBrickIndex = brickTileToIndex(prevTileCol, tileRow);
            if (brickGrid[adjacentBrickIndex] != 1) {
                ballVelocityX *= -1;
                bothTestsFailed = false;
            }
        }
        if (prevTileRow != tileRow) {
            let adjacentBrickIndex = brickTileToIndex(tileCol, prevTileCol);
            if (brickGrid[adjacentBrickIndex] != 1) {
                ballVelocityY *= -1;
                bothTestsFailed = false;
            }
        }

        if (bothTestsFailed) {
            ballVelocityX *= -1;
            ballVelocityY *= -1;
        }

        if ((ballX % BRICK_W < Math.abs(BALL_RADIUS)) && (ballX > BALL_RADIUS * 2)) {
            if (brickGrid[brickIndex - 1] == 1) {
                brickGrid[brickIndex - 1] = 0;
                changeScore();
            }
        }

        brickGrid[brickIndex] = 0; //remove brick that gets hit
        changeScore();
    }
}

function changeScore() {
    pointAudio.play();
    playerScore += currentLevel;
    if (playerScore >= playerHighScore) {
        playerHighScore = playerScore;
    }
    numBricksRemaining--;
}

function drawEverything() {
    drawRect(0, 0, canvas.width, canvas.height, "black"); //backglevel
    drawBricks();
    drawCircle(ballX, ballY, BALL_RADIUS, "white"); //ball
    drawRect(paddleX, PADDLE_Y, PADDLE_WIDTH, PADDLE_THICKNESS, "white"); //paddle
    breakAndBounceOffBrickAtPixelCoord(ballX, ballY);
    drawScore();
    if (numBricksRemaining == 0) {
        resetBricks();
        levelReset();
        currentLevel++;
        playerLives++;
    }
    if (playerLives == 0) {
        endOfGame();
    }
}

function drawBricks() {
    for (let eachCol = 0; eachCol < BRICK_COLS; eachCol++) { //for each column...
        for (let eachRow = 0; eachRow < TOTAL_BRICK_ROWS; eachRow++) { //for each row in that column...
            if (isBrickAtTileCoord(eachCol, eachRow)) { //if the brick is present...
                //coordinates to start drawing each brick at its top left corner
                let brickLeftEdgeX = eachCol * BRICK_W;
                let brickTopEdgeY = (eachRow * BRICK_H);
                let randomColor = Math.floor(Math.random() * 16777215).toString(16);
                drawRect(brickLeftEdgeX, brickTopEdgeY,
                    BRICK_W - BRICK_GAP, BRICK_H - BRICK_GAP, "#" + randomColor);
            }
        }
    }
}

function drawScore() {
    canvasContext.font = "35px sarif"
    canvasContext.fillStyle = "white";
    canvasContext.fillText("Score: " + playerScore, 10, 45);
    canvasContext.fillText("High Score: " + playerHighScore, 10, 585);
    canvasContext.fillText("Level: " + currentLevel, 665, 45);
    canvasContext.fillText("Lives: " + playerLives, 680, 585);
}

function drawCircle(centerX, centerY, radius, drawColor) {
    canvasContext.fillStyle = drawColor;
    canvasContext.beginPath();
    canvasContext.arc(centerX, centerY, radius, 0, Math.PI * 2, true);
    canvasContext.fill();
}

function drawRect(leftX, topY, width, height, drawColor) {
    canvasContext.fillStyle = drawColor;
    canvasContext.fillRect(leftX, topY, width, height);
}