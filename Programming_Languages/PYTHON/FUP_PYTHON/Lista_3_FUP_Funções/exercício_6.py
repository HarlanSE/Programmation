import math

def funcao(R):
    volume = 4/3 * math.pi * R**3 
    area = 4 * math.pi * R**2 
    return volume, area

R = float(input(""))

volume, area = funcao(R)

print(f"{volume:.2f}")
print(f"{area:.2f}")
