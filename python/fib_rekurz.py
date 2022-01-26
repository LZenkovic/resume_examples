def func(n, f1 = 0, f2 = 1, f = False):
    if (f == False):
        print (1," ",end='')
    if (n == 1):
        return ""
    else:
        f3 = f1 + f2
        f1 = f2
        f2 = f3
        n -= 1
        print (f3, " " ,  end ='')
        return func(n, f1, f2, True)
m = int(input("zadej číslo"))
print (func(m))