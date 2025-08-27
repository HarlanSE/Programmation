n = int(input(" "))

for i in range(n):
    print("*", end = " ")
print()
   
for i in range(n-2):
    print("*", end = " ")
    for j in range(n-2):
        print(" ", end = " ")
    print("*", end = " ")
    print()
   
for i in range(n):
    print("*", end = " ")
print()