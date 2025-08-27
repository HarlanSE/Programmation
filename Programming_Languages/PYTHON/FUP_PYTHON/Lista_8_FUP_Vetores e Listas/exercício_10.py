vetor = []

for i in range(20): 
    vetor.append(int(input("")))
    
for i in range(len(vetor)): 
    if vetor[i] < 0: 
        vetor[i] = 0
        
    print(vetor[i])