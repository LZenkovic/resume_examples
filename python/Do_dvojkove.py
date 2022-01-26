#Uživatel zadaá číslo, vyjede zápis ve dvojkové soustavě

n = int(input("Zadejte číslo:"))

i = 0
vysledek = 0
while n > 0:
    vysledek += (n % 2)*10**i
    print (vysledek)
    n = n // 2
    i = i+1
print(vysledek)