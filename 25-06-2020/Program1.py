1. Write a python program for cube sum of first n natural numbers.


def sumOfSeries(n): 
	sum = 0
	for i in range(1, n+1): 
		sum +=i*i*i 
	return sum
n = int(input("Enter number:"))
print(sumOfSeries(n)) 
