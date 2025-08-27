investimentoA = float(input())
investimentoB = float(input())
investimentoC = float(input())
premio = float(input())

investimento_total = investimentoA + investimentoB + investimentoC

parcelaA = premio * (investimentoA/investimento_total)
parcelaB = premio * (investimentoB/investimento_total)
parcelaC = premio * (investimentoC/investimento_total)

print(f"{parcelaA:.2f}")
print(f"{parcelaB:.2f}")
print(f"{parcelaC:.2f}")


