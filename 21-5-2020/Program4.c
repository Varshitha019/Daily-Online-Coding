1.  Write C Program to create Singly Liked List with n elements and reverse the elements 

#include <stdio.h>   
struct node{  
    int data;  
    struct node *next;  
};      
struct node *head, *tail = NULL;
void addNode(int data) {   
    struct node *newNode = (struct node*)malloc(sizeof(struct node));  
    newNode->data = data;  
    newNode->next = NULL;    
    if(head == NULL) {    
        head = newNode;  
        tail = newNode;  
    }  
    else {    
        tail->next = newNode;    
        tail = newNode;  
    }  
}  
   
void reverse(struct node *current) {   
    if(head == NULL) {  
        printf("List is empty\n");  
        return;  
    }  
    else{  
        if(current->next == NULL) {  
            printf("%d ", current->data);  
            return;  
        } 
        reverse(current->next);  
        printf("%d ", current->data);  
    }  
}  
      
void display() {  
    struct node *current = head;  
      
    if(head == NULL) {  
        printf("List is empty\n");  
        return;  
    }  
    while(current != NULL) {  
        printf("%d ", current->data);  
        current = current->next;  
    }  
    printf("\n");  
}  
      
int main()  
{    
    addNode(1);  
    addNode(2);  
    addNode(3);  
    addNode(4);  
      
    printf("Original List: \n");  
    display();  
      
    printf("Reversed List: \n");   
    reverse(head);  
  return 0;  
}  
