vet = []

for i in range(10): 
    vet.append(int(input()))
    
for i in range(len(vet)): 
    div = 0 
    cont = vet[i]
    if vet[i] < 0: 
        cont = vet[i] * -1 
        
    for c in range(1, cont+1): 
        if vet[i] % c == 0 :
            div += 1 

    if div == 2 :
        print(vet[i])
        print(i)
        
        
# l = []  
# for c in range(10): 
#     n1 = int(input("")) 
#     l.append(n1)    
     
# for c in range(len(l)): 
#     div = 0 
#     co = l[c]    
#     if l[c] < 0:    
#         co = l[c]*-1    
    
#     for j in range(1,co+1):    
#         if l[c]%j == 0:    
#             div += 1    
#     if div == 2:    
#         print(l[c]) 
#         print(c)