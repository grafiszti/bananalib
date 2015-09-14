package pl.grafiszti.bananalib.list.arrayList;

import org.junit.Before;
import org.junit.Test;
import pl.grafiszti.bananalib.list.ListTest;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ArrayListTest implements ListTest {

    private ArrayList arrayList;

    private static final int MAX_RANDOM_NUMBER_TO_TEST = 1000;
    private static final int TEST_INT = 2 * MAX_RANDOM_NUMBER_TO_TEST;
    private static final String TEST_STRING = "ASD";
    private static final int TEST_OBJECTS_QUANTITY = 100;

    private Integer testObjectInteger;
    private Boolean testObjectBoolean;

    @Before
    public void init() {
        arrayList = new ArrayList();
        testObjectInteger = new Integer(TEST_INT);
        testObjectBoolean = new Boolean(true);
    }

    @Test
    public void testAddingIntegerElement() {
        arrayList.add(testObjectInteger);
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
    public void testAdding100ElementsToList() {
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);
        assertEquals(TEST_OBJECTS_QUANTITY, arrayList.size());
    }

    @Test
    public void testAddHugeAmountOfElements() {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(testObjectBoolean);
        }
        assertEquals(1000000, arrayList.size());
    }

    @Test
    public void testContainElementOnEmptyList() {
        arrayList.add(testObjectInteger);
        assertEquals(true, arrayList.contains(testObjectInteger));

        arrayList.removeFirst(testObjectInteger);
        assertEquals(false, arrayList.contains(testObjectInteger));
    }

    public void testContainElementOnNotEmptyList() {
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);
        arrayList.add(testObjectInteger);
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);

        assertEquals(true, arrayList.contains(testObjectInteger));
    }

    @Test
    public void testAddingAndRemovingOneElementOnEmptyList() {
        arrayList.add(testObjectInteger);
        arrayList.removeFirst(testObjectInteger);

        for (int i = 0; i < arrayList.asArray().length; i++) {
            assertNull(arrayList.asArray()[i]);
        }

        assertEquals(0, arrayList.size());
    }

    @Test
    public void testAddingAndRemovingOneElementOnNotEmptyList() {
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);

        arrayList.add(testObjectInteger);
        int arraySizeBeforeRemove = arrayList.size();

        arrayList.removeFirst(testObjectInteger);
        assertEquals(arraySizeBeforeRemove - 1, arrayList.size());
    }

    @Test
    public void testIsEmpty() {
        assertEquals(true, arrayList.isEmpty());
        arrayList.add(testObjectInteger);
        assertEquals(false, arrayList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnEmptyList() {
        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, testObjectInteger);

        arrayList.remove(testObjectInteger);

        assertEquals(0, arrayList.size());
        assertEquals(true, arrayList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnNotEmptyList() {
        int numberOfElementsBeforeRepeated = TEST_OBJECTS_QUANTITY;
        addRandomElementsToList(numberOfElementsBeforeRepeated);

        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, testObjectInteger);

        int numberOfElementsAfterRepeated = TEST_OBJECTS_QUANTITY;
        addRandomElementsToList(numberOfElementsAfterRepeated);

        arrayList.remove(testObjectInteger);

        assertEquals(numberOfElementsBeforeRepeated + numberOfElementsAfterRepeated, arrayList.size());
    }

    @Test
    public void testSize(){
        int numberOfElements = 123456;
        addRandomElementsToList(numberOfElements);
        assertEquals(numberOfElements, arrayList.size());
    }

    @Test
    public void testGetIndexOfElementOnEmptyList(){
        arrayList.add(testObjectInteger);
        assertEquals(0, arrayList.getIndex(testObjectInteger));
    }

    @Test
    public void testGetIndexOfElementOnNotEmptyList(){
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);
        arrayList.add(testObjectInteger);
        addRandomElementsToList(TEST_OBJECTS_QUANTITY);

        assertEquals(TEST_OBJECTS_QUANTITY, arrayList.getIndex(testObjectInteger));
    }

    private void addRandomElementsToList(int n) {
        for (int i = 0; i < n; i++) {
            arrayList.add(new Integer(new Random().nextInt(MAX_RANDOM_NUMBER_TO_TEST)));
        }
    }

    private void addRepeatedElementsToList(int n, Object element) {
        for (int i = 0; i < n; i++) {
            //arrayList.add(element);
        }
    }
}
