idade = float(input(""))
servico = float(input(""))

if idade >= 65 or servico >= 30 or (idade >= 60 and servico >= 25):
    print("Pode se aposentar")
else: 
    print("Nao pode se aposentar")