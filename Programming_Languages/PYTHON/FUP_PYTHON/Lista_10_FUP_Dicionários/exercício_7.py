alunos = []


qtd_alu = int(input(""))

for i in range(qtd_alu): 
    matricula = int(input(""))
    nome = str(input(""))
    cod = str(input(""))
    n1 = float(input(""))
    n2 = float(input(""))
    
    aluno = {
             'matricula': matricula,
             'nome': nome, 
             'codigo': cod, 
             'nota1': n1, 
             'nota2': n2,
             'media': ((n1*1.0)+(n2*2.0))/3.0
             }
    
    alunos.append(aluno)
    
for aluno in alunos: 
    print(aluno)
    
