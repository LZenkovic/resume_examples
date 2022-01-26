def zobrazSachy():
    l = 8
    print(" " , "A", "B", "C", "D","E","F","G","H")

    for i in range (8):
        print (l, end = " ")

        for j in range (8):
           print (array3[j][i] ,end = " ")

        print()
        l = l-1

array3 = [["*"]*8 for i in range(8)]
bl = True
for i in range (8):
    for j in range(8):
        if (bl == True):
            array3[i][j] = "□"
            bl = False
        else:
            array3[i][j] = "■"
            bl = True
    if (bl == False): 
        bl = True
    else:
        bl = False

x = int(input("zadej umístění číslo figurky "))-1
y = int(input("zadej umístění písmeno figurky "))-1

array3[x][y] = "V"
for i in range (8):
    for j in range (8):
        if (((i == x) or (j == y)) and array3[i][j] != "V"):
            array3[i][j] = "1"
xx = x
yy = y
cislo = 1
while (xx != 0):
    array3[x-cislo][y-cislo] = "1"
    xx-=1
    cislo+=1

xx = x
yy = y
cislo = 1
while (xx != 7):
    array3[x+cislo][y+cislo] = "1"
    xx+=1
    cislo+=1

xx = x
yy = y
cislo = 1
while (xx != 7):
    array3[x+cislo][y-cislo] = "1"
    xx+=1
    cislo+=1

zobrazSachy()                