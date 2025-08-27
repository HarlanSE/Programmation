carros = {}

for i in range(5): 
    modelo = input("")
    consumo = float(input(""))
    carros[modelo] = consumo

kml = 0
eco = ""

for modelo in carros: 
    consumo = carros[modelo]
    if consumo > kml:
        kml = consumo
        eco = modelo

print(f"Carro mais economico: {eco}")

for modelo, consumo in carros.items():
    print(f"Carro {modelo} percorre {consumo * 50:.2f} kms com 50 litros")

for modelo, consumo in carros.items():
    print(f"Carro {modelo} precisa de {1000 / consumo:.2f} litros para percorrer 1000 kms")




