string = str(input(""))
new_string = ""
caractere = input("")
contador = 0 

for i in range (len(string)): 
    if string[i] in "aeiouAEIOU":
       new_string += caractere
       contador += 1 
    else: 
        new_string += string[i]
     
print(contador)
print(new_string)


"""
string = str(input(""))
new_string = ""
caractere = input("")
contador = 0 

for i in string: 
    if i == "a" or  i == "e" or i == "i" or i == "o" or i == "u":
        new_string += f"{caractere}"
        contador += 1
    else: 
        new_string += i
        
print(new_string)
print(contador)
"""