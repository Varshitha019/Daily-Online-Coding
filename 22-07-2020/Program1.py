1.Write a Python Program for GCD of more than two (or array) numbers.


def findgcd(x, y):
   while(y):
      x, y = y, x % y
   return x
l = [22, 44, 66, 88, 99]
num1=l[0]
num2=l[1]
gcd=findgcd(num1,num2)
for i in range(2,len(l)):
   gcd=findgcd(gcd,l[i])
print("gcd is: ",gcd)
