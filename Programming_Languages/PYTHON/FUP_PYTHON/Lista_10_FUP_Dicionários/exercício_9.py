nome = str(input(""))
idade = int(input(""))
sexo = str(input(""))
cpf = str(input(""))
data_nasc = str(input("")) 
setor = int(input(""))
cargo  = str(input(""))
sal = float(input(""))

func = {
        'nome': nome, 
        'idade': idade, 
        'sexo': sexo,
        'cpf': cpf,
        'nascimento': data_nasc,
        'setor': setor,
        'cargo': cargo,
        'salario': sal
        }

print(func)
# Nome, Idade, Sexo (M/F), CPF, Data de Nascimento,
#  Código do Setor onde trabalha (0-99),
#  Cargo que ocupa (string de até 30 caracteres) e Salário.