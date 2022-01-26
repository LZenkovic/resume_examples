p = int(input("zadej první čelen posloupnosti"))
d = int(input("zadej deferenciál"))
n = int(input("zadej n"))
v = p

for i in range(n-1):
    v = v + d
print (v)