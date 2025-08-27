def funcao(premio):
    G1 = (premio * 0.46)
    G2 = (premio * 0.32)
    G3 = (premio * 0.22)
    return G1,G2,G3

premio = float(input(""))

G1, G2, G3 = funcao(premio)

print(f"{G1:.2f}")
print(f"{G2:.2f}")
print(f"{G3:.2f}")