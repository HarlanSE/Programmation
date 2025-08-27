import math

def polares_para_cartesianas(r, a):
    x = r * math.cos(a)
    y = r * math.sin(a)
    return {'x': x, 'y': y}

r = float(input())
a = float(input())

print({'r': r, 'a': a})

ponto_cartesiano = polares_para_cartesianas(r, a)
print(ponto_cartesiano)
