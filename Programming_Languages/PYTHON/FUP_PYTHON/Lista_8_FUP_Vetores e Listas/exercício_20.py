vet = []

for i in range(100):
    vet.append(float(input("")))    
while True: 
    opcao = int(input(""))
    
    if opcao == 0: 
        break 
    
    elif opcao == 1: 
        for i in range(len(vet)): 
            print(vet[i])
            
    elif opcao == 2: 
        for c in range(len(vet)+1): 
            if c != 0: 
                print(vet[-c])
    
    else: 
        print("Codigo invalido")
    

   
   