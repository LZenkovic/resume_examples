x = int(input("zadej cislo"))
y = 2

if (x <=1 ):
    print("zadej validní číslo")
else:
    if (x >= 2 ):
        while(x % y != 0):
            y -= -1

    if (y == x or x <= 2):
        print("je prvočíslo")
    else:
        print("neni prvocislo")