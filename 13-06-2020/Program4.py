4.Write the python Program to print the following pattern.
Description:
Input:
Number of rows is 5
Output Pattern is:
A
B C
D E F
G H I J
K L M N O


def  contalpha(n):
    num = 65
    for i in range(0, n):
        for j in range(0, i+1):
            ch = chr(num)
            print(ch, end=" ")
            num = num +1
        print("\r")
n = int(input("Enter the number of rows:"))
contalpha(n) 
