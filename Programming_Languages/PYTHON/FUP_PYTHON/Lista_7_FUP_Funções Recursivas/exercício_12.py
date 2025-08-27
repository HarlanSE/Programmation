def h(m,n): 
    if n == 1: 
        return m + 1 
    elif m == 1: 
            return n + 1 
    else: 
        return h(m,n-1)+h(m-1,n)
        
m = int(input(""))
n = int(input(""))

print(h(m,n))