def ler_carro():
    modelo = input()
    ano = int(input())
    preco = float(input())
    return {'modelo': modelo, 'ano': ano, 'preco': preco}

carros = []

for i in range(5):
    carro = ler_carro()
    carros.append(carro)

while True:
    p = float(input())
    if p == 0:
        break
    
    for carro in carros:
        if carro['preco'] < p:
            print(carro)
