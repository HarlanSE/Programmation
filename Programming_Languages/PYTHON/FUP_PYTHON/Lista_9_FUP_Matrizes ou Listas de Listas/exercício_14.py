A = []
B = []

for lin in range(4): 
    line1 = []
    for col in range(5): 
        line1.append(int(input("")))
    A.append(line1)
    
for lin in range(4): 
    line2 = []
    for col in range(5): 
        line2.append(int(input("")))
    B.append(line2)
    
C = []
for lin in range(4): 
    line3 = []
    for col in range(5): 
        line3.append(A[lin][col] + B[lin][col])
    C.append(line3)

for lin in range(4): 
    for col in range(5): 
        print(C[lin][col], end = " ")
    print()