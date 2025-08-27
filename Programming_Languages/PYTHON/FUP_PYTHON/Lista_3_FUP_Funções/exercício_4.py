def funcao(n):
    antecessor = n - 1 
    sucessor = n + 1 
    return antecessor, sucessor 

n = int(input(""))

antecessor, sucessor = funcao(n)

print(antecessor)
print(sucessor)