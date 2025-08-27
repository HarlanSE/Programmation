def funcao(vetor):
    soma = cont = 0 
    tam = len(vetor)
    
    for i in range(tam): 
        soma += vetor[i]
        
    media = soma/tam
    
    for i in range(tam): 
        cont += (vetor[i]-media)**2
    dp = (cont/tam)**(1/2)
    
    menor_sete = 0
    
    for i in range(tam): 
        if vetor[i] < 7 :
             menor_sete += 1 
        
    return media, dp, menor_sete
    
    
"""vetor = []
for i in range(15):
    vetor.append(float(input("")))
media, dp, menor_sete = funcao(vetor)
print(f"{media:.2f}")
print(f"{dp:.2f}")
print(f"{menor_sete}")"""