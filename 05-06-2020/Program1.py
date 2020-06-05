1.Python program to square each odd number in the list 

L1=[2,4,5,6,7,8,9]
even_sq,odd_sq = [],[]

for i in L1:
    (even_sq if i%2==0 else odd_sq).append(i*i)
print(odd_sq)
