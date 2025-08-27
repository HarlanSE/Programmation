maior = menor = None 
vetor = []

for i in range(10): 
    vetor.append(int(input("")))
    
    maior = menor = vetor[i]
    
for i in range(len(vetor)):
    if vetor[i] > maior: 
        maior = vetor[i]
    elif vetor[i] < menor:
        menor = vetor[i]
        
print(maior)
print(menor)