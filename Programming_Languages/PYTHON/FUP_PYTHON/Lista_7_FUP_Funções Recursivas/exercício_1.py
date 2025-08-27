def funcao(n): 
    if n == 1: 
        return 1
    else:
        return n + funcao(n-1)
    
n = int(input(""))
y = funcao(n)
print(y)