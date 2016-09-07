package main.test;

import junit.framework.TestCase;
import main.java.linkedlist.singlelinkedlist.Node;
import main.java.linkedlist.singlelinkedlist.Problems;

/**
 * Created by amitsjoshi on 07/09/16.
 */
public class ProblemsTest extends TestCase
{
    public void testNThNodeFromEnd_BruteForce()
    {
        Node result;
        result = Problems.nThNodeFromEnd_BruteForce(10);
        assertEquals( 1, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(9);
        assertEquals( 2, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(8);
        assertEquals( 3, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(7);
        assertEquals( 4, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(6);
        assertEquals( 5, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(5);
        assertEquals( 6, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(4);
        assertEquals( 7, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(3);
        assertEquals( 8, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(2);
        assertEquals( 9, result.getData());
        result = Problems.nThNodeFromEnd_BruteForce(0);
        assertEquals( 10, result.getData());
        //exceptional scenarios
        result = Problems.nThNodeFromEnd_BruteForce(11);
        assertNull(result);
        result = Problems.nThNodeFromEnd_BruteForce(-1);
        assertNull(result);
    }

}
