def funcao(n1,n2):
    mmc = 1
    y1 = n1
    y2 = n2 
    divisor = 2
    c = 0 
    
    while c < n1 and c < n2:
        divisor = 2
        
        while divisor <= y1 or divisor <= y2:
            
            if y1 % divisor == 0 and y2 % divisor == 0:
                
                y1 = y1/divisor
                y2 = y2/divisor
                mmc *= divisor
                
            else:
                
                if y1 % divisor == 0:
                    y1 /= divisor
                    mmc *= divisor
                    
                elif y2 % divisor == 0:
                    y2 /= divisor
                    mmc *= divisor
                    
            divisor += 1
            
        c += 1
    return mmc