vetor = []
cont = 0 
vetor_par = []

for i in range(15): 
    vetor.append(int(input("")))
    
for i in range(len(vetor)): 
    if vetor[i] % 2 == 0: 
        vetor_par.append(vetor[i])
        cont += 1 
        
print(cont)

for i in range(len(vetor_par)):
    print(vetor_par[i])
        
"""vetor = []
cont = 0 

for i in range(15): 
    vetor.append(float(input("")))
    
for i in range(len(vetor)): 
    if vetor[i] % 2 == 0: 
        cont += 1 
        print(f"{vetor[i]:.2f}")"""