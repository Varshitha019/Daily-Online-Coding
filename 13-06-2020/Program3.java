3.Write a Java Program to determine whether a given matrix is a sparse matrix
Description:-
Algorithm
STEP 1: START
STEP 2: DEFINE rows, cols, size
STEP 3: SET count = 0
STEP 4: INITIALIZE first matrix a[][] ={{4,0,0}, {0,5,0}, {0,0,6}}
STEP 5: rows = a.length
STEP 6: cols = a[0].length
STEP 7: size = rows*cols
STEP 8: REPEAT STEP 9 to STEP 10 UNTIL i<rows
//for(i=0;i<rows; i++)
STEP 9: REPEAT STEP 10 UNTIL j<cols
//for(j=0;j<cols; j++)
STEP 10: if(a[i][j]==0) then count++
STEP 11: if(count>size/2) then PRINT "Yes" else PRINT "No"
STEP 12: END



public class Main   
{    
    public static void main(String[] args) {    
        int rows, cols, size, count = 0; 
        int a[][] = {       
                        {4, 0, 0},    
                        {0, 5, 0},    
                        {0, 0, 6}    
                    };    
                  
          rows = a.length;    
        cols = a[0].length;     
        size = rows * cols;     
        for(int i = 0; i < rows; i++){    
            for(int j = 0; j < cols; j++){    
                if(a[i][j] == 0)    
                    count++;    
                }    
            }    
                
        if(count > (size/2))    
            System.out.println("Given matrix is a sparse matrix");    
        else    
            System.out.println("Given matrix is not a sparse matrix");    
    }    
}     
