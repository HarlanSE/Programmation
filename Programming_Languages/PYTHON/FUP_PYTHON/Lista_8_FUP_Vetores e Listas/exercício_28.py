vet = []
cont = 0 

while True:
    n = int(input(""))
    if n not in vet: 
        vet.append(n)
        cont += 1 
    else: 
        print(f"Numero {n} ja existe, escreva outro")
    if cont == 12: 
        break
print(vet)

