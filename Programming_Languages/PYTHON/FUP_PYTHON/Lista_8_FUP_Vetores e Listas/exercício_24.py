def funcao(vet1, vet2): 
    Int = []
    for i in range(len(vet1)): 
        for c in range(len(vet2)):
            if vet1[i] == vet2[c] and vet1[i] not in Int:
                    Int.append(vet1[i])
    return Int

#def funcao(vet1, vet2): 
    #Int = []
    #for i in range(len(vet1)): 
        #for c in range(len(vet2)):
            #if vet1[i] == vet2[c]:
                #Int.append(vet1[i])
    #return Int

# vet1 = []
# for i in range(5): 
#     vet1.append(int(input("")))
# vet2 = []
# for i in range(5): 
#     vet2.append(int(input("")))
# print(funcao(vet1,vet2))