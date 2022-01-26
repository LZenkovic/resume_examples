# Uživatel zadá číslo, program ověří, zda se jedná o prvočíslo, zadané číslo jevětší než 1

n = int(input("Zadejte číslo:"))

prv = True
i = 2
while (i*i <= n) and (prv == True):
    if (n % i == 0):
        prv = False
    i = i + 1
print(prv)