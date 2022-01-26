#faktorial zadaného čísla pomocí rekurze
def faktorial(n):
    if (n == 0):
        return 1
    else:
        return n*faktorial(n-1)

l = int(input("zadej číslo"))
print (faktorial(l))