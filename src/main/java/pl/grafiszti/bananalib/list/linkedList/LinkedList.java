package pl.grafiszti.bananalib.list.linkedList;

import pl.grafiszti.bananalib.list.List;

public class LinkedList<E> implements List<E> {
    Node root;
    Node lastNode;
    int size;

    public LinkedList() {
        root = null;
        size = 0;
        lastNode = root;
    }

    public void add(E element) {
        Node newNode;
        if (root == null) {
            newNode = new Node<E>(null, element, null);
            root = newNode;
        } else {
            newNode = new Node<E>(lastNode, element, null);
            lastNode.setNext(newNode);
        }
        lastNode = newNode;
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
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                if (onlyOneElementOnList(currentNode)) {
                    root = null;
                    lastNode = null;
                } else if (firstElementOnList(currentNode)) {
                    currentNode.getNext().setPrev(null);
                } else if (centerElementOnList(currentNode)) {
                    currentNode.getPrev().setNext(currentNode.getNext());
                    currentNode.getNext().setPrev(currentNode.getPrev());
                } else if (lastElementOnList(currentNode)) {
                    currentNode.getPrev().setNext(null);
                    lastNode = currentNode.getPrev();
                }
                size--;
                return;
            } else {
                currentNode = currentNode.getNext();
            }
        }
    }

    private boolean onlyOneElementOnList(Node node) {
        return node.getPrev() == null && node.getNext() == null;
    }

    private boolean firstElementOnList(Node node) {
        return node.getPrev() == null && node.getNext() != null;
    }

    private boolean centerElementOnList(Node node) {
        return node.getPrev() != null && node.getNext() != null;
    }

    private boolean lastElementOnList(Node node) {
        return node.getPrev() != null && node.getPrev() == null;
    }

    public void remove(E element) {

    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(E element) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                return true;
            } else {
                currentNode = currentNode.getNext();
            }
        }
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
