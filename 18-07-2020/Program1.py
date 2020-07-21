1. Write a Python Program for Extended Euclidean algorithms.

def gcdExtended(a, b):
    if a == 0 :
        return b,0,1
    gcd,x1,y1 = gcdExtended(b%a, a)
    x = y1 - (b//a) * x1
    y = x1
    return gcd,x,y
a=int(input('Enter a: '))
b=int(input('Enter b: '))
g, x, y = gcdExtended(a, b)
print("gcd(", a , "," , b, ") = ", g)
