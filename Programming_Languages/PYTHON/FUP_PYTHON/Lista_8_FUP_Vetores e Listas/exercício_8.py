vetor = []
soma = 0
vetor_impar = []

for i in range(15): 
    vetor.append(int(input("")))
    
for i in range(len(vetor)): 
    if vetor[i] % 2 != 0: 
        vetor_impar.append(vetor[i])
        soma += vetor[i]
        
print(soma)

for i in range(len(vetor_impar)):
    print(vetor_impar[i])