for i in range(1000, 9999): 
    if ((i // 100) + (i % 100))**2 == i: 
        # casa 4 e 3 = i//100 
        # casa 2 e 1 = i%100 
        print(i)
    