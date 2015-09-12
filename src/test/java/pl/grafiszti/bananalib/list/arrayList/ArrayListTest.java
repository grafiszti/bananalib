package pl.grafiszti.bananalib.list.arrayList;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ArrayListTest {
    ArrayList arrayList;
    private static final int MAX_RANDOM_NUMBER_TO_TEST = 1000;
    private static final int TEST_INT = 2 * MAX_RANDOM_NUMBER_TO_TEST;
    private static final String TEST_STRING = "ASD";
    private static final int TEST_OBJECTS_QUANTITY = 100;

    @Before
    public void init() {
        arrayList = new ArrayList();
    }

    @Test
    public void testAddingIntegerElement() {
        arrayList.add(new Integer(TEST_INT));
        assertEquals(1, arrayList.size());
        assertEquals(true, arrayList.get(0) instanceof Integer);
    }

    @Test
    public void testAddingStringElement() {
        arrayList.add(TEST_STRING);
        assertEquals(1, arrayList.size());
        assertEquals(true, arrayList.get(0) instanceof String);
    }

    @Test
    public void testContainElementOnEmptyList() {
        Integer element = new Integer(TEST_INT);

        arrayList.add(element);
        assertEquals(true, arrayList.contains(element));

        arrayList.removeFirst(element);
        assertEquals(false, arrayList.contains(element));
    }

    @Test
    public void testAddingAndRemovingOneElementOnEmptyList() {
        Integer element = new Integer(TEST_INT);
        arrayList.add(element);
        arrayList.removeFirst(element);

        for (int i = 0; i < arrayList.asArray().length; i++) {
            assertNull(arrayList.asArray()[i]);
        }

        assertEquals(0, arrayList.size());
    }

    @Test
    public void testAdding100ElementsToList() {
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);
        assertEquals(TEST_OBJECTS_QUANTITY, arrayList.size());
    }

    @Test
    public void testAddingAndRemovingOneElementOnNotEmptyList() {
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);
        Integer element = new Integer(TEST_INT);

        arrayList.add(element);
        int arraySizeBeforeRemove = arrayList.size();

        arrayList.removeFirst(element);
        assertEquals(arraySizeBeforeRemove - 1, arrayList.size());
    }

    private void addRandomElementsToList(int n) {
        for (int i = 0; i < n; i++) {
            arrayList.add(new Integer(new Random().nextInt(MAX_RANDOM_NUMBER_TO_TEST)));
        }
    }

    @Test
    public void testIsEmpty() {
        assertEquals(true, arrayList.isEmpty());
        arrayList.add(new Integer(TEST_INT));
        assertEquals(false, arrayList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnEmptyList() {
        Integer element = new Integer(TEST_INT);
        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, element);

        arrayList.remove(element);

        assertEquals(0, arrayList.size());
        assertEquals(true, arrayList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnNotEmptyList() {
        int numberOfElementsBeforeRepeated = TEST_OBJECTS_QUANTITY;
        addRandomElementsToList(numberOfElementsBeforeRepeated);

        Integer element = new Integer(TEST_INT);
        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, element);

        int numberOfElementsAfterRepeated = TEST_OBJECTS_QUANTITY;
        addRandomElementsToList(numberOfElementsAfterRepeated);

        arrayList.remove(element);
        
        assertEquals(numberOfElementsBeforeRepeated + numberOfElementsAfterRepeated, arrayList.size());
    }

    private void addRepeatedElementsToList(int n, Object element) {
        for (int i = 0; i < n; i++) {
            arrayList.add(element);
        }
    }
}
