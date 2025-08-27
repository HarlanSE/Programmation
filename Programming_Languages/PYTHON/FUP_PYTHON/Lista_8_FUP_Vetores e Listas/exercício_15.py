vet = []
cont = []

for i in range(10): 
    vet.append(int(input("")))
    
for i in range(len(vet)):
    for c in range(i+1,len(vet)): 
        if vet[i] == vet[c]:
            print(vet[c])
    
    
