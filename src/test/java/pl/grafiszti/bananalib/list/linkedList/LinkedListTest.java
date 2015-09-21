package pl.grafiszti.bananalib.list.linkedList;

import org.junit.Test;
import pl.grafiszti.bananalib.list.ListTest;

import static org.junit.Assert.*;

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
        LinkedList<String> linkedList = new LinkedList<String>();
        addRandomStringElementsToList(TEST_OBJECTS_QUANTITY, linkedList);

        linkedList.add(TEST_STRING);
        assertEquals(TEST_OBJECTS_QUANTITY + 1, linkedList.size());
        assertEquals(true, linkedList.contains(TEST_STRING));
    }

    @Test
    public void testAdding100ElementsToEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);
        assertEquals(TEST_OBJECTS_QUANTITY, linkedList.size());
    }

    @Test
    public void testAddHugeAmountOfElementsToEmptyList() {
        LinkedList<Boolean> linkedList = new LinkedList<Boolean>();
        for (int i = 0; i < HUGE_OBJECTS_QUANTITY; i++) {
            linkedList.add(testObjectBoolean);
        }
        assertEquals(HUGE_OBJECTS_QUANTITY, linkedList.size());
    }

    @Test
    public void testContainElementOnEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        assertFalse(linkedList.contains(TEST_INT));
        linkedList.add(TEST_INT);
        assertTrue(linkedList.contains(TEST_INT));
    }

    @Test
    public void testContainElementOnNotEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);
        linkedList.add(TEST_INT);
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);
        assertEquals(TEST_OBJECTS_QUANTITY * 2 + 1, linkedList.size());
        assertTrue(linkedList.contains(TEST_INT));
    }

    @Test
    public void testAddingAndRemovingOneElementOnEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(TEST_INT);
        assertTrue(linkedList.contains(TEST_INT));
        linkedList.removeFirst(TEST_INT);
        assertFalse(linkedList.contains(TEST_INT));
    }

    @Test
    public void testAddingAndRemovingOneElementOnNotEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);
        linkedList.add(TEST_INT);
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);

        assertEquals(TEST_OBJECTS_QUANTITY * 2 + 1, linkedList.size());
        assertTrue(linkedList.contains(TEST_INT));

        linkedList.removeFirst(TEST_INT);
        assertEquals(TEST_OBJECTS_QUANTITY * 2, linkedList.size());
        assertFalse(linkedList.contains(TEST_INT));
    }

    @Test
    public void testIsEmpty() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        assertTrue(linkedList.isEmpty());

        linkedList.add(TEST_INT);
        assertFalse(linkedList.isEmpty());

        linkedList.removeFirst(TEST_INT);
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, TEST_INT, linkedList);

        assertEquals(TEST_OBJECTS_QUANTITY, linkedList.size());
        assertFalse(linkedList.isEmpty());

        linkedList.remove(TEST_INT);
        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testRemoveRepeatedElementsOnNotEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);
        addRepeatedElementsToList(TEST_OBJECTS_QUANTITY, TEST_INT, linkedList);
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);

        assertEquals(TEST_OBJECTS_QUANTITY * 3, linkedList.size());
        linkedList.remove(TEST_INT);
        assertEquals(TEST_OBJECTS_QUANTITY * 2, linkedList.size());
        assertFalse(linkedList.contains(TEST_INT));
    }

    @Test
    public void testSize() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        assertEquals(0, linkedList.size());

        linkedList.add(TEST_INT);
        assertEquals(1, linkedList.size());

        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);
        assertEquals(1 + TEST_OBJECTS_QUANTITY, linkedList.size());
    }

    @Test
    public void testGetIndexOfElementOnEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(TEST_INT);

        assertEquals(0, linkedList.getIndex(TEST_INT));
    }

    @Test
    public void testGetIndexOfElementOnNotEmptyList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        addRandomIntegerElementsToList(TEST_OBJECTS_QUANTITY, linkedList);
        linkedList.add(TEST_INT);

        assertEquals(TEST_OBJECTS_QUANTITY, linkedList.getIndex(TEST_INT));
    }
}
