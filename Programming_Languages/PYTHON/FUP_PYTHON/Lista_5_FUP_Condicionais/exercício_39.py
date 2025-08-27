string1 = input("")
string2 = input("")

tamanho1 = len(string1)
tamanho2 = len(string2)

for c in range(min(tamanho1, tamanho2)):
   
    if ord(string1[c]) < ord(string2[c]):
        print(string1)
        break
   
    elif ord(string1[c]) > ord(string2[c]):
        print(string2)
        break
else:
    
    if tamanho1 < tamanho2:
        print(string1)
    else:
        print(string2)
