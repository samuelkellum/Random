import time
import random

#Function called whenever the player wins.
def win():
    print ("Winner!")
    print (" ")
    print ("Generating prize...")
    time.sleep(1.5)
    print (("Your prize is $%d") % (money))

#Function called whenever the player loses.
def lose():
    print ("You lose!")
    print (" ")
    print ("Generating 'prize'...")
    time.sleep(1.5)
    money = 0
    print (("Your 'prize' is $%d") % (money))

#Welcome prompt to player who decides whether they would like to play.
print ("Hello! Welcome to the roulette table!")
time.sleep(1)
play = input("Would you like to play? (Yes/No): ")
print (" ")
if play == "Yes" or play == "yes" or play == "Y" or play == "y":
    print ("Great! The game will begin shortly.")
    #Lets the player see the payouts only if they wish.
    payout = input("Would you like to see the payouts and probabilities for each bet? (Yes/No): ")
    if payout == "Yes" or payout == "yes" or payout == "Y" or payout == "y":
        time.sleep(0.5)
        print (" ")
        print ("Type of Bet:                 | Payout:| Probability of Winning:")
        print ("Individual Number            | x36    | 1/37")
        print ("Even (excluding zero)/Odd    | x2     | 18/37")
        print ("Low (1-18)/High (19-36)      | x2     | 18/37")
        print ("Dozen (1st 12, 2nd 12, etc.) | x3     | 12/37")

    time.sleep(1)
    #Produces blank line to increase readability.
    print (" ")
    #Player enters how much 'money' they want to bet.
    print ("How much money would you like to bet?")
    time.sleep(0.5)
    money = eval(input("Enter amount: $"))
    #Player will be unable to continue with a $0 bet.
    if money <= 0:
        print ("ERROR: Invalid bet.")
        quit()
    time.sleep(1)

    print(" ")             
    #Player decides what they would like to bet on.
    print ("What would you like to bet on?")
    time.sleep(1)           
    print ("Options: 0 through 36 (individual numbers), even (excluding zero), odd,")
    print ("low (1-18), high (19-36), 1st 12 (1-12), 2nd 12 (13-24), 3rd 12 (25-36)")
    bet = input("Enter item to bet on: ")
    print (" ")
    time.sleep(1)
    #Ball 'spins' and player sees where the ball lands.             
    print ("Spinning...")
    time.sleep(2.5)
    ball = random.randint(0,36)
    print (("Ball lands on %d") % (ball))
    time.sleep(1)

    #INDIVIDUAL NUMBER BET 
    #Converts individual bets from strings to numbers.
    if bet == "0" or bet == "1" or bet == "2" or bet == "3" or bet == "4" or bet == "5" or bet == "6" \
       or bet == "7" or bet == "8" or bet == "9" or bet == "10" or bet == "11" or bet == "12" or bet == "13" or \
       bet == "14" or bet == "15" or bet == "16" or bet == "17" or bet == "18" or bet == "19" or bet == "20" or \
       bet == "21" or bet == "22" or bet == "23" or bet == "24" or bet == "25" or bet == "26" or bet == "27" or \
       bet == "28" or bet == "29" or bet == "30" or bet == "31" or bet == "32" or bet == "33" or bet == "34" or \
       bet == "35" or bet == "36":
        bet = int(bet)
        if bet == ball:
            money = 36 * money
            win()
        else:
            lose()
    #HIGH/LOW BET
    elif bet == "low" or bet == "low(1-18)":
        if 1 <= ball <= 18:
            money = 2 * money
            win()
        else:
            lose()
    elif bet == "high" or bet == "high(1-18)":
        if 19 <= ball <= 36:
            money = 2 * money
            win()
        else:
            lose()
    #EVEN/ODD BET
    elif bet == "even" or bet == "even (excluding zero)":
        if ball % 2 == 0 and ball != 0:
            money = 2 * money
            win()
        else:
            lose()
    elif bet == "odd":
        if ball % 2 == 1:
            money = 2 * money
            win()
        else:
           lose()

    #DOZEN BETS (1st 12, 2nd 12, 3rd 12)
    elif bet == "1st 12" or bet == "1st 12 (1-12)" or bet == "1-12" or bet == "(1-12)":
        if 1 <= ball <= 12:
            money = 3 * money
            win()
        else:
            lose()
    elif bet == "2nd 12" or bet == "2nd 12 (13-24)" or bet == "13-24" or bet == "(13-24)":
        if 13 <= ball <= 24:
            money = 3 * money
            win()
        else:
            lose()
    elif bet == "3rd 12" or bet == "3rd 12 (25-36)" or bet == "25-36" or bet == "(25-36)":
        if 25 <= ball <= 36:
            money = 3 * money
            win()
        else:
            lose()
    else:
        print ("ERROR: invalid bet.")
        
#Prompt if the player decides to not play.        
else:
    print ("Oh well, you're missing out on a lot of fun!")
