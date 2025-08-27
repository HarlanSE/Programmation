def simplificada(n, d):
    maior = None
    p = 0
    
    while True:
        p = 0
        maior = int(n)
        
        if d > n: 
            maior = int(d) 
            
        for i in range(2,maior+1):
            if n%i == 0:
                if d%i == 0:   
                    n = n/i   
                    d = d/i
                    p = i
        if p == 0:
            break
    return int(n),int(d)
                 
n = int(input(""))
d = int(input(""))
n, d = simplificada(n, d)
print(f"{n}")
print(f"{d}")