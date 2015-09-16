package pl.grafiszti.bananalib.list.linkedList;

import org.junit.Test;
import pl.grafiszti.bananalib.list.ListTest;
import pl.grafiszti.bananalib.list.linkedList.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest implements ListTest {
    public void init() {

    }

    @Test
    public void testAddingIntegerElement() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(new Integer(1));
        assertEquals(1, linkedList.size());
        assertEquals(false, linkedList.isEmpty());
    }

    @Test
    public void testAddingStringElement() {

    }

    @Test
    public void testAdding100ElementsToList() {

    }

    @Test
    public void testAddHugeAmountOfElements() {

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
