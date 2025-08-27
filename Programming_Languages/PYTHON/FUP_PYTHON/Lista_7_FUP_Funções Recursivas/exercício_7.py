def funcao(n): 
    if n == 0: 
        print(0)
    elif n % 2 == 0: 
        funcao(n-2)
        print(n)
        
n = int(input(""))
funcao(n)