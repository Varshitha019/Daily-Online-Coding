3. C program to find leader in array


#include <stdio.h>
int main()
{
    int i,test_cases,arr[100],max[100],j=0;

    scanf("%d",&test_cases);
    for(i=0; i<test_cases; i++)
    {
        scanf("%d",&arr[i]);
        max[i]=0;
    }
    max[j++] = arr[test_cases-1];
    for(i=test_cases-1; i>=0; i=i-1)
        if( arr[i] >= max[j-1] )
        {
            max[j] = arr[i];
            j++;
        }
    for(j=j-1; j>0; j=j-1)
        printf("%d ",max[j]);
    return 0;
}
