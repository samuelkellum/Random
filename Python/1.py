
num = int(input("Enter number: "))
prime_check = 0
prime_count = 0

if num = 1:
    

for x in range(num-1,1,-1):
    prime_check = num % x
    if prime_check == 0:
          prime_count += 1

if prime_count == 0:
    print ("Number", num, "is prime.")
else:
    print ("Number", num, "is not prime.")
