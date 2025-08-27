saque = float(input())

qtd100 = saque // 100
resto = saque - qtd100 * 100

qtd50 = resto // 50 
restoB = resto - qtd50 * 50

qtd20 = restoB // 20 
restoC = restoB - qtd20 * 20

qtd10 = restoC // 10 
restoD = restoC - qtd10 * 10

qtd5 = restoD // 5 
restoE = restoD - qtd5 * 5

qtd2 = restoE // 2 
restoF = restoE - qtd2 * 2

qtd1 = restoF // 1

print(f"{qtd100:.0f}")
print(f"{qtd50:.0f}")
print(f"{qtd20:.0f}")
print(f"{qtd10:.0f}")
print(f"{qtd5:.0f}")
print(f"{qtd2:.0f}")
print(f"{qtd1:.0f}")

