2.Write a C Program to implement the Binary Reversal.
Description:-
Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer, take its binary 
representation, reverse that string of bits, and then finally return the new reversed string in decimal form. For example: if str is 
47 then the binary version of this integer is 101111 but we pad it to be 00101111 (Total number of bits must be multiples of 4). Your 
program should reverse this binary string which then becomes: 11110100 and then finally return the decimal version of this string, which is 244.
Examples
Input: 213
Output: 171
Input: 4567
Output: 60296


#include <stdio.h>
 int main ()
{
	int n = 0, num = 0, count = 0, rev_bits = 0;
	printf ("Enter the number: ");
	scanf ("%d", &n);
 
	while (n > 0)
	{
		rev_bits = rev_bits << 1;
		if (n & 1 == 1)
		{
			rev_bits = rev_bits ^ 1;
		}
		n = n >> 1;
	}
 
	printf ("\nThe reversed resultant = %d\n", rev_bits);
 
	return 0;
}
