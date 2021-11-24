from random import *
import time

def roll_dice(rolls):
        for roll in range(rolls):
            print ("Your dice rolled: %d" % randint(1,6))


def longest_streak(flips):
    headStreak = 0
    tailStreak = 0
    longestStreak = 0
    for flip in range(flips):
        coin = randint(0,1)
        if (coin == 0):
            headStreak += 1
            tailStreak = 0
        else:
            tailStreak += 1
            headStreak = 0
        if(headStreak > longestStreak or tailStreak > longestStreak):
            longestStreak += 1

    print(("The longest streak of either heads or tails attained by flipping %d coins is: %d") % (flips, longestStreak))

def coin_flip(streak, trials):
    streakcount = 0
    count = 0
    results = []
    for i in range(trials):
    # Repeat the sequence until the desiginated streak is reached.
        while streakcount < streak:
            coin = randint(1,2)
            count += 1
            if coin == 1:
                streakcount += 1
            else:
                streakcount = 0
        results.append(count)
        count = 0
        streakcount = 0
    average = sum(results)/len(results)
    print (("The average number of coin flips to reach a streak of %d heads in a row with %d trials is: %d") % (streak, trials, average))




def coin_flip_specific_average(streak, average):
    streakcount = 0
    count = 0
    results = []
    mean = 0
    trials = 0
    while (mean != average):
    # Repeat the sequence until the desiginated streak is reached.
        while (streakcount < streak):
            coin = randint(1,2)
            count += 1
            if coin == 1:
                streakcount += 1
            else:
                streakcount = 0
        results.append(count)
        count = 0
        streakcount = 0
        mean = sum(results)/len(results)
        trials += 1
        if trials >= 10000:
            print ("Unfortunatley, the average %d could not be reached in %d trials" % (average, trials))
            return
    print (("The number of trials to reach an average number of %d coin flips to reach %d consecutive heads is: %d") % (average, streak, trials))


def die_roll_side_streak(side, streak):
    if (side < 1 or side > 6):
        print("Error: invalid side")
        return
    streakcount = 0
    count = 0
    # Repeat the sequence until the desiginated streak is reached.
    while streakcount < streak:
        if randint(1,6) == side:
            streakcount += 1
        else:
            streakcount = 0
        count += 1
    print (("The number of dice rolls to reach a streak of %d consecutive %ds in a row is: %d") % (streak, side, count))


def die_roll_streak_any(streak, trials):
    # Values that will correspond to the streak of the number rolled
    one = 0
    two = 0
    three = 0
    four = 0
    five = 0
    six = 0
    count = 0
    results = []
    for trial in range(trials):
        # Repeat the sequence until streak is reached for any number.
        while (one or two or three or four or five or six) < streak:
            dice = randint(1,6)
            #Uncomment the line below if you do not believe this code is legit!
            #print ("The number is: %d" % (die))
            count += 1
            if dice == 1:
                one += 1
                '''All other die number variables must be set to zero as shown below in order to
                reset all other streaks to zero because each roll is independent of each other
                and any number could occur before any other number.'''
                two = 0
                three = 0
                four = 0
                five = 0
                six = 0
            elif dice == 2:
                two += 1
                one = 0
                three = 0
                four = 0
                five = 0
                six = 0
            elif dice == 3:
                three += 1
                one = 0
                two = 0
                four = 0
                five = 0
                six = 0
            elif dice == 4:
                four += 1
                one = 0
                two = 0
                three = 0
                five = 0
                six = 0
            elif dice == 5:
                five += 1
                one = 0
                two = 0
                three = 0
                four = 0
                six = 0
            elif dice == 6:
                six += 1
                one = 0
                two = 0
                three = 0
                four = 0
                five = 0
        results.append(count)
        count = 0
        one = 0
        two = 0
        three = 0
        four = 0
        five = 0
        six = 0
    print (("The average number of dice rolls to reach a streak of %d for any number with %d trials is: %d") % (streak, trials, sum(results)/len(results)))


def coin_flip_streak_any(streak, trials):
    heads = 0
    tails = 0
    count = 0
    results = []
    for trial in range(trials):
        # Repeat the sequence until the desiginated streak is reached.
        while (heads or tails) < streak:
            coin = randint(1,2)
            #Uncomment the next four lines if you do not believe this code is legit!
            '''if coin == 1:
                print ("The coin is heads")
            else:
                print ("The coin is tails")'''
            if coin == 1:
                heads+= 1
                tails = 0
            else:
                heads = 0
                tails += 1
            count += 1
        results.append(count)
        count = 0
        heads = 0
        tails = 0

    print (("The average number of coin flips to reach a streak of %d for either heads or tails with %d trials is: %d") % (streak, trials, sum(results)/len(results)))


def coin_flip_heads_percentage(flips):
        heads = 0
        for i in range(flips):
            if  randint(0,1) == 0:
                heads += 1
        print (("With %d coin tosses, %5.2f percent of the flips landed on heads.") % (flips, float(heads)/float(flips) * 100))

def random_number_of_the_day(min, max):
    print ("Random number of the day from %d to %d: %d" % (min, max, randint(min,max)))


longest_streak(1000000000)
'''roll_dice(2)
coin_flip(10, 1000)
coin_flip_specific_average(10, 2020)
die_roll_side_streak(6, 6)
die_roll_streak_any(5, 100)
coin_flip_streak_any(15, 100)
coin_flip_heads_percentage(12345)
random_number_of_the_day(1, 100)'''
