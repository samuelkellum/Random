def factorial(number):
    if number < 0:
        print("Fuck you")
    elif number == 0 or number == 1:
        return 1
    else:
      return number * factorial(number - 1)

def fibonacci(n):
    if n < 0:
        print("Fuck you")
    elif n == 0:
        return 0
    elif n == 1:
        return 1
    elif n == 2:
        return 1
    else:
       return fibonacci(n-1) + fibonacci(n-2)


print(factorial(10))
print(fibonacci(10))
print(fibonacci(20))
print(fibonacci(30))
print(fibonacci(40))


         
