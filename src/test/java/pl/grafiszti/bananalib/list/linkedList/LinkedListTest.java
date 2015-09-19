package pl.grafiszti.bananalib.list.linkedList;

import org.junit.Test;
import pl.grafiszti.bananalib.list.ListTest;

import static org.junit.Assert.assertEquals;

public class LinkedListTest extends ListTest {

    @Test
    public void testAddingIntegerElementToEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(testObjectInteger);
        assertEquals(1, linkedList.size());
        assertEquals(false, linkedList.isEmpty());
    }

    @Test
    public void testAddingIntegerElementToNotEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);

        linkedList.add(testObjectInteger);
        assertEquals(TEST_OBJECTS_QUANTITY + 1, linkedList.size());
        assertEquals(true, linkedList.contains(testObjectInteger));
    }

    @Test
    public void testAddingStringElementToEmptyList() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add(TEST_STRING);
        assertEquals(1, linkedList.size());
        assertEquals(false, linkedList.isEmpty());
    }

    @Test
    public void testAddingStringElementToNotEmptyList() {

    }

    @Test
    public void testAdding100ElementsToEmptyList() {

    }

    @Test
    public void testAddHugeAmountOfElementsToEmptyList() {

    }

    @Test
    public void testContainElementOnEmptyList() {

    }

    @Test
    public void testContainElementOnNotEmptyList() {

    }

    @Test
    public void testAddingAndRemovingOneElementOnEmptyList() {

    }

    @Test
    public void testAddingAndRemovingOneElementOnNotEmptyList() {

    }

    @Test
    public void testIsEmpty() {

    }

    @Test
    public void testRemoveRepeatedElementsOnEmptyList() {

    }

    @Test
    public void testRemoveRepeatedElementsOnNotEmptyList() {

    }

    @Test
    public void testSize() {

    }

    @Test
    public void testGetIndexOfElementOnEmptyList() {

    }

    @Test
    public void testGetIndexOfElementOnNotEmptyList() {

    }
}
