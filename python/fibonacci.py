# Uživatel zadá číslo n, program vypíše n členů Fibon. posloupnosti

n = int(input("Zadejte číslo:"))
f0 = 0
f1 = 1

if (n == 0):
    print(n)

elif (n == 1):
    print(f0)
    print(n)
    
else:   
    print(f0)
    print(f1)
    for i in range(n-1):
        fib = f0 + f1
        print(fib)
        f0 = f1
        f1 = fib
