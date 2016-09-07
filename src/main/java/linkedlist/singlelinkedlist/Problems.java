package main.java.linkedlist.singlelinkedlist;

/**
 * Created by amitsjoshi on 03/09/16.
 */
public class Problems {

    private static LinkedList ll;

    public static void buildLinkedList()
    {
        Node head = new Node(1);
        ll = new LinkedList(head);
        ll.appendNode(new Node(2));
        ll.appendNode(new Node(3));
        ll.appendNode(new Node(4));
        ll.appendNode(new Node(5));
        ll.appendNode(new Node(6));
        ll.appendNode(new Node(7));
        ll.appendNode(new Node(8));
        ll.appendNode(new Node(9));
        ll.appendNode(new Node(10));
    }

    //Find the nth node from the end of the LinkedList:
    //1. Brute force method - from every node calculate how many nodes are present form itself to the end
    //2. HashMap that stores the node position and address
    //3. Traverse once to get the size. Traverse second time to get the (Length - n)th node
    //4. Find the element in one scan
    public static Node nThNodeFromEnd_BruteForce( final int n)
    {
        buildLinkedList();
        Node ptr1 = null;
        Node ptr2;
        int length = 0;

        do
        {
            if (ptr1 == null)
            {
                ptr1 = ll.getHead();
            }
            else
            {
                ptr1 = ptr1.getNext();
            }
            ptr2 = ptr1.getNext();

            if(ptr2 != null)
            {
                length = 1;
                while( ptr2.getNext() != null )
                {
                    length++;
                    ptr2 = ptr2.getNext();
                }
            }
        } while( length > (n - 1) && ptr1.getNext() != null );

        if(length != (n - 1))
        {
            return null;
        }

        return ptr1;
    }

}
