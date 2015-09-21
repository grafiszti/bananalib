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
                removeNode(currentNode);
                return;
            } else {
                currentNode = currentNode.getNext();
            }
        }
    }

    private void removeNode(Node node) {
        if (onlyOneElementOnList(node)) {
            root = null;
            lastNode = null;
        } else if (firstElementOnList(node)) {
            node.getNext().setPrev(null);
        } else if (centerElementOnList(node)) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        } else if (lastElementOnList(node)) {
            node.getPrev().setNext(null);
            lastNode = node.getPrev();
        }
        size--;
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
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                Node nodeToRemove = currentNode;
                currentNode = currentNode.getNext();
                removeNode(nodeToRemove);
            } else {
                currentNode = currentNode.getNext();
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
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
        Node currentNode = root;
        int counter = 0;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                return counter;
            } else {
                counter++;
                currentNode = currentNode.getNext();
            }
        }
        return -1;
    }

    public int size() {
        return this.size;
    }
}
