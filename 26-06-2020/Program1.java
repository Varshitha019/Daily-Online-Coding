1. Write a java program to print all permutations of a given string.

Description:
Here is the steps to implement string permutations:
Take out the first char and keep it constant. And permute rest of the characters.
User recursive method call to permute rest of the string except first character.
While making recursive call, we accumulate each character being constant along with recursive call response.



import java.util.*;
public class Main
{
static void printPermutn(String str, String ans)
{
if (str.length() == 0) {
System.out.print(ans + " ");
return;
}
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
String ros = str.substring(0, i) +
str.substring(i + 1);printPermutn(ros, ans + ch);
}
}
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
String s = sc.next();
printPermutn(s, "");
}
} 

