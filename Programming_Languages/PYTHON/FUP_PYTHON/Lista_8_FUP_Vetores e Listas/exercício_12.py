def funcao(vetor):
    soma = cont = 0 
    tam = len(vetor)
    
    for i in range(tam): 
        soma += vetor[i]
        
    media = soma/tam
    
    for i in range(tam): 
        cont += (vetor[i]-media)**2
    dp = (cont/tam)**(1/2)
    return media, dp

vetor = []

for i in range(15):
    vetor.append(float(input("")))
    
media, dp = funcao(vetor)

print(f"{media:.2f}")
print(f"{dp:.2f}")


"""vvvvv
"""
"""vetor = []
soma = cont = 0 

for i in range(15): 
    vetor.append(float(input("")))
    
tam = len(vetor)

for i in range(tam): 
    soma += vetor[i]
    
media = soma/tam

for i in range(tam): 
    cont += (vetor[i]-media)**2
    
print(f"{media:.2f}")
print(f"{(cont/len())**(1/2):.2f}")"""