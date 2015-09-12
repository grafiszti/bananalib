package pl.grafiszti.bananalib.list.arrayList;

import pl.grafiszti.bananalib.list.List;

public class ArrayList<E> implements List<E> {
    private static final int INIT_ARRAY_SIZE = 10;
    private static final int INIT_INDEX_VALUE = 0;
    private static final byte ARRAY_LIST_SIZE_INCREASE_FACTOR = 2;
    private static final int NOT_FOUND_VALUE = -1;
    private E[] data;
    private int index;

    public ArrayList() {
        data = (E[]) new Object[INIT_ARRAY_SIZE];
        index = INIT_INDEX_VALUE;
    }

    public void add(E element) {
        if (data.length == index) {
            Object[] dataCopy = data;
            data = (E[]) new Object[index * ARRAY_LIST_SIZE_INCREASE_FACTOR];
            System.arraycopy(dataCopy, 0, data, 0, dataCopy.length);
        }
        data[index++] = element;
    }

    public void removeFirst(E element) {
        for (int i = 0; i < index; i++) {
            if (data[i].equals(element)) {
                for (int j = i; j < index; ) {
                    data[j] = data[++j];
                }
                index--;
                return;
            }
        }
    }

    public void remove(E element) {
        for (int i = 0; i < index; ) {
            if (data[i].equals(element)) {
                for (int j = i; j < index; ) {
                    data[j] = data[++j];
                }
                index--;
            } else {
                i++;
            }
        }
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean contains(E element) {
        for (E item : data) {
            if (item != null && item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public E get(int index) {
        return index >= this.index ? null : data[index];
    }

    public int getIndex(E element) {
        for (int i = 0; i < index; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return NOT_FOUND_VALUE;
    }

    public int size() {
        return index;
    }

    public E[] asArray() {
        return data;
    }
}
