nome = input("")
vet_nome = [nome]
vet = []
qtd = 0 
for i in range(len(nome)): 
    if vet_nome[0][i] not in vet and vet_nome[0][i] != " " and vet_nome[0][i] != "-":  
     vet.append(vet_nome[0][i])   
     qtd += 1 
print(qtd)

# satierf arievilo sokram