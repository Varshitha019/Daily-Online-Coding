4.Python Program to read a number n and print and compute the series “1+2+…+n=”.

n=int(input("Enter the number:"))
Series=list()
for i in range(1,n+1):
    Series.append(i)
    if(i!=n):
        print(i,end="+")
    else:
        print(i,end="=")
print(sum(Series))
