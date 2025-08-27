import random
semente = int(input("")) 
vetor = []
neg = soma = 0

random.seed(semente)

for i in range(12): 
    n_al = (random.uniform(-10,10))
    vetor.append(n_al)
    
for j in range(len(vetor)): 
    if vetor[j] < 0 : 
        neg += 1
    else:
        soma += vetor[j]

print(neg)
print(f"{soma:.2f}")

    
  
# import random
# l = []
# n1 = int(input())
# random.seed(n1)
# quant = 0
# soma = 0  
# for c in range(12): 
#     l.append(random.uniform(-10,10))   

# for c in range(len(l)): 
#     if l[c] < 0:    
#         quant += 1  
#     if l[c] > 0:   
#         soma += l[c]    
# print(quant)
# print(f"{soma:.2f}") 