x = int(input("zadej cislo"))
y = 3
z = 0

if (x <=1 ):
    print("zadej validní číslo")
elif (x%2 == 0):
    print("neni prvocislo")
elif (x == 2):
    print("je prvocislo")
else:
    z = x/2+0.5
    print(z)
    while (y <= z):
        if (x % y == 0):
            break
        else:
            #print("lol")
            y = y+2
    if (y >= z):
        print("je prvocislo")
    else:
        print("neni prvocislo")