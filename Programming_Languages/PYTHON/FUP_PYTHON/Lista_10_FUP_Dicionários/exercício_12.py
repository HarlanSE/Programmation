alunos = []

for i in range(10): 
    nome = input("")
    matricula = int(input(""))
    media = float(input(""))
    
    aluno = {
        'nome': nome,
        'matricula': matricula, 
        'media': media
              }
    alunos.append(aluno)

aprovados = []
reprovados = []

for aluno in alunos: 
    if aluno['media'] >= 5: 
        aprovados.append(aluno)
    else: 
        reprovados.append(aluno)

for i in range(len(aprovados)): 
    print(aprovados[i])
    
for j in range(len(reprovados)): 
    print(reprovados[j])