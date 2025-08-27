c = 0   
maior = 0
menor = 0

while True:   
    n = int(input(""))
    
    if n < 0:  
        break
    
    if c == 0:  
        maior = n
        menor = n
        
        c = c + 1 
        
    if n > maior:  
        maior = n
        
    if n < menor:  
        menor = n
        
if maior != 0:  
    if menor != 0:
        
        print(maior)    
        print(menor)