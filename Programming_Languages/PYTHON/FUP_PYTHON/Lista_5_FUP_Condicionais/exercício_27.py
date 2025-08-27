x = int(input(""))
maior = 1
menor = 1

for i in range(x): 
    n = float(input(""))
    
    if i == 0: 
        maior = n 
        menor = n 
    
    if n > maior : 
        maior = n 
    if n < menor: 
        menor = n 
  
print(f"{menor:.2f}")      
print(f"{maior:.2f}")