# Uživatel zadá n, které určuje počet řádků a sloupců čtverove matice, uživatel zadá jednotlivé prvky matice, program zjistí, zda je matice symetrická

n = int(input("Zadejte počet rozměry čtvercové matice:"))
matice = [[0]*n for i in range(n)]

# naplnění matice 
for j in range(n):
        for i in range(n):
            matice[j][i] = int(input("Zadejte prvky matice: "))

# vypsání
for j in range(n):
        for i in range(n):
            print(matice[j][i]," ", end = '')
        print()

# zjisteni smyetrie
sym = True
for j in range(n):
    for i in range(n):
        if matice[j][i] != matice[j][i]:
            sym = False

print(sym)