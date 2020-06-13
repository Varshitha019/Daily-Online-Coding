1.Write a C Program to calculate Electricity Bill.
Description:-
Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:
• 1 to 100 units – Rs. 10/- Per Unit
• 100 to 200 units – Rs. 15/- Per Unit
• 200 to 300 units – Rs. 20/- Per Unit
• above 300 units – Rs. 25/- Per Unit
Examples:
Input: U = 250
Output: 3500
Explanation:
Charge for the first 100 units – 10100 = 1000
Charge for the 100 to 200 units – 15100 = 1500
Charge for the 200 to 250 units – 20*50 = 1000
Total Electricity Bill = 1000 + 1500 + 1000 = 3500
Code:-
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int unit;
	printf("U=");
	scanf("%d",&unit); 
      if(unit<=100){
    printf("%d",unit*10);
}
else if(unit<=200){
    printf("%d",(100*5)+(unit-100)*15);
}
else if(unit<=300){
    printf("%d",(100*10)+(100*15)+(unit-200)*20);
}
else if(unit>300){
    printf("%d",(100*10)+(100*15)+(100*20)+(unit-300)*25);
}
else{
    printf("No value");
}
getch();
    return 0;
}
