package pl.grafiszti.bananalib.list;

public interface List <E> {
    void add(E element);
    boolean removeFirst(E element);
    boolean remove(E element);
    boolean isEmpty();
    boolean contains(E element);
    E get(int index);
    int getIndex(E element);
    int size();
}
