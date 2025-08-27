import math 
c = 1 
while c == 1: 
    n = float(input(""))
    
    if n <= 0: 
        break 
    
    print(f"{n**2:.2f}")
    print(f"{n**3:.2f}")
    print(f"{math.sqrt(n):.2f}")
    
    