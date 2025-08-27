def funcao(salario):
    novosalario = salario + (salario * 0.2137)
    return novosalario

salario = float(input(""))

novosalario = funcao(salario)

print (f"{novosalario:.2f}")
