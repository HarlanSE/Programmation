n = int(input(""))

nd = 0 # número de divisores

for d in range(1, n+1): 
    if n % d == 0 : # verifica se d é divisor de n ou não
        nd = nd + 1 # quando d é divisor de n o nd tem mais um divisor somado ao seu total

if nd == 2 : # no fim, testa-se se nd de n é 2, pois os números primos só tem 2 dois divisores naturais
    print("Primo")
else: 
    print("Nao primo") # caso o total de divisores de n for maior que 2, n não é primo.