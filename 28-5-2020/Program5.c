5.Write a  program  to find the last remaining element in the array after reducing the array.


#include <iostream> 
using namespace std; 

int find_value(int a[], int n, int k) 
{ 
    
    int sum = 0; 
  
   
    for (int i = 0; i < n; i++) { 
        sum += a[i]; 
    } 
 
    return sum % k; 
} 
  

int main() 
{ 
    int n = 5, k = 3; 
    int a[] = { 12, 4, 13, 0, 5 }; 
    cout << find_value(a, n, k); 
    return 0; 
}
