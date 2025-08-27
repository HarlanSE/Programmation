def funcao(n):
    fat = 1  
    for c in range(2, n + 1):  
        fat = c ** fat
    
    return fat  