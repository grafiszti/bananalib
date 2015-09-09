package pl.grafiszti.bananalib.list.arrayList;

import pl.grafiszti.bananalib.list.List;

public class ArrayList implements List {
    private static final int INIT_ARRAY_SIZE = 10;
    private static final int INIT_INDEX_VALUE = 0;
    private static final byte ARRAY_LIST_SIZE_INCREASE_FACTOR = 2;
    private static final int NOT_FOUND_VALUE = -1;
    private Object[] data;
    private int index;

    public ArrayList() {
        data = new Object[INIT_ARRAY_SIZE];
        index = INIT_INDEX_VALUE;
    }

    @Override
    public void add(Object element) {
        if (data.length == index) {
            Object[] dataCopy = data;
            data = new Object[index * ARRAY_LIST_SIZE_INCREASE_FACTOR];
            System.arraycopy(dataCopy, 0, data, 0, dataCopy.length);
        }
        data[index++] = element;
    }

    @Override
    public boolean remove(Object element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(element)) {
                data[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public boolean contains(Object element) {
        for (Object aData : data) {
            if (aData.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
        return index >= this.index ? null : data[index];
    }

    @Override
    public int getIndex(Object element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return NOT_FOUND_VALUE;
    }

    @Override
    public int size() {
        return index;
    }
}
