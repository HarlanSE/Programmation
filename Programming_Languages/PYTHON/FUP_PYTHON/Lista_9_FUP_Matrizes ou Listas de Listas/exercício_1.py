matriz = []
cont = 0

for qtd_linha in range(4): 
    linha = []
    for qtd_coluna in range(4):
        n = int(input(""))
        linha.append(n)
    matriz.append(linha)
    
for qtd_linha in range(4): 
    for qtd_coluna in range(4): 
       if matriz[qtd_linha][qtd_coluna] > 10: 
           cont += 1
        
print(cont)