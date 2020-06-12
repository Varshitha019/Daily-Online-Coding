
3.Write a Java program to find maximum width of a binary tree.
Description:-
Algorithm
Define Node class which has three attributes namely: data left and right. Here, left represents the left child of the node and right represents the right child of the node.
When a node is created, data will pass to data attribute of the node and both left and right will be set to null.
Define another class which has an attribute root.
Root represents the root node of the tree and initializes it to null.
a. findMaximumWidth() will find out the maximum width of the given binary tree:
Variable maxWidth will store the maximum number of nodes present in any level.
The queue is used for traversing binary tree level-wise.
It checks whether the root is null, which means the tree is empty.
If not, add the root node to queue. Variable nodesInLevel keeps track of the number of nodes in each level.
If nodesInLevel > 0, remove the node from the front of the queue and add its left and right child to the queue. For the first iteration, node 1 will be removed and its children nodes 2 and 3 will be added to the queue. In the second iteration, node 2 will be removed, its children 4 and 5 will be added to the queue and so on.
MaxWidth will store max(maxWidth, nodesInLevel). So, at any given point of time, it will represent the maximum number of nodes.
This will continue till all the levels of the tree is traversed.


import java.util.LinkedList;  
import java.util.Queue;  
   
public class Main {  
      public static class Node{  
        int data;  
        Node left;  
        Node right;  
         
        public Node(int data){  
          this.data = data;  
          this.left = null;  
          this.right = null;  
        }  
      }    
      public Node root;  
       
      public Main(){  
        root = null;  
      }  
      public int findMaximumWidth() {  
          int maxWidth = 0;  
          int nodesInLevel = 0;  
          Queue<Node> queue = new LinkedList<Node>();  
          if(root == null) {  
              System.out.println("Tree is empty");  
              return 0;  
          }  
          else {  
              queue.add(root);  
               
              while(queue.size() != 0) {  
                  nodesInLevel = queue.size();  
                  maxWidth = Math.max(maxWidth, nodesInLevel);  
                  while(nodesInLevel > 0) {  
                     Node current = queue.remove();  
                     if(current.left != null)  
                         queue.add(current.left);  
                     if(current.right != null)  
                         queue.add(current.right);  
                     nodesInLevel--;  
                  }  
              }  
          }  
          return maxWidth;  
      }  
       
      public static void main(String[] args) {  
           
          Main bt = new Main();  
          bt.root = new Node(1);  
          bt.root.left = new Node(2);  
          bt.root.right = new Node(3);  
          bt.root.left.left = new Node(4);  
          bt.root.left.right = new Node(5);  
          bt.root.right.left = new Node(6);  
          bt.root.right.right = new Node(7);  
          bt.root.left.left.left = new Node(8);  
          System.out.println("Maximum width of the binary tree: " + bt.findMaximumWidth());  
      }  
}  
