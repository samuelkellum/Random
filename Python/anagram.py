a = input("Please enter text: ")
b = input("Please enter text: ")

punct = ''' !()-[]{};:'“"”\,<>./?@#$%^&*_~'''
string1 = ""
string2 = ""

for char in a:
    if char in punct:
        string1 = string1
    else:
        string1 += char

for char in b:
    if char in punct:
        string2 = string2
    else:
        string2 += char

string1 = string1.lower()
string2 = string2.lower()

string1dict = {"a": 0, "b": 0, "c:": 0, "d": 0, "e": 0, "f": 0, "g": 0, "h": 0, "i": 0, "j": 0, "k": 0, "l": 0, "m": 0, "n": 0, "o": 0, "p": 0, "q": 0, "r": 0, "s": 0, "t": 0, "u": 0, "v": 0, "w": 0, "x": 0, "y": 0, "z": 0}
string2dict = {"a": 0, "b": 0, "c:": 0, "d": 0, "e": 0, "f": 0, "g": 0, "h": 0, "i": 0, "j": 0, "k": 0, "l": 0, "m": 0, "n": 0, "o": 0, "p": 0, "q": 0, "r": 0, "s": 0, "t": 0, "u": 0, "v": 0, "w": 0, "x": 0, "y": 0, "z": 0}
for char in string1:
    string1dict[char] = string1dict.get(char) + 1

for char in string2:
    string2dict[char] = string2dict.get(char) + 1

