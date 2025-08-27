op = 0 

while op != 5: 
    print("1 - Adicao")
    print("2 - Subtracao")
    print("3 - Multiplicacao")
    print("4 - Divisao")
    print("5 - Saida")
    
    op = int(input("escolha a operação que deseja realizar: "))
    if 1 <= op <= 5: 
        
        if op == 5: 
            break
        
        n1 = float(input("digite um número: "))
        n2 = float(input("digite outro número: "))
        
        if op == 1: 
            print(f"{n1:.2f} + {n2:.2f} = {n1 + n2:.2f}")
        elif op == 2: 
            print(f"{n1:.2f} - {n2:.2f} = {n1 - n2:.2f}")
        elif op == 3: 
            print(f"{n1:.2f} x {n2:.2f} = {n1 * n2:.2f}")
        elif op == 4: 
            print(f"{n1:.2f} / {n2:.2f} = {n1 / n2:.2f}")
    else: 
        print("opção inválida, tente novamente")
        
