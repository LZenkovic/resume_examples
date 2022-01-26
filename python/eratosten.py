# Uživatel zadá číslo n, program vypíše všechna prvočísla menší než n

n = int(input("Zadejte číslo: "))

sito = [False,False]+[True]*(n-1) # vytvoří seznam na nultou a první pozici dá False, na ostatní True

for i in range(2,n):
    if sito[i] == True :
        j = 2
        while i*j < n :
            sito[i*j] = False
            j = j+1

for i in range(n):
    if sito[i] == True:
        print(i)