soma = 0 
c = 0
 
while c != 10:
    n = float(input(""))
 
    if n > 0: 
        soma = soma + n
        c = c + 1 
   
print(f"{(soma/c):.2f}")
        
