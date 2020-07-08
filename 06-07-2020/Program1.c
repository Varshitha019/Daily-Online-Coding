1.Write a C program to find the sum of digits of five digit number.

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main() {
	
    int n,s,p,p1,p2,p3,p4;
    scanf("%d", &n);
    p=n%10;
    s=p;
    p1=(n/10)%10;
    s=s+p1;
    p2=(n/100)%10;
    s=s+p2;
    p3=(n/1000)%10;
    s=s+p3;
    p4=(n/10000)%10;
    s=s+p4;
    printf("%d",s);
    return 0;
}
