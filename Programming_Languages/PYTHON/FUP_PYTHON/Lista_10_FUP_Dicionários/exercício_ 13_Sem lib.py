def validar_data_nascimento(data):
    if len(data) != 10 or data[2] != '/' or data[5] != '/':
        return False
    
    dia, mes, ano = data[:2], data[3:5], data[6:]
    
    if not (dia.isdigit() and mes.isdigit() and ano.isdigit()):
        return False
    
    dia, mes, ano = int(dia), int(mes), int(ano)
    
    if mes < 1 or mes > 12 or dia < 1 or dia > 31:
        return False
    
    if mes in {4, 6, 9, 11} and dia > 30:
        return False
    
    if mes == 2:
        bissexto = (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)
        if (bissexto and dia > 29) or (not bissexto and dia > 28):
            return False
    
    return True

def validar_cep(cep):
    if len(cep) != 10 or cep[2] != '.' or cep[6] != '-':
        return False
    
    parte1, parte2, parte3 = cep[:2], cep[3:6], cep[7:]
    
    return parte1.isdigit() and parte2.isdigit() and parte3.isdigit()

def validar_email(email):
    if '@' not in email or '.' not in email:
        return False
    
    partes = email.split('@')
    if len(partes) != 2 or not partes[0] or not partes[1]:
        return False
    
    dominio = partes[1].split('.')
    if len(dominio) < 2 or not dominio[-1]:
        return False
    
    return True

def obter_dados():
    dados = {}
    dados["nome"] = input()
    dados["endereco"] = input()
    dados["nascimento"] = input()
    dados["cidade"] = input()
    dados["cep"] = input()
    dados["email"] = input()
    return dados

def verificar_dados(dados):
    if not validar_data_nascimento(dados["nascimento"]):
        print("Data errada")
        return
    
    if not validar_cep(dados["cep"]):
        print("CEP errado")
        return
    
    if not validar_email(dados["email"]):
        print("E-mail errado")
        return
    
    print(dados)

if __name__ == "__main__":
    dados_usuario = obter_dados()
    verificar_dados(dados_usuario)
