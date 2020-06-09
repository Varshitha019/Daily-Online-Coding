2. Write a Python to implement Perfect Sum Problem
Given an array arr[] of integers and an integer K, the task is to print all subsets of the given array with the sum equal to the given target K.

Input: arr[] = {5, 10, 12, 13, 15, 18}, K = 30

Output: {12, 18}, {5, 12, 13}, {5, 10, 15}

Explanation:
Subsets with sum 30 are:
12 + 18 = 30
5 + 12 + 13 = 30
5 + 10 + 15 = 30



# Python3 implementation of the above approach 

# Function to print the subsets whose 
# sum is equal to the given target K 
def sumSubsets(sets, n, target) : 

	# Create the new array with size 
	# equal to array set[] to create 
	# binary array as per n(decimal number) 
	x = [0]*len(sets); 
	j = len(sets) - 1; 

	# Convert the array into binary array 
	while (n > 0) : 
	
		x[j] = n % 2; 
		n = n // 2; 
		j -= 1; 
	
	sum = 0; 

	# Calculate the sum of this subset 
	for i in range(len(sets)) : 
		if (x[i] == 1) : 
			sum += sets[i]; 

	# Check whether sum is equal to target 
	# if it is equal, then print the subset 
	if (sum == target) : 

		print("{",end=""); 
		for i in range(len(sets)) : 
			if (x[i] == 1) : 
				print(sets[i],end= ", "); 
		print("}, ",end=""); 

# Function to find the subsets with sum K 
def findSubsets(arr, K) : 

	# Calculate the total no. of subsets 
	x = pow(2, len(arr)); 

	# Run loop till total no. of subsets 
	# and call the function for each subset 
	for i in range(1, x) : 
		sumSubsets(arr, i, K); 

# Driver code 
if __name__ == "__main__" : 

	arr = [ 5, 10, 12, 13, 15, 18 ]; 
	K = 30; 
	findSubsets(arr, K); 


