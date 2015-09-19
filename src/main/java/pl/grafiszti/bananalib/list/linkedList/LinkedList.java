package pl.grafiszti.bananalib.list.linkedList;

import pl.grafiszti.bananalib.list.List;

public class LinkedList<E> implements List<E> {
    Node root = null;

    public void add(E element) {
        if (root == null) {
            root = new Node<E>(0, null, element, null);
        } else {
            Node lastNode = getLastNode(root);
            Node newNode = new Node<E>(lastNode.getId() + 1, lastNode, element, null);
            lastNode.setNext(newNode);
        }
    }

    private Node getLastNode(Node node) {
        if (node.getNext() == null) {
            return node;
        } else {
            return getLastNode(node.getNext());
        }
    }

    public void removeFirst(E element) {

    }

    public void remove(E element) {

    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(E element) {
        return false;
    }

    public E get(int index) {
        return null;
    }

    public int getIndex(E element) {
        return 0;
    }

    public int size() {
        return getLastNode(root).getId() + 1;
    }
}
