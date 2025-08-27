s = 1   
cont = 2
for c in range(3,100,2):   
    s = s+c/cont
    cont += 1   
print(f"{s:.10f}")