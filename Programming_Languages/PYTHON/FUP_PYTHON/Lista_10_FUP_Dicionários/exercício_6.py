def funcao(vet1, vet2): 
    return  {
            'x': vet1['x'] + vet2['x'], 
            'y': vet1['y'] + vet2['y'], 
            'z': vet1['z'] + vet2['z']
            }
    
x = float(input(""))
y = float(input(""))
z = float(input(""))
vet1 = {'x':x , 'y':y , 'z':z}

x = float(input(""))
y = float(input(""))
z = float(input(""))
vet2 = {'x':x , 'y':y , 'z':z}

new_vet = funcao(vet1,vet2)

print(new_vet)

