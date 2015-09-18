package pl.grafiszti.bananalib.list.linkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test
    public void testCreateNode() {
        Integer value = new Integer(1);
        Node<Integer> node = new Node<Integer>(0, null, value, null);
        assertEquals(true, node != null);
    }

    @Test
    public void testGettingNextNode() {
        Integer value = new Integer(1);
        Node<Integer> node = new Node<Integer>(0, null, value, null);

        assertEquals(true, node.getNext() == null);

        Node<Integer> nextNode = new Node<Integer>(1, node, new Integer(2), null);
        node.setNext(nextNode);

        assertEquals(nextNode, node.getNext());
    }
}
