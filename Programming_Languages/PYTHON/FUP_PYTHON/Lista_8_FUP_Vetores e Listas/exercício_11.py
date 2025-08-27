vetor = []
soma = 0 

for i in range(15): 
    vetor.append(float(input("")))
    
for i in range(len(vetor)): 
    soma += vetor[i]
    
print(f"{soma/15:.2f}")