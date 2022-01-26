#nejmenší společný dělitel
m = int(input("zadej číslo"))
n = int(input("zadej čím ho chceš fělit"))
x = 1

if n > m:
    x = n
    n = m
    m = x
print(m,n)

while(x != 0):
    x = m % n
    m = n
    n = x
    print (m)
    '''
    if x != 0:
        m = n
        n = x
    '''

print (m)