numero = int(input())

milhar = numero // 1000 
centena = (numero // 100) % 10
dezena = (numero // 10) % 10 
unidade = numero % 10

print (milhar)
print (centena)
print (dezena)
print (unidade)