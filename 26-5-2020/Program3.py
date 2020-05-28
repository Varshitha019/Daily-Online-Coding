3.Python Program to Count the Number of Digits in a Number
n=int(input("Enter the number"))
num=n
count=0
while(n!=0):
    n=n//10
    count+=1
print("Number of digits in ",num," is ",count)
