1.Write a Java Program to determine whether one string is a rotation of another.

Description:
In this program, we need to check whether a string is a rotation of another string or not.
String 1: abcde
String 2: deabc
String 1 + String 1: abcdeabcde
Consider the above example, suppose we need to check whether string 2 is a rotation of string 1. To find this, we concatenate string 1 with string 1. Then, try to find the string 2 in concatenated string. If string 2 is present in concatenated string then, string 2 is rotation of string 1. String 2 deabc is found on the index 3 in concatenated string. So, deabc is rotation of abcde.
ALGORITHM
STEP 1: START
STEP 2: DEFINE String str1 = "abcde", str2 = "deabc"
STEP 3: IF length of str1 not equals to str2 then PRINT "No"
else go to STEP 4
STEP 4: CONCATENATE str1 with str1.
STEP 5: IF str2 present in str1 then PRINT "Yes" else PRINT "No".
STEP 6: END

Code:-

public class Main  
{  
    public static void main(String[] args) {  
        String str1 = "abcde", str2 = "decba";  
         
        if(str1.length() != str2.length()){  
            System.out.println("Second string is not a rotation of first string");  
        }  
        else {  
            str1 = str1.concat(str1);  
            if(str1.indexOf(str2) != -1)  
                System.out.println("Second string is a rotation of first string");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  
    }  
}  
