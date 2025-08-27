def  SomaSerie(i,j,k): 
    if i > j:
        return 0
    else: 
        return i + SomaSerie(i+k,j,k)

i = int(input(""))
j = int(input(""))
k = int(input("")) 

y = SomaSerie(i,j,k)
print(f"{y}")