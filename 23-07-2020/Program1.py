1.Write a Python Program for Check if count of divisors is even or odd.

import math
def countDivisors(n) :
    count = 0
    for i in range(1, (int)(math.sqrt(n)) + 2) :
        if (n % i == 0) :
            if( n // i == i) :
                count = count + 1
            else :
                count = count + 2
    if (count % 2 == 0) :
        print("Even")
    else :
        print("Odd")
print("The count of divisor: ")
countDivisors(10)
