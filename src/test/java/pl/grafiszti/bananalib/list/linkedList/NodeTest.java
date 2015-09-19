package pl.grafiszti.bananalib.list.linkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test
    public void testCreateNode() {
        Integer value = 1;
        Node<Integer> node = new Node<Integer>(null, value, null);
        assertEquals(null, node.getPrev());
        assertEquals(value, node.getValue());
        assertEquals(null, node.getNext());
    }

    @Test
    public void testGettingNextNode() {
        Integer value = 1;
        Node<Integer> node = new Node<Integer>(null, value, null);

        assertEquals(true, node.getNext() == null);

        Node<Integer> nextNode = new Node<Integer>(node, 2, null);
        node.setNext(nextNode);

        assertEquals(nextNode, node.getNext());
    }
}
