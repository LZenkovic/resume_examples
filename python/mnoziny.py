#úloha 5: vypisování čísel z množiny
n = int(input("zadej číslo"))
mnozina = list(range(n))

for i in range(n):
    mnozina[i] = int(input("zadej čísla"))

for i in range(n):
    for j in range(i+1,n):
        print(mnozina[i], mnozina[j])

#for j in mnozina:
 #   print(j)