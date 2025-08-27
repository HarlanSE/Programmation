matriz = []

for linhas in range(5): 
    linha = []
    for colunas in range(5): 
        linha.append(int(input("")))
    matriz.append(linha)
    
val = int(input(""))
    
lin = col = None

for linhas in range(5):
    for colunas in range(5): 
        if matriz[linhas][colunas] == val: 
            lin = linhas
            col = colunas
            break
    if lin != None: 
        break

if lin == None and col == None: 
    print ("Nao encontrado")
else: 
    print(lin)
    print(col)
