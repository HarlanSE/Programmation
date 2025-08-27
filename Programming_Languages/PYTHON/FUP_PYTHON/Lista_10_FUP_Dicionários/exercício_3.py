alunos = []


qtd_alu = int(input(""))

for i in range(qtd_alu): 
    nome = str(input(""))
    matricula = int(input(("")))
    curso = str(input(""))
    
    aluno = {
             'nome': nome, 
             'matricula': matricula,
             'curso': curso
             }
    
    alunos.append(aluno)
    
for aluno in alunos: 
    print(aluno)
    
# 2
# Markos Freitas
# 123456
# Ciencia da Computacao
# Esequiel Mesquita
# 123789
# Engenharia Civil