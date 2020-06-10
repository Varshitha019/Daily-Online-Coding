1. Write a C Program to print the sum of boundary elements of a matrix.
Description:-
Given a matrix, the task is to print the boundary elements of the matrix and display their sum.
Sample Output 1:
Enter M (Rows) and N (Columns): 3, 3
Enter the Elements: 1 2 3 4 5 6 7 8 9
OUTPUT:
The Input Matrix is:
1 2 3
4 5 6
7 8 9
The Boundary Elements are: 1 2 3 4 6 7 8 9
The Sum of Boundary elements of the Matrix is: 40

Sample Output 2:
Enter M (Rows) and N (Columns): 4, 5
Enter the Elements: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
OUTPUT:
The Input Matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
The Boundary Elements are: 1 2 3 4 5 8 9 12 13 16 17 18 19 20
The Sum of Boundary elements of the Matrix is: 147
Code:-
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int **a,r,c,i,j;
    printf("enter the size:");
    scanf("%d",&r);
    scanf("%d",&c);

    a=(int**)malloc(r*sizeof(int*));
    for(i=0;i<r;i++)
        *(a+i)=(int*)malloc(c*sizeof(int));
        printf("enter the matrix:\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        
        {
        	
            scanf("%d",*(a+i)+j);
        }
    }

    i=0;int sum1=0;
    for(j=0;j<c;j++)
        sum1=sum1+*(*(a+i)+j);

    i=r-1;int sum2=0;
    if(i!=0)
    {
        for(j=0;j<c;j++)
            sum2=sum2+*(*(a+i)+j);
    }
    j=0; int sum3=0;
    for(i=1;i<r-1;i++)
        sum3=sum3+*(*(a+i)+j);
        j=c-1; int sum4=0;
    for(i=1;i<r-1;i++)
        sum4=sum4+*(*(a+i)+j);
        printf("Sum of boundary is %d",sum1+sum2+sum3+sum4);
    return 0;
}

