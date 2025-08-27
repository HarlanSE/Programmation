def funcao(x):
    s = 0
    for c in range(1,x+1):
        s = s+(c**2+1)/(c+3)
    return s  