from random import *
from statistics import *

birthdayList = []
count = 0
trueCount = 0
trueCountList = []

for i in range(1000):
    for j in range(23):
        if randint(1, 4) == 4:
            birthdayList.append(randint(1, 366))
        else:
            birthdayList.append(randint(1, 365))

    birthdaySet = set(birthdayList)
    result = len(birthdayList) != len(birthdaySet)
    if result == True:
        trueCount += 1
    birthdayList.clear()
    birthdaySet.clear()
    count += 1

print(trueCountList)
print(mean.trueCountList())
print(pstdev.trueCountList())


    
