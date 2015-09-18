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

    @Override
    public void testAddingIntegerElementToNotEmptyList() {

    }

    @Test
    public void testAddingStringElementToEmptyList() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add(TEST_STRING);
        assertEquals(1, linkedList.size());
        assertEquals(false, linkedList.isEmpty());
    }

    @Override
    public void testAddingStringElementToNotEmptyList() {

    }

    @Test
    public void testAdding100ElementsToEmptyList() {

    }

    @Override
    public void testAdding100ElementsToNotEmptyList() {

    }

    @Test
    public void testAddHugeAmountOfElementsToEmptyList() {

    }

    @Override
    public void testAddHugeAmountOfElementsToNotEmptyList() {

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
