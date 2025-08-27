lista = []

for i in range(5): 
    nom = str(input())
    end = str(input())
    tel = str(input())

    pessoa = {
        'nome': nom,
        'endereco': end,
        'telefone': tel
               }
    lista.append(pessoa)
    
for i in range(4):
        for j in range(4 - i):
            if lista[j]['nome'] > lista[j + 1]['nome']:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]

    
for pessoa in lista: 
    print(pessoa)
                