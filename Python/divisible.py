x = 0
for i in range(1, 61):
    if (i % 4 == 0) or (i % 5 == 0) or (i % 3 == 0):
        x += 1
print(x)
