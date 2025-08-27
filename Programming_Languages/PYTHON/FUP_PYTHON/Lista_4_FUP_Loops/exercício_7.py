def funcao(n): 
    soma = 0 
    
    for c in range (1, n+1):
        soma = soma + c 
    return soma

n = int(input(""))
   
soma = funcao(n)

print (soma)