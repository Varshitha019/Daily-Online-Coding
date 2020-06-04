1. Write a python program to combine the strings.
Description:
Take two strings, return a string of the form short+long+short, with the shorter string on the outsides and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
Eg:
Str1= 'Hello'
Str2= 'Hi'
Combined_str('Hello', 'Hi') ='HiHelloHi'


str1=input("Str1=")
str2=input("Str2=")
count1=0
count2=0
for i in str1:
    count1=count1+1
for j in str2:
    count2=count2+1
if count1<count2:
    print("Combined_str("+str1+","+str2+")"+"="+(str1+str2+str1))
else:
    print("Combined_str("+str1+","+str2+")"+"="+(str2+str1+str2))
