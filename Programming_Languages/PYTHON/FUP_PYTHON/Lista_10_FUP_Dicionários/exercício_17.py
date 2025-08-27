# Leitura dos eletrodomésticos
eletrodomesticos = []
for i in range(5):
    nome = input().strip()
    potencia = float(input())
    tempo_ativo = float(input())
    eletrodomesticos.append([nome, potencia, tempo_ativo])

# Leitura do tempo t (em dias)
t = int(input())

# Cálculo do consumo total
consumo_total = 0
for eletrodomestico in eletrodomesticos:
    consumo_total += eletrodomestico[1] * eletrodomestico[2] * t

# Exibindo o consumo total
print(f"{consumo_total:.2f}")

# Cálculo e exibição do consumo relativo de cada eletrodoméstico
for eletrodomestico in eletrodomesticos:
    consumo = eletrodomestico[1] * eletrodomestico[2] * t
    percentual = (consumo / consumo_total) * 100
    print(f"{eletrodomestico[0]}: {percentual:.2f}")
