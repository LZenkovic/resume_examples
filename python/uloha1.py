k = int(input("zadej počet sloupců k"))
l = int(input("zadej počet řádků l"))

barv = True

sachovnice = [["*"]*k for i in range(l)]
for i in range(l):
    for j in range(k):
        #print(sachovnice[i][j], end=' ')
        if(barv == True):
            sachovnice[i][j] = "■"
            barv = False
        else:
            sachovnice[i][j] = "□"
            barv = True
    #print("")
    if (k%2 == 0):
        if (barv == True):
            barv = False
        else:
            barv = True

for i in range(l):
    for j in range(k):
        print(sachovnice[i][j], end=' ')
    print("")