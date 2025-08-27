n = int(input(""))
soma = 0

for d in range(1, n): 
    if n % d == 0: 
        soma += d 
        
if soma == n: 
    print("Perfeito")
else: 
    print("Nao perfeito")
    
