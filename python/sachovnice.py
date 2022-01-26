# Máme věž na šachovnici, vypíše políčka kam nám věž může jet. Musíme vytvořit strukturu dvojityho pole

k = 8
sach = [["*"]*k for i in range(k)]
# v podstate znamena [["*","*"....],[],[],]

x = int(input("Zadejte x-ovou souřadnici věže: "))
y = int(input("Zadejte y-ovou souřadnici věže: "))
sach[x-1][y-1] = "V"

for i in range(k):
    for j in range(k):
        if ((j == x-1)or(i == y-1))and(sach[j][i] != "V"):
            sach[j][i] = "1"
        print(sach[j][i], " ", end='')
    print("")   # zalomí řádek