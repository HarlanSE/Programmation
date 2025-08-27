string = str(input(""))
string_inv = ""

for i in string: 
    if i == "a":
        string_inv += "*"
        
    elif i == "A":
        string_inv += "*"
        
    else: 
        string_inv += i
print(string_inv[::-1])

