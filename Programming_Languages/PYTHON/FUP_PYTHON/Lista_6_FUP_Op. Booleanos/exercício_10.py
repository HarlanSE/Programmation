def funcao(n1, n2): 
    maior = mdc = None

    if n1 > n2: 
        maior = n1 
    else: 
        maior = n2 
    
    for i in range(1, maior+1): 
        if n1 % i == 0 and n2 % i == 0:
            mdc = i
    return mdc