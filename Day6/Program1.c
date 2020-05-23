. Write a C Program to Generate First N Triangular Numbers.

#include <stdio.h> 
void triangular_series(int n) 
{ 
    for (int i = 1; i <= n; i++)  
        printf(" %d ", i*(i+1)/2); 
} 
  	
// Driven Function 
int main() 
{ 
    int n;
    printf("enter the number:");
    scanf("%d",&n);
    triangular_series(n); 
    return 0; 
}

