def funcao(n):
    
    fator = 2
    maior_primo = 0
    
    if n == 1: 
        return 1
    else: 
        while n > 1:
            if n % fator == 0:  
                maior_primo = fator
                
                while n % fator == 0:  
                    n = n // fator
            fator = fator + 1 
        
        return maior_primo

n = float(input(""))
print(funcao(n))