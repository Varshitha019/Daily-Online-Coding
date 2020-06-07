2.Write a python program to Print a list of first and last 5 elements where the values are
square of numbers between 1 and 30 (both included).
Description:
Print a list of first and last 5 elements where the values are square of numbers between 1 and 30 (both included)
Eg: If the range of elements is 20
Then output is:
[1,4,9,16,25]
[256,289,324,361,400]
If the elements begins from 5 to 30
Then output is:
[25,36,49,64,81]
[676,729,784,841,900]


def printValues():
    l = list()
    for i in range(1,21):
        l.append(i**2)
    print(l[:5])
    print(l[-5:])
printValues()
