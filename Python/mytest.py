def myLen(string):
    if len(string) == 0:
        return len(string)
    else:
        return 1 + myLen(string[1:])
