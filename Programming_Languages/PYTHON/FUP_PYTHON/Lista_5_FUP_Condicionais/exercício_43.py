velho = novo = ""
idadev = idaden = idade = 0 
c = 0 

while  True:
    
    nome = str(input(""))
    idade = int(input(""))
    
    if idade < 0: 
        break 
    
    if c == 0: 
        idaden = idadev = idade 
        novo = velho = nome   
        c += 1  
        
    if idade < idaden:
        idaden = idade
        novo = nome
    
    if idade > idadev: 
        idadev = idade
        velho = nome
        
print(novo)
print(idaden)
print(velho)
print(idadev)