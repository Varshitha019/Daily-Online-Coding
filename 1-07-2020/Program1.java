1.Write a java program to find given two trees are mirror or not.
Description:
Here are the steps to find out mirrored binary trees:
If both given trees root node values are same.
Left subtree of root of first tree is mirror of right subtree of root of second tree.
Right subtree of root of first tree is mirror of left subtree of root of second tree.
Code:-
class Node
{
int data;
Node left, right;
public Node(int data)
{
this.data = data;
left = right = null;
}
}
class Main
{
Node a, b;
boolean areMirror(Node a, Node b)
{
if (a == null && b == null)
return true;
if (a == null || b == null)
return false;
return a.data == b.data
&& areMirror(a.left, b.right)
&& areMirror(a.right, b.left);
}
public static void main(String[] args)
{
Main tree = new Main();
Node a = new Node(1);
Node b = new Node(1);
a.left = new Node(2);
a.right = new Node(3);
a.left.left = new Node(4);
a.left.right = new Node(5);
b.left = new Node(3);
b.right = new Node(2);
b.right.left = new Node(5);
b.right.right = new Node(4);
if (tree.areMirror(a, b) == true)
System.out.println("Yes");
else
System.out.println("No");
}
}

