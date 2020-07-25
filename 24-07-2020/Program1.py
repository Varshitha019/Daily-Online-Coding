1.Write a python program for Find minimum sum of factors of number.


def findMinSum(num):
    sum = 0
    i = 2
    while(i * i <= num):
        while(num % i == 0):
            sum += i
            num /= i
        i += 1
    sum += num
    return sum
num = int(input('Enter number:'))
print(findMinSum(num))
