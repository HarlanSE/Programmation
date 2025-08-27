import math

# Funcao para somar dois numeros complexos
def soma_complexos(z, w):
    return {'real': z[0] + w[0], 'imaginario': z[1] + w[1]}

# Funcao para subtrair dois numeros complexos
def subtracao_complexos(z, w):
    return {'real': z[0] - w[0], 'imaginario': z[1] - w[1]}

# Funcao para multiplicar dois numeros complexos
def produto_complexos(z, w):
    real = z[0] * w[0] - z[1] * w[1]
    imaginario = z[0] * w[1] + z[1] * w[0]
    return {'real': real, 'imaginario': imaginario}

# Funcao para calcular o modulo de um numero complexo
def modulo_complexo(z):
    return math.sqrt(z[0]**2 + z[1]**2)

# Funcao para ler um numero complexo
def ler_complexo():
    real = float(input())
    imaginario = float(input())
    return (real, imaginario)

# Leitura dos numeros complexos
z = ler_complexo()
w = ler_complexo()

# Operacoes e resultados
soma = soma_complexos(z, w)
subtracao = subtracao_complexos(z, w)
produto = produto_complexos(z, w)
modulo_z = modulo_complexo(z)
modulo_w = modulo_complexo(w)

# Exibindo os resultados
print(soma)
print(subtracao)
print(produto)
print(f"{modulo_z:.2f}")
print(f"{modulo_w:.2f}")
