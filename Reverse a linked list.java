// Reverse a linked list

/*
Given pointer to the head node of a linked list, the task is to reverse the linked list.
*/

/* Return reference of new head of the reverse linked list 
 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */
class Test
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverse(Node head)
   {
         Node current=head;
        Node next = null;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    return prev;
   }
}