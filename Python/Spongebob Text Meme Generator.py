import random

x=input("Please enter text: ")
y=random.randint(0,1)
if y == 0:
    print(''.join([x[i].lower()if i%2==0 else x[i].upper()for i in range(len(x))]))
else:
    print(''.join([x[i].upper()if i%2==0 else x[i].lower()for i in range(len(x))]))
