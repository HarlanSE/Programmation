n1 = int(input(""))
n2 = int(input(""))
soma = 0 
produto = 1 

if n1 > n2: 
    fim = n1
    inicio = n2 
else: 
    fim = n2 
    inicio = n1 
    
for i in range(inicio, fim+1):
    
    if i % 2 == 0:
        soma = soma + i 
    else: 
        produto = produto * i
        
print(soma)
print(produto)