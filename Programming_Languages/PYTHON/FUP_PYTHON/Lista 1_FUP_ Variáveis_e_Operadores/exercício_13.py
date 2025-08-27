numero = int(input())

unidade = numero % 10 
dezena = (numero // 10) % 10 
centena = numero // 100 

numero_inverso = (unidade * 100) + (dezena * 10) + centena
print(numero_inverso)