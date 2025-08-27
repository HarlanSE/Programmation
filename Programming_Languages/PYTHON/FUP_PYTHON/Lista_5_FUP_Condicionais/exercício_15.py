n = int(input(""))
soma_divisores = 0 

for divisor in range(1, n):
    if n % divisor == 0:
        soma_divisores = soma_divisores + divisor 
        
print(soma_divisores)
    