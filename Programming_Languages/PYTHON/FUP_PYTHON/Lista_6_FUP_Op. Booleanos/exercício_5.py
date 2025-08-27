a = int(input(""))
b = int(input(""))
c = int(input(""))

# é triangulo? 
if a + b > c and a + c > b and b + c > a: 
    if a == b and b == c: 
        print("Triangulo equilatero")
    elif (a == b and b != c) or (a == c and c != b) or (b == c and c != a):
        print("Triangulo isosceles")
    else: 
        print("Triangulo escaleno")
else: 
    print("Nao triangulo")