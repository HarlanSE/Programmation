def ler_livro():
    titulo = input()
    autor = input()
    ano = int(input())
    return {'titulo': titulo, 'autor': autor, 'ano': ano}

def buscar_livros(titulo_busca, livros):
    encontrados = []
    for livro in livros:
        if titulo_busca.lower() in livro['titulo'].lower():
            encontrados.append(livro)
    return encontrados

livros = []

for i in range(5):
    livro = ler_livro()
    livros.append(livro)

titulo_busca = input()

livros_encontrados = buscar_livros(titulo_busca, livros)

for livro in livros_encontrados:
    print(livro)
