array = [2,8,1,5,4,6,7,3]


def qs (p , zacatek, konec):
    pivot = p[(zacatek + konec)//2]
    i = zacatek
    j = konec

    while(i < j):
        while(p[i] < pivot):
            i += 1
        while(p[j] > pivot):
            j -= 1
        if (i < j):
            pomc = p[i]
            p[i] = p[j]
            p[j] = pomc
            i +=1
            j -=1
        if i == j:
            i += 1
            j == 1 
    if (i > zacatek):
        qs(p, zacatek, i)
    if (j < konec):
        qs(p, j, konec)


qs(array, 0, len(array)-1)

for i in range(len(array)):
    print(array[i], end=' ')
#print(len(arrray)//2)