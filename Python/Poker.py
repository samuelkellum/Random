import random
for i in range(100):
    number1 = random.randint(1,13)
    if number1 == 1:
        number1 = "A"
    if number1 == 10:
        number1 = "T"
    if number1 == 11:
        number1 = "J"
    if number1 == 12:
        number1 = "Q"
    if number1 == 13:
        number1 = "K"
    else:
        number1 = str(number1)
    number2 = random.randint(1,13)
    if number2 == 1:
        number2 = "A"
    if number2 == 10:
        number2 = "T"
    if number2 == 11:
        number2 = "J"
    if number2 == 12:
        number2 = "Q"
    if number2 == 13:
        number2 = "K"
    else:
        number2 = str(number2)
    suit1 = random.randint(1,4)
    if suit1 == 1:
        suit1 = "♣"
    if suit1 == 2:
        suit1 = "♦"
    if suit1 == 3:
        suit1 = "♥"
    if suit1 == 4:
        suit1 = "♠"
    suit2 = random.randint(1,4)
    if suit2 == 1:
        suit2 = "♣"
    if suit2 == 2:
        suit2 = "♦"
    if suit2 == 3:
        suit2 = "♥"
    if suit2 == 4:
        suit2 = "♠"
    hand1 = number1 + suit1
    hand2 = number2 + suit2
    if hand1 == hand2:
        numberalt = random.randint(1,13)
        if numberalt == 1:
            numberalt = "A"
        if numberalt == 10:
            numberalt = "T"
        if numberalt == 11:
            numberalt = "J"
        if numberalt == 12:
            numberalt = "Q"
        if numberalt == 13:
            numberalt = "K"
        else:
            numberalt = str(numberalt)
        suitalt = random.randint(1,4)
        if suitalt == 1:
            suitalt = "♣"
        if suitalt == 2:
            suitalt = "♦"
        if suitalt == 3:
            suitalt = "♥"
        if suitalt == 4:
            suitalt = "♠"
        handalt = numberalt + suitalt
        print ("Alt engaged.")
        if handalt == hand2:
            print ("ERROR INVALID HAND")
            print ( )
        else:
            print(hand1)
            print (handalt)
            print ( )
    else:
        print (hand1)
        print (hand2)
        print ( )

    number3 = random.randint(1,13)
    if number3 == 1:
        number3 = "A"
    if number3 == 10:
        number3 = "T"
    if number3 == 11:
        number3 = "J"
    if number3 == 12:
        number3 = "Q"
    if number3 == 13:
        number3 = "K"
    else:
        number3 = str(number3)
    suit3 = random.randint(1,4)
    if suit3 == 1:
        suit3 = "♣"
    if suit3 == 2:
        suit3 = "♦"
    if suit3 == 3:
        suit3 = "♥"
    if suit3 == 4:
        suit3 = "♠"
    flop1 = number3 + suit3
    if (flop1 == hand1) or (flop1 == hand2):
        numberalt = random.randint(1,13)
        if numberalt == 1:
            numberalt = "A"
        if numberalt == 10:
            numberalt = "T"
        if numberalt == 11:
            numberalt = "J"
        if numberalt == 12:
            numberalt = "Q"
        if numberalt == 13:
            numberalt = "K"
        else:
            numberalt = str(numberalt)
        suitalt = random.randint(1,4)
        if suitalt == 1:
            suitalt = "♣"
        if suitalt == 2:
            suitalt = "♦"
        if suitalt == 3:
            suitalt = "♥"
        if suitalt == 4:
            suitalt = "♠"
        handaltf1 = numberalt + suitalt
        print ("Alt engaged f1.")
        if  (handaltf1 == hand1) or (handaltf1 == flop1) or (handaltf1 == hand2):
            print ("ERROR INVALID HAND F1")
        else:
            print (handaltf1)

"""number4 = random.randint(1,13)
if number4 == 1:
    number4 = "A"
if number4 == 10:
    number4 = "T"
if number4 == 11:
    number4 = "J"
if number4 == 12:
    number4 = "Q"
if number4 == 13:
    number4 = "K"
else:
    number4 = str(number4)
suit4 = random.randint(1,4)
if suit4 == 1:
    suit4 = "♣"
if suit4 == 2:
    suit4 = "♦"
if suit4 == 3:
    suit4 = "♥"
if suit4 == 4:
    suit4 = "♠"
flop2 = number4 + suit4
number5 = random.randint(1,13)
if number5 == 1:
    number5 = "A"
if number5 == 10:
    number5 = "T"
if number5 == 11:
    number5 = "J"
if number5 == 12:
    number5 = "Q"
if number5 == 13:
    number5 = "K"
else:
    number5 = str(number5)
suit5 = random.randint(1,4)
if suit5 == 1:
    suit5 = "♣"
if suit5 == 2:
    suit5 = "♦"
if suit5 == 3:
    suit5 = "♥"
if suit5 == 4:
    suit5 = "♠"
flop3 = number5 + suit5

if (flop1 == flop2) or (flop1 == flop3) or (flop2 == flop3): 
    print ("ERROR INVALID FLOP (FLOP = FLOP)")
elif (flop1 == hand1 or flop1 == hand2) or (flop2 == hand1 or flop2 == hand2) or (flop3 == hand1 or flop3 == hand2):
    print ("ERROR INVALID FLOP (FLOP = HAND)")
else:
    print (flop1)
    print (flop2)
    print (flop3)

number6 = random.randint(1,13)
if number6 == 1:
    number6 = "A"
if number6 == 10:
    number6 = "T"
if number6 == 11:
    number6 = "J"
if number6 == 12:
    number6 = "Q"
if number6 == 13:
    number6 = "K"
else:
    number6 = str(number6)
suit6 = random.randint(1,4)
if suit6 == 1:
    suit6 = "♣"
if suit6 == 2:
    suit6 = "♦"
if suit6 == 3:
    suit6 = "♥"
if suit6 == 4:
    suit6 = "♠"
turn = number6 + suit6
if (turn == hand1) or (turn == hand2) or (turn == flop1) or (turn == flop2) or (turn == flop3):
    print ("ERROR INVALID TURN")
else:
    print (turn)

number7 = random.randint(1,13)
if number7 == 1:
    number7 = "A"
if number7 == 10:
    number7 = "T"
if number7 == 11:
    number7 = "J"
if number7 == 12:
    number7 = "Q"
if number7 == 13:
    number7 = "K"
else:
    number7 = str(number7)
suit7 = random.randint(1,4)
if suit7 == 1:
    suit7 = "♣"
if suit7 == 2:
    suit7 = "♦"
if suit7 == 3:
    suit7 = "♥"
if suit7 == 4:
    suit7 = "♠"
river = number7 + suit7
if (river == hand1) or (river == hand2) or (river == flop1) or (river == flop2) or (river == flop3) or (river == turn):
    print ("ERROR INVALID RIVER")
else:
    print (river)
print ()
print ()
"""
