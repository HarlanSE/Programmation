string1 = str(input("")).upper()
string2 = ""

# Remover caracteres indesejados
for c in range(len(string1)):
    car = string1[c]
    if car != " ":
        if car != ".":
            if car != "-":
                if car != ",":
                    string2 += car

cont = -1
r = 0

# Verificar se a string2avra é um string2índromo
for c in range(len(string2)):
    if string2[c] == string2[cont]:
        r += 1
    cont -= 1

# Comparar se o número de correspondências é igual ao comprimento da string processada
if r == len(string2):
    print(True)
else:
    print(False)