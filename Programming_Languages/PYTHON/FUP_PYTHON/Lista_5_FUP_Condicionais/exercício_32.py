n1 = int(input(""))
n2 = int(input(""))
maior = menor = 1
q = 0

if n1 > n2: 
    maior = n1 
    menor = n2 
else: 
    maior = n2 
    menor = n1 
 
while maior-menor >= 0:    
    maior = maior-menor 
    q += 1    
print(q)   
