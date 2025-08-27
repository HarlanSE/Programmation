# Definindo os tipos de dados
class Data:
    def __init__(self, dia, mes, ano):
        self.dia = dia
        self.mes = mes
        self.ano = ano

    def to_dict(self):
        return {"dia": self.dia, "mes": self.mes, "ano": self.ano}

class Horario:
    def __init__(self, hora, minuto, segundo):
        self.hora = hora
        self.minuto = minuto
        self.segundo = segundo

    def to_dict(self):
        return {"hora": self.hora, "minuto": self.minuto, "segundo": self.segundo}

class Compromisso:
    def __init__(self, data, horario, descricao):
        self.data = data
        self.horario = horario
        self.descricao = descricao

    def to_dict(self):
        return {
            "data": self.data.to_dict(),
            "horario": self.horario.to_dict(),
            "descricao": self.descricao,
        }

# Função para comparar datas
def data_antes(data1, data2):
    if data1.ano < data2.ano:
        return True
    elif data1.ano == data2.ano:
        if data1.mes < data2.mes:
            return True
        elif data1.mes == data2.mes:
            if data1.dia < data2.dia:
                return True
    return False

# Função para comparar horários
def horario_antes(horario1, horario2):
    if horario1.hora < horario2.hora:
        return True
    elif horario1.hora == horario2.hora:
        if horario1.minuto < horario2.minuto:
            return True
        elif horario1.minuto == horario2.minuto:
            if horario1.segundo < horario2.segundo:
                return True
    return False

# Função para ordenar compromissos
def ordenar_compromissos(compromissos):
    return sorted(
        compromissos,
        key=lambda x: (
            x.data.ano,
            x.data.mes,
            x.data.dia,
            x.horario.hora,
            x.horario.minuto,
            x.horario.segundo,
        ),
    )

# Leitura dos compromissos
n = int(input())
compromissos = []

for _ in range(n):
    print("Dia: ", end="")
    dia = int(input())
    print("Mes: ", end="")
    mes = int(input())
    print("Ano: ", end="")
    ano = int(input())
    data = Data(dia, mes, ano)

    print("Hora: ", end="")
    hora = int(input())
    print("Minuto: ", end="")
    minuto = int(input())
    print("Segundo: ", end="")
    segundo = int(input())
    horario = Horario(hora, minuto, segundo)

    print("Descricao: ", end="")
    descricao = input().strip()
    compromisso = Compromisso(data, horario, descricao)
    compromissos.append(compromisso)

# Ordenando os compromissos por data e horário
compromissos_ordenados = ordenar_compromissos(compromissos)

# Exibindo os compromissos no formato solicitado
for compromisso in compromissos_ordenados:
    print(compromisso.to_dict())