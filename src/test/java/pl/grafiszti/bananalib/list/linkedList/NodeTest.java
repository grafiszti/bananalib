package pl.grafiszti.bananalib.list.linkedList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test
    public void testCreateNode(){
        Integer value = new Integer(1);
        Node<Integer> node = new Node<Integer>(null, value, null);
        assertEquals(true, node != null);
    }

    @Test
    public void testGettingNextNode(){
        Integer value = new Integer(1);
        Node<Integer> node = new Node<Integer>(null, value, null);
s
        assertEquals(true, node.getNext() == null);

        Node<Integer> nextNode = new Node<Integer>(node, new Integer(2), null);
        node.setNext(nextNode);

        assertEquals(nextNode, node.getNext());
    }
}
