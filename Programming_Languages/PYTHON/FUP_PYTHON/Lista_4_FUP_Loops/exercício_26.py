def funcao(x, n):
    seno = 0
    termo = x
    fatorial = 1
    for i in range(1, 2 * n + 2, 2):
        seno += termo / fatorial
        termo *= -x * x
        fatorial *= (i + 1) * (i + 2)
    return seno