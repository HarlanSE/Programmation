def funcao(tempo_total_segundos):
    horas = tempo_total_segundos // 3600
    resto = tempo_total_segundos % 3600
    minutos = resto // 60
    segundos = resto % 60
    return horas, minutos, segundos 
