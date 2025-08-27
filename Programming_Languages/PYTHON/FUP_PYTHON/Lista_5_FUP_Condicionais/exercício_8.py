for i in range(4):
    n1 = int(input(""))
    n2 = int(input(""))
    etapa = int(input(""))

    if etapa == 1: 
        print(f"{(n1+n2)/2:.2f}")
        
    elif etapa == 2: 
        if n1 > n2: 
            print(f"{n1 - n2:.2f}")
        else: 
            print(f"{n2 - n1:.2f}")
            
    elif etapa == 3: 
        print(f"{n1 * n2:.2f}")
    
    elif etapa == 4:
        if n2 != 0: 
            print(f"{n1/n2:.2f}")
        else: 
            print("Erro")
    else:
        print("Erro")