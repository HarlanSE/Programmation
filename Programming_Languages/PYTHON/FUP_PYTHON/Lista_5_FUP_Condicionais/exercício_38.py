def funcao(x1,x2): 
    controle = 0 
    if len(x1) == len(x2): 
        for i in range(len(x1)):
            if x1[i] == x2[i]:
                controle += 1 
    if controle == len(x1):
        return True
    else: 
        return False
                
x1 = str(input(""))
x2 = str(input(""))
print(funcao(x1, x2))