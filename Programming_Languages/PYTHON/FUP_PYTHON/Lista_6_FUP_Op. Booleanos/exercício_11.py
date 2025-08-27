def funcao(data): 
    dia = data[0] + data[1]
    mes = data[3]+ data[4]
    ano = data[6] + data[7] + data[8] + data[9]
    
    new_data = dia + mes + ano 
    if "/" in new_data or "a" in new_data: 
        return 0,0,0
    else: 
        return int(dia), int(mes), int(ano)
        