A = [
    [0, 5, -10, -4, 6],
    [1, 9, -10, -3, -4],
    [3, -2, -6, 5, -9],
    [-9, -8, -10, -7, 4],
    [6, -3, -4, -7, 8]
]

B = [
    [4, -8, -9, 6, 0],
    [-5, -8, -7, 1, 3],
    [8, 9, -1, 0, -1],
    [3, -3, 8, -8, -7],
    [-6, 3, -1, -9, 8]
]

# A = []
# B = []

# for lin in range(5): 
#     line1 = []
#     for col in range(5): 
#         line1.append(int(input("")))
#     A.append(line1)
    
# for lin in range(5): 
#     line2 = []
#     for col in range(5): 
#         line2.append(int(input("")))
#     B.append(line2)
    
C = []
for lin in range(5): 
    line3 = []
    for col in range(5): 
        line3.append(A[lin][col] * B[lin][col])
    C.append(line3)

for lin in range(5): 
    for col in range(5): 
        print(C[lin][col], end = " ")
    print()