// Count BST nodes that lie in a given range

/*
Given a Binary Search Tree (BST) and a range, count the number of nodes in the BST that lie in the given range. You are required to complete the function getCountOfNode. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.
*/


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

// A Binary Search Tree node
/*class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Test
{   int  count = 0;
    int getCountOfNode(Node root, int low, int high) 
    {
        if (root== null) return 0;
        
        int left = getCountOfNode(root.left, low, high);
        
        int item = root.data;
        
        if (item >= low && item <=high)
            count++ ;
        
        int right = getCountOfNode(root.right, low, high);
        return count;
    }
}