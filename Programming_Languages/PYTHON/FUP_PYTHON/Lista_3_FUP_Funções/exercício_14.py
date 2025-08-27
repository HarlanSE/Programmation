def funcao(numero):
    unidade = numero % 10 
    dezena = (numero // 10) % 10 
    centena = numero // 100 
    numero_inverso = (unidade * 100) + (dezena * 10) + centena
    return numero_inverso
