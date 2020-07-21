1. Write a Python Program for Common Divisors of Two Numbers.

a = int(input('Enter a: '))
b = int(input('Enter b: '))
n = 0
for i in range(1, min(a, b)+1):
    if a%i==b%i==0:
        n+=1
print(n)
