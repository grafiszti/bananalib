package pl.grafiszti.bananalib.list.arrayList;

import org.junit.Before;
import org.junit.Test;

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
    public void testAddingAndRemovingOneElement() {
        Integer element = new Integer(2);
        arrayList.add(element);
        arrayList.removeFirst(element);

        for (int i = 0; i < arrayList.asArray().length; i++) {
            assertNull(arrayList.asArray()[i]);
        }

        assertEquals(0, arrayList.size());
    }

    @Test
    public void testSizeList() {
    }
}
