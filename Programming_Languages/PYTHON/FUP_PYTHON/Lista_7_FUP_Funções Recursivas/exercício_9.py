def funcao(n): 
    if n == 1 or n == 0: 
        return 1
    else: 
        fat = 1 
        for i in range(1, n+1):  
            fat *= i
        return fat * funcao(n-1)
    
n = int(input(""))
print(funcao(n))