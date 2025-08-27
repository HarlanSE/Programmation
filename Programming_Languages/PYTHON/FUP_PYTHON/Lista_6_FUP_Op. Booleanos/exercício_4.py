n = int(input(""))

if n % 3 == 0 and n % 5 == 0: 
    print(False)
elif n % 3 == 0 or n % 5 == 0: 
    print(True)
else: 
    print(False)