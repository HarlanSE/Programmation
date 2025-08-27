def funcao(x, n):
    exp = 1 
    for i in range(n):
        exp = exp * x
    return exp 

x = int(input(""))
n = int(input(""))
y = funcao(x, n)

print(y)
# x = int(input(""))
# n = int(input(""))
# exp = 1 

# for i in range (n):
#    exp = exp * x 
   
# print(exp)