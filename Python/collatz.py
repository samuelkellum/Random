def collatzSequence(n):
    print(int(n))
    while (n != 1):
        if (n % 2 == 0):
            n /= 2
        else:
            n = 3*n + 1
        print(int(n))

collatzSequence(975400)


def collatzSequenceLength(n):
    length = 1
    while (n != 1):
        if (n % 2 == 0):
            n /= 2
            length += 1
        else:
            n = 3*n + 1
            length += 1
    return length

#print(collatzSequenceLength(13))

def longestCollatzSequence(n):
    longestLength = 0
    longestLengthNumber = n
    for i in range(n, 0, -1):
        length = collatzSequenceLength(i)
        if length > longestLength:
            longestLength = length
            longestLengthNumber = i
    print("The positive integer, less than or equal to %d, with the longest collatz sequence is %d, with a length of %d." % (n, longestLengthNumber, longestLength))
    return longestLengthNumber

#longestCollatzSequence(12345)


def maxNumber(n):
    theMax = n
    while (n != 1):
        if (n % 2 == 0):
            n /= 2
        else:
            n = 3*n + 1
        if n > theMax:
            theMax = n
    return int(theMax)

#print(maxNumber(10971))
