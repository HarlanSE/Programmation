def funcao(numero):
    milhar = numero // 1000 
    centena = (numero // 100) % 10
    dezena = (numero // 10) % 10 
    unidade = numero % 10
    return milhar, centena, dezena, unidade