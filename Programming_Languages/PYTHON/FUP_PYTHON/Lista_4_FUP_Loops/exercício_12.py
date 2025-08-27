def funcao(x1,x2):
    
    fat1 = 1
    for c in range(1,x1+1):
        fat1 = fat1*c
        
    fat2 = 1
    for c in range(1,x2+1):
        fat2 = fat2*c
        
    fat3 = 1 
    for c in range(1,(x1-x2)+1):
        fat3 = fat3*c
    return fat1/(fat2*fat3) 