1. Write a C Program to rotate the matrix by K times.
Rotate the matrix by K times means rotating the given NN matrix to the specified (K) number of times. For example, consider the 33 matrix, which has to be rotated once,
Enter the Size of the Matrix: 3, 3
Enter the Elements of the Matrix: 10, 20, 39, 40, 50, 60, 70, 80, 90
Enter the value of K (Number of Rotations): 1
Matrix before Rotation:
10 20 30
40 50 60
70 80 90
Matrix after Rotation:
20 30 10
50 60 40
80 90 70


M = 3
N = 3
matrix = [[10,20,30], 
		[40,50,60], 
		[70,80,90]] 
def rotateMatrix(k) : 

	global M, N, matrix 
	temp = [0] * M 
	k = k % M 
	for i in range(0, N) : 
		for t in range(0, M - k) : 
			temp[t] = matrix[i][t] 
		for j in range(M - k, M) : 
			matrix[i][j - M + k] = matrix[i][j] 
		for j in range(k, M) : 
			matrix[i][j] = temp[j - k] 
def displayMatrix() : 

	global M, N, matrix 
	for i in range(0, N) : 
	
		for j in range(0, M) : 
			print ("{} " . 
				format(matrix[i][j]), end = "") 
		print () 


k = 2
rotateMatrix(k) 
displayMatrix()
