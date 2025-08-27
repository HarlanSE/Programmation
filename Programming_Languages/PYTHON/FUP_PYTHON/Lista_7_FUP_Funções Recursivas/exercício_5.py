def funcao(n): 
    if n == 0: 
        print(0)
    else: 
        funcao(n-1)
        print(n)
       
n = int(input(""))
funcao(n)

