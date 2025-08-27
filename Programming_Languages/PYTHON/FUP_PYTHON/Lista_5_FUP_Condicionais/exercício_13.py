import math

a = float(input(""))
b = float(input(""))
c = float(input(""))

delta = b**2 - 4 * a * c 

if a == 0: 
    print("Nao eh equacao do 2o grau")
    
elif delta < 0 :
    print("Nao existe raiz real")
    
elif delta == 0: 
    print(f"{(-b + math.sqrt(delta))/(2*a):.2f}")
    print("Raiz unica")
    
elif delta > 0 :
    print(f"{(-b + math.sqrt(delta))/(2*a):.2f}")
    print(f"{(-b - math.sqrt(delta))/(2*a):.2f}")



