2.Write java program Find the smallest positive integer value that cannot be represented as sum of any subset of a given array sorted in 
ascending order.
Description:-
Given a sorted array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set
Examples:

Input: arr[] = {1, 3, 6, 10, 11, 15};
Output: 2
There are no one or more elements to be added up to get sum = 2

Input: arr[] = {1, 1, 1, 1};
Output: 5
1 = 1, 1+1 = 2, 1+ 1 + 1 = 3, 1 + 1 + 1 + 1 = 4,
There is no elements in the array to get sum 5

Input: arr[] = {1, 1, 3, 4};
Output: 10
1 = 1, 1 + 1 = 2, 3 = 3, 1 + 3 = 4, 1 + 4 = 5, 1 + 1 +4 = 6, 3 + 4 = 7........
To get sum 10, there is no elements in the array.

Input: arr[] = {1, 2, 5, 10, 20, 40}
Output: 4
There are no elements to get sum = 4.

Input: arr[] = {1, 2, 3, 4, 5, 6}
Output: 22


class Main
{
    
    int findSmallest(int arr[], int n)  
    {
        int res = 1; 
        for (int i = 0; i < n && arr[i] <= res; i++)
            res = res + arr[i];
 
        return res;
    }
 public static void main(String[] args)  
    {
      Main small = new Main();
        int arr1[] = {1, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println(small.findSmallest(arr1, n1));
 
    }
} 
