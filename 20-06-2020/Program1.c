1. Write a C Program to rotate an array by K positions. Circular array rotation means rotating the elements in the array where one
rotation operation moves the last element of the array to the first position and shifts all remaining elements to the right.
#include <stdio.h>    
int main()    
{    
    int arr[] = {1, 2, 3, 4, 5};     
    int length = sizeof(arr)/sizeof(arr[0]);    
    int n = 3;    
    printf("Original array: \n");    
    for (int i = 0; i < length; i++) {     
        printf("%d ", arr[i]);     
    }     
    for(int i = 0; i < n; i++){    
        int j, last;    
        last = arr[length-1];    
        for(j = length-1; j > 0; j--){    
            arr[j] = arr[j-1];    
        }    
        arr[0] = last;    
    }    
    printf("\n");    
    printf("Array after right rotation: \n");    
    for(int i = 0; i< length; i++){    
        printf("%d ", arr[i]);    
    }    
    return 0;    
}    
