string = str(input(""))
nova_string = ""

for i in string: 
    if i == "a" or i == "e" or i == "i" or i == "o" or i == "u" or i == "A" or i == "E" or i == "I" or i == "O" or i == "U":
        nova_string += ""
    else: 
        nova_string += i
        
print(nova_string)


"""
string = str(input(""))
nova_string = ""
for i in range(len(string)):
    if string[i] in "aeiou" or string[i] in "AEIOU":
         nova_string += "" 
    else:
        nova_string += string[i]   
print(res)
"""
        