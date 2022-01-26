n = int(input("zadej číslo do rovnice"))
x = -100
y = -100
z = -100
t = False

while(x != 101):
    while (y != 101):
        while (z != 101):
            if (x**3+y**3+z**3 == n):
                print (x,y,z)
                t = True
            z += 1
        y += 1
        z = -100
    x += 1
    y = -100

if (t == False):
    print("nemá řešení")