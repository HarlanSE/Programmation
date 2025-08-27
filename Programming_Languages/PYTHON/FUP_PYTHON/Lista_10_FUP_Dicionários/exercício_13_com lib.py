import re

def validar_data_nascimento(data):
    padrao = r"^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\d{4}$"
    return bool(re.match(padrao, data))

def validar_cep(cep):
    padrao = r"^\d{2}\.\d{3}-\d{3}$"
    return bool(re.match(padrao, cep))

def validar_email(email):
    padrao = r"^[\w\.-]+@[\w\.-]+\.\w{2,}$"
    return bool(re.match(padrao, email))

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