package pl.grafiszti.bananalib.list.arrayList;

import org.junit.Test;
import pl.grafiszti.bananalib.list.ListTest;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ArrayListTest extends ListTest {
    @Test
    public void testAddingIntegerElementToEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(testObjectInteger);
        assertEquals(1, arrayList.size());
        assertEquals(true, arrayList.get(0) != null);
    }

    @Override
    public void testAddingIntegerElementToNotEmptyList() {

    }

    @Test
    public void testAddingStringElementToEmptyList() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(TEST_STRING);
        assertEquals(1, arrayList.size());
        assertEquals(true, arrayList.get(0) != null);
    }

    @Override
    public void testAddingStringElementToNotEmptyList() {

    }

    @Test
    public void testAdding100ElementsToEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        addRandomElementsToList(TEST_OBJECTS_QUANTITY, arrayList);
        assertEquals(TEST_OBJECTS_QUANTITY, arrayList.size());
    }

    @Override
    public void testAdding100ElementsToNotEmptyList() {

    }

    @Test
    public void testAddHugeAmountOfElementsToEmptyList() {
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(testObjectBoolean);
        }
        assertEquals(1000000, arrayList.size());
    }

    @Override
    public void testAddHugeAmountOfElementsToNotEmptyList() {

    }

    @Test
    public void testContainElementOnEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(testObjectInteger);
        assertEquals(true, arrayList.contains(testObjectInteger));

        arrayList.removeFirst(testObjectInteger);
        assertEquals(false, arrayList.contains(testObjectInteger));
    }

    @Test
    public void testContainElementOnNotEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        addRandomElementsToList(TEST_OBJECTS_QUANTITY, arrayList);
        arrayList.add(testObjectInteger);
        addRandomElementsToList(TEST_OBJECTS_QUANTITY, arrayList);

        assertEquals(true, arrayList.contains(testObjectInteger));
    }

    @Test
    public void testAddingAndRemovingOneElementOnEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(testObjectInteger);
        arrayList.removeFirst(testObjectInteger);
        assertEquals(0, arrayList.size());
        assertEquals(true, arrayList.isEmpty());
    }

    @Test
    public void testAddingAndRemovingOneElementOnNotEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        addRandomElementsToList(TEST_OBJECTS_QUANTITY, arrayList);

        arrayList.add(testObjectInteger);
        int arraySizeBeforeRemove = arrayList.size();

        arrayList.removeFirst(testObjectInteger);
        assertEquals(arraySizeBeforeRemove - 1, arrayList.size());
    }

    @Test
    public void testIsEmpty() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        assertEquals(true, arrayList.isEmpty());
        arrayList.add(testObjectInteger);
        assertEquals(false, arrayList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, testObjectInteger, arrayList);

        arrayList.remove(testObjectInteger);

        assertEquals(0, arrayList.size());
        assertEquals(true, arrayList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnNotEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int numberOfElementsBeforeRepeated = TEST_OBJECTS_QUANTITY;
        addRandomElementsToList(numberOfElementsBeforeRepeated, arrayList);

        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, testObjectInteger, arrayList);

        int numberOfElementsAfterRepeated = TEST_OBJECTS_QUANTITY;
        addRandomElementsToList(numberOfElementsAfterRepeated, arrayList);

        arrayList.remove(testObjectInteger);

        assertEquals(numberOfElementsBeforeRepeated + numberOfElementsAfterRepeated, arrayList.size());
    }

    @Test
    public void testSize() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int numberOfElements = 123456;
        addRandomElementsToList(numberOfElements, arrayList);
        assertEquals(numberOfElements, arrayList.size());
    }

    @Test
    public void testGetIndexOfElementOnEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(testObjectInteger);
        assertEquals(0, arrayList.getIndex(testObjectInteger));
    }

    @Test
    public void testGetIndexOfElementOnNotEmptyList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        addRandomElementsToList(TEST_OBJECTS_QUANTITY, arrayList);
        arrayList.add(testObjectInteger);
        addRandomElementsToList(TEST_OBJECTS_QUANTITY, arrayList);

        assertEquals(TEST_OBJECTS_QUANTITY, arrayList.getIndex(testObjectInteger));
    }

    private void addRandomElementsToList(int n, ArrayList<Integer> arrayList) {
        for (int i = 0; i < n; i++) {
            arrayList.add(new Random().nextInt(MAX_RANDOM_NUMBER_TO_TEST));
        }
    }

    private void addRepeatedElementsToList(int n, Integer element, ArrayList<Integer> arrayList) {
        for (int i = 0; i < n; i++) {
            arrayList.add(element);
        }
    }
}
