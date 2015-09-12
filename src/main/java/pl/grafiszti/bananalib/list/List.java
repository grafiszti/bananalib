package pl.grafiszti.bananalib.list;

public interface List <E> {
    void add(E element);
    void removeFirst(E element);
    void remove(E element);
    boolean isEmpty();
    boolean contains(E element);
    E get(int index);
    int getIndex(E element);
    int size();
}
