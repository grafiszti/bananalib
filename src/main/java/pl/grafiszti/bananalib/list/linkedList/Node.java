package pl.grafiszti.bananalib.list.linkedList;

public class Node<E> {
    private Node prev;
    private E value;
    private Node next;

    public Node(Node prev, E value, Node next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return this.prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public E getValue() {
        return this.value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
