x = int(input(""))
maior = 0
qm = 0 

for i in range(x):
    n = int(input(""))
    
    if i == 0: 
        maior = n 
        qm = 1
        
    if n > maior: 
        maior = n 
        qm = 1 
        
    if n == maior: 
        qm = qm + 1 
        
print(maior)
print(qm-1)