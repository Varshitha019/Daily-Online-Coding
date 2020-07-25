1.Write a python program Basic Euclidean algorithms.


def gcd(a, b):
   if a == 0 :
      return b
   return gcd(b%a, a)
a = int(input('Enter a:'))
b = int(input('Enter b:'))
print("gcd of ", a , "&" , b, " is = ", gcd(a, b))
