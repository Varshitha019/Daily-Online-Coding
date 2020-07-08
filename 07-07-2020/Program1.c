1.Write a C code for the following.
Task:-
Given set S={1,2,3,....n}, find:
->the maximum value of a&b which is less than a given integer k, where a and b (where a<b) are two integers from set S.
->the maximum value of a|b which is less than a given integer k, where a and b (where a<b) are two integers from set S.
->the maximum value of a^b which is less than a given integer k, where a and b (where a<b) are two integers from set S.
Input format:-
The only line contains 2 space-separated integers, n and k , respectively.
Output Format:-
->The first line of output contains the maximum possible value of a&b.
->The first line of output contains the maximum possible value of a|b.
->The first line of output contains the maximum possible value of a^b.


#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
void calculate_the_maximum(int n, int k)
 {
     int p=0,q=0,r=0;
 for(int i=1;i<=n;i++)
 {
     for(int j=i+1;j<=n;j++)
     {
         if((i&j)>p&&(i&j)<k)
            p=i&j;
        if((i|j)>q&&(i|j)<k)
            q=i|j;
        if((i^j)>r&&(i^j)<k)
            r=i^j;
     }
   }
 printf("%d\n%d\n%d",p,q,r);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
