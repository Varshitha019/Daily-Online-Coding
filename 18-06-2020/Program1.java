1.Write a Java program to Check if a binary tree is binary search tree or not.
Code:-
class Main
{ 
static class Node 
{ 
	int data; 
	Node left, right; 
}; 
static boolean isBST(Node root, Node l, Node r) 
{ 
	if (root == null) 
		return true; 
	if (l != null && root.data <= l.data) 
		return false; 
	if (r != null && root.data >= r.data) 
		return false; 
	return isBST(root.left, l, root) && 
		isBST(root.right, root, r); 
} 
static Node newNode(int data) 
{ 
	Node node = new Node(); 
	node.data = data; 
	node.left = node.right = null; 
	return (node); 
} 
public static void main(String args[]) 
{ 
	Node root = newNode(2); 
	root.left = newNode(1); 
	root.right = newNode(9); 
	root.left.left = newNode(4); 
	root.left.right = newNode(5); 

	if (isBST(root,null,null)) 
		System.out.print("The given binary tree is a binary search tree"); 
	else
		System.out.print("The given binary tree is not a binary search tree"); 
} 
} 
