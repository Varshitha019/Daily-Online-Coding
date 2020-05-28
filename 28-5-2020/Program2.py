2. .Write a python program to find digital root of a number. 
Description:
A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
digit_root(0)= 0
digital_root(16)
=> 1 + 6
=> 7
digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4


def DigitalRoot(number):
	addper = 0
	while number >=10:
		number = sum(int(digit)for digit in str(number))
		addper +=1
	print(number)
DigitalRoot(2516)
