package pl.grafiszti.bananalib.list.arrayList;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ArrayListTest {
    ArrayList arrayList;

    @Before
    public void init() {
        arrayList = new ArrayList();
    }

    @Test
    public void testAddingIntegerElement() {
        arrayList.add(new Integer(1));
        assertEquals(1, arrayList.size());
        assertEquals(true, arrayList.get(0) instanceof Integer);
    }

    @Test
    public void testAddingStringElement() {
        arrayList.add(new String("ASD"));
        assertEquals(1, arrayList.size());
        assertEquals(true, arrayList.get(0) instanceof String);
    }

    @Test
    public void testAddingAndRemovingOneElementOnEmptyList() {
        Integer element = new Integer(2);
        arrayList.add(element);
        arrayList.removeFirst(element);

        for (int i = 0; i < arrayList.asArray().length; i++) {
            assertNull(arrayList.asArray()[i]);
        }

        assertEquals(0, arrayList.size());
    }

    @Test
    public void testAddingAndRemovingOneElementOnNotEmptyList() {
        addRandomElementsToList();
        Integer element = new Integer(10000000);
        arrayList.add(element);
        int arraySizeBeforeRemove = arrayList.size();
        arrayList.removeFirst(element);
        assertEquals(arraySizeBeforeRemove - 1, arrayList.size());
    }

    private void addRandomElementsToList() {
        for (int i = 0; i < new Random().nextInt(100) + 3; i++) {
            arrayList.add(new Integer(new Random().nextInt(1000)));
        }
    }

    @Test
    public void testIsEmpty() {
        assertEquals(true, arrayList.isEmpty());
        arrayList.add(new Integer(1));
        assertEquals(false, arrayList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnEmptyList() {
        Integer element = new Integer(1);
        for(int i = 0; i < 100; i++){
            arrayList.add(element);
        }

        assertEquals(true, arrayList.remove(element));
        assertEquals(0, arrayList.size());
        assertEquals(true, arrayList.isEmpty());
    }
}
