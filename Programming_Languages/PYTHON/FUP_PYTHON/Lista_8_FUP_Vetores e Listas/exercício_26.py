def funcao(vet1,vet2):
    new_vet = []
            # if vet1[i] != vet2[i] and vet1[i] not in new_vet:
    for i in range(len(vet1)):
       if vet1[i] not in vet2:
            new_vet.append(vet1[i])
    return new_vet

# vet1 = [1,2,3,4,5]
# # for i in range(5):
# #     vet1.append(int(input("")))
# vet2 = [1,2,1,2,3]
# # for i in range(5):
# #     vet2.append(int(input("")))
    
# y = funcao(vet1, vet2)
# print(y)