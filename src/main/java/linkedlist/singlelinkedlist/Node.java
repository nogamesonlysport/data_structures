package main.java.linkedlist.singlelinkedlist;

/**
 * Created by amitsjoshi on 03/09/16.
 */
public class Node {

    private int data;

    private Node next;

    public Node(final int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
