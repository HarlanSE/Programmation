def funcao(data): 
    meses = ["janeiro", "fevereiro", "marco", "abril", "maio", "junho","julho", "agosto", "setembro", "outubro", "novembro", "dezembro"]
    
    dia = int(data[:2]) 
    mes = int(data[3:5]) 
    ano = int(data[6:])  
    
    if 1 <= mes <= 12:  
        mes_extenso = meses[mes - 1]
        return f"{dia} de {mes_extenso} de {ano}"

# data = input("")
# print(funcao(data))