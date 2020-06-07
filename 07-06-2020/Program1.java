1. Write a java Program to print smallest and biggest possible palindrome word in a given string
In this program, we need to find the smallest and biggest palindromic word present in the given string.

string:Wow you own kayak




public class Main  
{  
    public static boolean isPalindrome(String a)
    {  
        boolean flag = true;  
        for(int i = 0; i < a.length()/2; i++){  
            if(a.charAt(i) != a.charAt(a.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }  
        return flag;  
    }  
      
    public static void main(String[] args)
    {  
        String string = "Wow you own kayak";  
        String word = "", smallPalin = "", bigPalin="";  
        String[] words = new String[100];  
        int temp = 0, count = 0;  
        string = string.toLowerCase();  
        string = string + " ";  
        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) != ' ')
            {  
                word = word + string.charAt(i);  
            }
            else
            {  
            words[temp] = word;  
            temp++;  
            word = "";  
            }  
        }  
        for(int i = 0; i< temp; i++)
        {  
            if(isPalindrome(words[i]))
            {  
                count++;  
                if(count == 1)  
                    smallPalin = bigPalin = words[i];  
                else
                {  
                    if(smallPalin.length() > words[i].length())  
                        smallPalin = words[i];  
                    if(bigPalin.length() < words[i].length())  
                        bigPalin = words[i];  
                }  
            }  
        }  
        if(count == 0)  
            System.out.println("No palindrome is present in the given string");  
        else
        {  
            System.out.println("Smallest palindromic word: " + smallPalin);  
            System.out.println("Biggest palindromic word: " + bigPalin);  
        }  
    }  
}  

