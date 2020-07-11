1.Write C Program to Check whether an Alphabet is Vowel or Consonant.


#include<stdio.h>
int main()
{
    char ch;
    printf("Enter character:\n");
    scanf("%c",&ch);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        printf("%c is a Vowel",ch);
    }
    else
    {
        printf("%c is a Consonant",ch);
    }
    
}
