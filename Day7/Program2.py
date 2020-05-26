2.Python Program to Check if a Number is a Palindrome

n=int(input("Enter the number"))
num=n
rev=0
while(n!=0):
    rem=n%10
    rev=rev*10+rem
    n=n//10
if(num==rev):
    print(num,"is a Palindrome")
else:
    print(num,"is not a Palindrome")
