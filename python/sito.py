n = int(input("zadej číslo"))
a = [False, False]+[True]*(n-1) #na pozici 0 a 1 False zbytek True
j = 0
for i in range(2,n-1):
    x = 2
    while i * x <= n:
        a[i*x] = False
        x = x + i
for x in a:
    if x == True:
        print(j, x)
    j -= -1