package main.java.linkedlist.singlelinkedlist;

/**
 * Created by amitsjoshi on 03/09/16.
 */
public class LinkedList {

    private Node head;

    public LinkedList(final Node head)
    {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(final Node head) {
        this.head = head;
    }

    public void appendNode(final Node node)
    {
        if(node != null)
        {
            if(head == null)
            {
                head = node;
            }
            else
            {
                Node ptr = head;
                while(ptr.getNext() != null)
                {
                    ptr = ptr.getNext();
                }
                ptr.setNext(node);
            }
        }
    }
}
