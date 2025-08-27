def funcao(x):
    p1 = 1
    p2 = 1
    pn = 1 
    for c in range(3,x+1):
        p1 = p2
        p2 = pn
        pn = p1+p2 
    return pn   
