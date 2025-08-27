def funcao(n): 
    if n == 0: 
        print(0)
    else: 
        print(n)
        n = funcao(n-1)