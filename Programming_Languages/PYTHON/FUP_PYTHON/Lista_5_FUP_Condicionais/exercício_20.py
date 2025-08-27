import math
def funcao(x): 
    raiz = math.sqrt(x)
    print(raiz, raiz**2)
    
    if raiz ** 2 == x: 
        return True 
    
    if raiz ** 2 != x: 
        return False
    
x = float(input(""))
y = funcao(x)
print(y)