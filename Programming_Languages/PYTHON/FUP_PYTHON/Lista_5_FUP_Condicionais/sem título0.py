c = 0   
maior = None    
menor = None

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
        
if maior != None:  
    if menor != None:
        
        print(maior)    
        print(menor)