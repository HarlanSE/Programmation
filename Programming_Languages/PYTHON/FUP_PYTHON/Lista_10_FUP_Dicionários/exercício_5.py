alunos = {}

for i in range(5): 
    matricula = int(input(""))
    nome = input("")
    nota1 = float(input(""))
    nota2 = float(input(""))
    nota3 = float(input(""))
    
    alunos[matricula] = {
        "nome": nome,
        "nota1": nota1,
        "nota2": nota2,
        "nota3": nota3,
        "media": (nota1 + nota2 + nota3)/3
        
    }
    
maior_nota1 = -1
aluno_maior_nota1 = ""

for matricula, dados in alunos.items():
    if dados["nota1"] > maior_nota1:
        maior_nota1 = dados["nota1"]
        aluno_maior_nota1 = dados["nome"]
        
maior_media_geral = -1
aluno_maior_media_geral = ""

for matricula, dados in alunos.items():
    if dados["media"] > maior_media_geral:
        maior_media_geral = dados["media"]
        aluno_maior_media_geral = dados["nome"]

menor_media_geral = 99999
aluno_menor_media_geral = ""

for matricula, dados in alunos.items():
    if dados["media"] < menor_media_geral:
        menor_media_geral = dados["media"]
        aluno_menor_media_geral = dados["nome"]

print(f"Aluno {aluno_maior_nota1} tem a maior nota1: {maior_nota1:.2f}")
print(f"Aluno {aluno_maior_media_geral } tem a maior media: {maior_media_geral:.2f}")
print(f"Aluno {aluno_menor_media_geral} tem a menor media: {menor_media_geral:.2f}")

for matricula, dados in alunos.items(): 
    if dados["media"] >= 7: 
        situacao = "aprovado" 
    else: 
        situacao = "reprovado"
    print(f"Aluno {dados['nome']} esta {situacao} com media {dados['media']:.2f}")
