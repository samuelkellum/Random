string = input("Please enter a string: ")
string_result = ""
punct = ''' !()-[]{};:'“"”\,<>./?@#$%^&*_~'''
for char in string:
    if char in punct:
        string_result = string_result
    else:
        string_result = string_result + char
        
string_result = string_result.lower()

j = len(string_result) - 1

for i in range(int(len(string_result)//2)):
    x = string_result[i]
    y = string_result[j]
    fail_count = 0
    if x == y:
        fail_count = fail_count
    else:
        fail_count += 1
    j -= 1 

if fail_count == 0:
    print (True)
else:
    print (False)
        
