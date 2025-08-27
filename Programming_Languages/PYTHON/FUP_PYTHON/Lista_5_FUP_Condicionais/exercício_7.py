n1 = float(input(""))
if 1 <= n1 <= 10:
    n2 = float(input(""))
    if 1 <= n2 <= 10:
        n3 = float(input(""))
        if 1 <= n3 <= 10:
            print(f"{(n1+n2+n3)/3:.2f}")
        else:
            print("número inválido")
    else:
        print("número inválido")
else:
    print("número inválido")