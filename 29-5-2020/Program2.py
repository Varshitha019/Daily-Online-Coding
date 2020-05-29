We are given 3 strings: str1, str2, and str3. Str3 is said to be a shuffle of str1 and str2 if it can be formed by interleaving the characters of str1 and str2 in a way that maintains the left to right ordering of the characters from each string. For example, given str1="abc" and str2="def", str3="dabecf" is a valid shuffle since it preserves the character ordering of the two strings. So, given these 3 strings write a function that detects whether str3 is a valid shuffle of str1 and str2.


def isInterleaved(A, B, C): 
	M = len(A) 
	N = len(B) 
	IL = [[False] * (N + 1) for i in range(M + 1)] 
	if ((M + N) != len(C)): 
		return False
	for i in range(0, M + 1): 
		for j in range(0, N + 1): 
			if (i == 0 and j == 0): 
				IL[i][j] = True
			elif (i == 0): 
				if (B[j - 1] == C[j - 1]): 
					IL[i][j] = IL[i][j - 1] 
			elif (j == 0): 
				if (A[i - 1] == C[i - 1]): 
					IL[i][j] = IL[i - 1][j] 
			elif (A[i - 1] == C[i + j - 1] and
				B[j - 1] != C[i + j - 1]): 
				IL[i][j] = IL[i - 1][j] 
			elif (A[i - 1] != C[i + j - 1] and
				B[j - 1] == C[i + j - 1]): 
				IL[i][j] = IL[i][j - 1] 
			elif (A[i - 1] == C[i + j - 1] and
				B[j - 1] == C[i + j - 1]): 
				IL[i][j] = (IL[i - 1][j] or IL[i][j - 1]) 
		
	return IL[M][N] 
def test(A, B, C): 

	if (isInterleaved(A, B, C)): 
		print(C, "is interleaved of", A, "and", B) 
	else: 
		print(C, "is not interleaved of", A, "and", B) 
if __name__ == '__main__': 
	test("abc", "def", "dabecf") 
