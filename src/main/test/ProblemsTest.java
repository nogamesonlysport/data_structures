package main.test;

import junit.framework.TestCase;
import main.java.linkedlist.singlelinkedlist.Node;
import main.java.linkedlist.singlelinkedlist.Problems;

/**
 * Created by amitsjoshi on 07/09/16.
 */
public class ProblemsTest extends TestCase
{
    //TODO - rewrite these tests using reflection
    
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
        //TODO - need to fix this
//        result = Problems.nThNodeFromEnd_BruteForce(1);
//        assertEquals( 10, result.getData());
        //exceptional scenarios
        result = Problems.nThNodeFromEnd_BruteForce(11);
        assertNull(result);
        result = Problems.nThNodeFromEnd_BruteForce(-1);
        assertNull(result);
    }

    public void testNThNodeFromEnd_HashMap()
    {
        Node result;
        result = Problems.nThNodeFromEnd_HashMap(10);
        assertEquals( 1, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(9);
        assertEquals( 2, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(8);
        assertEquals( 3, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(7);
        assertEquals( 4, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(6);
        assertEquals( 5, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(5);
        assertEquals( 6, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(4);
        assertEquals( 7, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(3);
        assertEquals( 8, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(2);
        assertEquals( 9, result.getData());
        result = Problems.nThNodeFromEnd_HashMap(1);
        assertEquals( 10, result.getData());
        //exceptional scenarios
        result = Problems.nThNodeFromEnd_HashMap(11);
        assertNull(result);
        result = Problems.nThNodeFromEnd_HashMap(-1);
        assertNull(result);
    }

    public void testNThNodeFromEnd_TwoIterations()
    {
        Node result;
        result = Problems.nThNodeFromEnd_TwoIterations(10);
        assertEquals( 1, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(9);
        assertEquals( 2, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(8);
        assertEquals( 3, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(7);
        assertEquals( 4, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(6);
        assertEquals( 5, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(5);
        assertEquals( 6, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(4);
        assertEquals( 7, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(3);
        assertEquals( 8, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(2);
        assertEquals( 9, result.getData());
        result = Problems.nThNodeFromEnd_TwoIterations(1);
        assertEquals( 10, result.getData());
        //exceptional scenarios
        result = Problems.nThNodeFromEnd_TwoIterations(11);
        assertNull(result);
        result = Problems.nThNodeFromEnd_TwoIterations(-1);
        assertNull(result);
    }

    public void testNThNodeFromEnd_OneScan()
    {
        Node result;
        result = Problems.nThNodeFromEnd_OneScan(10);
        assertEquals( 1, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(9);
        assertEquals( 2, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(8);
        assertEquals( 3, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(7);
        assertEquals( 4, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(6);
        assertEquals( 5, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(5);
        assertEquals( 6, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(4);
        assertEquals( 7, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(3);
        assertEquals( 8, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(2);
        assertEquals( 9, result.getData());
        result = Problems.nThNodeFromEnd_OneScan(1);
        assertEquals( 10, result.getData());
        //exceptional scenarios
        result = Problems.nThNodeFromEnd_OneScan(11);
        assertNull(result);
        result = Problems.nThNodeFromEnd_OneScan(-1);
        assertNull(result);
    }

}
