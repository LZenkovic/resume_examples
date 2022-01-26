def vypisCleny (n = 10):
    f1 = 0
    f2 = 1
    f3 = 0
    soc = 1
    if (vyber == 1 or vyber == 2):
        print (f1, f2, " ", end='')
    for i in range(n-2):
        f3 = f1 + f2
        if (vyber == 1 or vyber == 2):
            print (f3, " ", end ='')
        f1 = f2
        f2 = f3
        soc = soc + f3
        if (vyber == 5):
            print(f2/f1, end = " ")
    if (vyber == 3):
        print ("součet členů je", soc)
    elif (vyber == 4):
        print (f2/f1)
    else:
        pass

print("vyberte z následujících")
print("1 pro zadané n vypíše n členů posloupnosti")
print("2 vypíše prvních 10 členů posloupnosti")
print("3 vypíše součet prvních n členů posloupnosti")
print("4 vypíše poměr nthého a n-1 členu posloupnosti")
print("5 vypíše poměry n a n-1")
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
vyber = int(input(""))
if (vyber == 2):
    inN = 10
else:
    inN = inN = int(input("zadej n"))

vypisCleny(inN)

'''
if vyber == 1:
    inN = int(input("zadej n"))
    vypisCleny(inN)
elif vyber == 2:
    vypisCleny()
elif vyber == 3:
    inN = int(input("zadej n"))
    vypisCleny(inN)
elif vyber == 4:
    inN = int(input("zadej n"))
    vypisCleny(inN)
elif vyber == 5:
    inN = int(input("zadej n"))
    vypisCleny(inN)
else:
    print("invalid input")
'''
