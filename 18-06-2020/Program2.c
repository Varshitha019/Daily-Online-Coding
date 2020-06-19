2.Write a C Program to generate first N Magic Numbers.
Description:-
A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
Input: n = 1
Output: 5

Input: n = 2
Output: 5 25

Input: n = 3
Output: 5 25 30

Input: n = 8
Output: 5 25 30 125 130 150 155 625

Hint:
The magic numbers can be represented as 001, 010, 011, 100, 101, 110 etc, where 001 is 0pow(5,3) + 0pow(5,2) + 1*pow(5,1). So basically, we need to add powers of 5 for each bit set in given integer n.
If n = 1; binary representation of 1 = 0001
Magic Number is: 0 * pow(5,4) + 0 * pow(5, 3) + 0 * pow(5, 2) + 1 * pow(5, 1) = 5

If n = 6; Binary representation of 6 is 0110
6th Magic Number is: 0 * pow(5, 4) + 1 * pow(5, 3) + 1 * pow(5, 2) + 0 * pow(5, 1)
= 0 + 125 + 25 + 0 = 150
Code:-
#include <stdio.h>
#define max 1000000007
long long int magic(int n){
long long int pro=1;
long long res=0;
while(n){
pro=(pro*5)%max;
if(n&1)
res=(res+pro)%max;
n=n>>1;
}
return res;
}

int main()
{
int n,i;
printf("Enter n :");
scanf("%d",&n);
printf(" the magic numbers are: ");
for(i=0;i<n;i++)
{
printf("%d ",magic(i));
}
return 0;
}
