1. Write a python program to print the multiplication table of number.

num = int(input("Enter the number: "))
print("Multiplication Table of", num)
for i in range(1, 11):
   print(num,"X",i,"=",num * i)
