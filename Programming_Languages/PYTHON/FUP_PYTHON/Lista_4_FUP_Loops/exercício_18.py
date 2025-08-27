def funcao(n):
    fatorial = 1
    soma = 0 
    
    for i in range(1, n+1):
        fatorial = fatorial * i
    for i in range(50):
        soma = soma + (fatorial%10)
        fatorial = fatorial//10
        
    return soma+fatorial

