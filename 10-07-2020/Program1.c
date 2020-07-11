1.Write python program for find largest prime factor of a number.


import math

def maxPrimeFactors (n):
  
    maxPrime = -1
     
   
    while n % 2 == 0:
        maxPrime = 2
        n >>= 1   
   
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            maxPrime = i
            n = n / i
   
    if n > 2:
        maxPrime = n
     
    return int(maxPrime)
 

n = 15
print(maxPrimeFactors(n))
 
n = 25698751364526
print(maxPrimeFactors(n))
