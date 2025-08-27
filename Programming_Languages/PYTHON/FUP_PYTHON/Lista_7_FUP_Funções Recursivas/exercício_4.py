def funcao(n, k): 
    if k == 0: 
        return 1 
    elif k == 1: 
        return n 
    else: 
        return n*funcao(n, k-1)

n = int(input(""))
k = int(input(""))
y = funcao(n, k)
print(y)