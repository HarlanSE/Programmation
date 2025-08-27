def funcao(x):
   
    dia = int(x[:2])
    mes = int(x[3:5])
    ano = int(x[6:])

    if mes == 1:
        mes_extenso = "janeiro"
    elif mes == 2:
        mes_extenso = "fevereiro"
    elif mes == 3:
        mes_extenso = "marco"
    elif mes == 4:
        mes_extenso = "abril"
    elif mes == 5:
        mes_extenso = "maio"
    elif mes == 6:
        mes_extenso = "junho"
    elif mes == 7:
        mes_extenso = "julho"
    elif mes == 8:
        mes_extenso = "agosto"
    elif mes == 9:
        mes_extenso = "setembro"
    elif mes == 10:
        mes_extenso = "outubro"
    elif mes == 11:
        mes_extenso = "novembro"
    else:  
        mes_extenso = "dezembro"

    return f"{dia} de {mes_extenso} de {ano}"

x = str(input(""))
print(funcao(x))
