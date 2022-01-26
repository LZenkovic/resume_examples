#mocniny
#** je umocnění
print("zadej číslo mocniny")
x = int(input())
x1st = x
print("zadej číslo na umocnění")
y = int(input())
for i in range(y-1):
    x = x * x1st
print(x)