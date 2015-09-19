package pl.grafiszti.bananalib.list.linkedList;

import pl.grafiszti.bananalib.list.List;

public class LinkedList<E> implements List<E> {
    Node root;
    int size;

    public LinkedList() {
        Node root = null;
        int size = 0;
    }

    public void add(E element) {
        if (root == null) {
            root = new Node<E>(null, element, null);
        } else {
            Node lastNode = getLastNode();
            Node newNode = new Node<E>(lastNode, element, null);
            lastNode.setNext(newNode);
        }
        size++;
    }

    private Node getLastNode() {
        Node currentNode = root;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
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
        return this.size;
    }
}
