// Mirror Tree

/* 
Given a Binary Tree, convert it into its mirror.
*/


class Node
{
    int data;
    Node left, right;
   Node(int item)    
   {
        data = item;
        left = right = null;
    }
}
class Test
{
    void mirror(Node node)
    {
	    if(node == null)
            return;
     
     if(node.left != null)
        mirror(node.left);
    
    if(node.right != null)
        mirror(node.right);
    
    Node temp;
    temp = node.left;
    node.left = node.right;
    node.right = temp;
    }
}