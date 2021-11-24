import math

def nCr(n,r):
    answer = math.factorial(n)/((math.factorial(r))*(math.factorial(n-r)))
    print ("%d" % (answer))
    
nCr(52,7)
