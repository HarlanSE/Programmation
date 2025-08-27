def funcao(x):
    f = 1
    for c in range(1,x+1):
        f *= c
    return(f)
n = int(input(""))
for n in range(n):
    for j in range(n+1):
        cobin = funcao(n)/(funcao(j)*funcao(n-j))
        print(int(cobin),end = " ")
    print()