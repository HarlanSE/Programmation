def funcao(x):  
    for i in range(x):
        for c in range(i+1):
            print("*",end = "")    
        print() 
        
    for i in range(x-1):
        for c in range(x-1-i):
            print("*",end = "")    
        print()    
