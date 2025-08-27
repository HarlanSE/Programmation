str1 = str(input(""))
for c in range(len(str1)):
    letra = ord(str1[c])+1
    print(chr(letra),end = "")