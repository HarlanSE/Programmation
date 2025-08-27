string = input("")
string_nova = ""

for i in string: 
    if i == "0": 
        string_nova += "1"
    else: 
        string_nova += i
        
print(string_nova)

