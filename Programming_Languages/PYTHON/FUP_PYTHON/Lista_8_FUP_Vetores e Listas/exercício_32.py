
alunos  = []  
op = "S" 

while True: 
    if op == "N":   
        break   
    
    nome = str(input("Aluno: "))   
    alunos.append(nome)  
    if len(alunos) == 5: 
        break
    op = str(input("Deseja inserir novo aluno? [S/N] ")).upper() 
pesquisa = str(input("Aluno para pesquisa: "))      
for c in range(len(alunos)):  
    if pesquisa in alunos[c]:    
        print(alunos[c])    
        print(c)
