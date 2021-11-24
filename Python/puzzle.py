'''
a1 a2 a3 = 38
b1 b2 b3 b4 = 38
c1 c2 c3 c4 c5  = 38
d1 d2 d3 d4 = 38
e1 e2 e3 = 38

a1 + b1 + c1 = 38
a2 + b2 + c2 + d1 = 38
a3 + b3 + c3 + d2 + e1 = 38
b4 + c4 + d3 + e2 = 38
c5 + d4 + e3 = 38

a3 + b4 + c5 = 38
a2 + b3 + c4 + d4 = 38
a1 + b2 + c3 + d3 + e3 = 38
b1 + c2 + d2 + e2 = 38
c1 + d1 + e1 = 38
'''

one1 = 3
one2 = 19
one3 = 16
two1 = 17
two2 = 7
two3 = 2
two4 = 12
three1 = 18
three2 = 1
three3 = 5
three4 = 4
three5 = 10
four1 = 11
four2 = 6
four3 = 8
four4 = 13
five1 = 9
five2 = 14
five3 = 15

rows = [[one1, one2, one3],[two1, two2, two3, two4],[three1, three2, three3, three4, three5],[four1, four2, four3, four4],[five1, five2, five3]]
leftdiagonal = [[one1, two1, three1],[one2, two2, three2, four1],[one3, two3, three3, four2, five1],[two4, three4, four3, five2],[three5, four4, five3]]
rightdiagonal = [[one3, two4, three5],[one2, two3, three4, four4],[one1, two2, three3, four3, five3],[two1, three2, four2, five2],[three1, four1, five1]]



iterator = 1
for list in rows:
    listsum = sum(list)
    print ("row: %d sum: %d" % (iterator, listsum))
    iterator += 1
    
print("")

iterator = 1
for list in leftdiagonal:
    listsum = sum(list)
    print("left diagonal: %d sum: %d" % (iterator, listsum))
    iterator += 1

print("")

iterator = 1
for list in rightdiagonal:
    listsum = sum(list)
    print("right diagonal: %d sum: %d" % (iterator, listsum))
    iterator += 1
