// Add two numbers represented by linked lists

/*
Given two numbers represented by two lists, write a function that returns sum list. The sum list is list representation of addition of two input numbers.

Suppose you have two linked list 5->4 ( 4 5 )and 5->4->3( 3 4 5) you have to return  a resultant linked list 0->9->3 (3 9 0).
*/

/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class Test
{
	Node addTwoLists(Node first, Node second)
	{  
	    int carry =0;
	    int sum;
	    Node temp;
	    Node prev;
	    int modulo;
	    Add_LinkedList res = new Add_LinkedList();
	    while(first !=null || second != null){
	        int f,s;
	        if(first!=null)
	            f= first.data;
	        else 
	            f=0;
	        if(second != null)
	            s= second.data;
	        else
	            s = 0;
	        sum = carry + f + s;
	        
	        if (sum>=10)
	            carry = 1;
	        else
	            carry = 0;
	        
	        modulo = sum % 10;
	        
	        res.push(modulo);
	        if(first !=null)
	            first = first.next;
	        if(second !=null)
	            second = second.next;
	        
	    }
	    if(carry>0)
	        res.push(carry);
	        
	    return rev(res.head);
	}
	
	public static Node rev (Node node){
	    Node prev =null;
	    Node current = node;
	    Node next =current.next;
	    
	    while(current != null){
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }
	    
	    return prev;
	}
}