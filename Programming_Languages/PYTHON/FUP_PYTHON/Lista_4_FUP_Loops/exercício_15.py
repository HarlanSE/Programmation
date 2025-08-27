def funcao(n):
    hn = 1  
    fatorial = 1  
    for i in range(1, n + 1):
        fatorial *= i  
        hn += 1 / fatorial  
    return hn   
