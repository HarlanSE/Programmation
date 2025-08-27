n1=int(input())
n2=int(input())
n3=int(input())

if n3 < n2:
    transferidor = n2
    n2 = n3
    n3 = transferidor
    
elif n2 < n1:
    transferidor = n1
    n1 = n2
    n2 = transferidor
    
elif n2 > n3:
    transferidor = n2
    n2 = n3
    n3 = transferidor
    
print(n1)
print(n2)
print(n3)
    