""" Name: Samuel Kellum
    Date: January 17, 2020
    This program generates computer account names.
"""

#print a message that greets the user and explains what the program is doing
print ("Welcome! This program generates your username.")

#input user's first name and store it in a variable
first = input("Enter your first name: ")

#input the user's last name and store it in  variable
last = input("Enter your last name: ")

#concatenate (join) first initial with 7 characters of the last name
username= first[0] + last[0:7]

#converts username to all lowercase letters
username = username.lower()

#output the account name
print(username)
