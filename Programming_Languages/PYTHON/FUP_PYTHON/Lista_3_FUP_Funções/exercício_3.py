def funcao(b,h):
    area = b*h
    perimetro = (b+h)*2
    return area, perimetro 

b = float(input(""))
h = float(input(""))

area, perimetro = funcao(b,h)

print (f"{area:.2f}")
print (f"{perimetro:.2f}")
