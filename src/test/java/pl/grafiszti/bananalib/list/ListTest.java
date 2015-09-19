package pl.grafiszti.bananalib.list;

import org.junit.Before;

import java.util.Random;

public abstract class ListTest {
    protected static final int MAX_RANDOM_NUMBER_TO_TEST = 1000;
    protected static final int MAX_RANDOM_STRING_LENGTH_TO_TEST = 10;
    protected static final int TEST_INT = 2 * MAX_RANDOM_NUMBER_TO_TEST;
    protected static final String TEST_STRING = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
    protected static final int TEST_OBJECTS_QUANTITY = 100;
    protected static final int HUGE_OBJECTS_QUANTITY = 1000000;

    protected Integer testObjectInteger;
    protected Boolean testObjectBoolean;

    @Before
    public void init() {
        testObjectInteger = TEST_INT;
        testObjectBoolean = true;
    }

    protected void addRandomIntegerElementsToList(int n, List<Integer> list) {
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(MAX_RANDOM_NUMBER_TO_TEST));
        }
    }

    protected void addRandomStringElementsToList(int n, List<String> list) {
        for (int i = 0; i < n; i++) {
            list.add(Integer.toString(new Random().nextInt(10 * MAX_RANDOM_STRING_LENGTH_TO_TEST)));
        }
    }

    protected void addRepeatedElementsToList(int n, Integer element, List<Integer> list) {
        for (int i = 0; i < n; i++) {
            list.add(element);
        }
    }

    public abstract void testAddingIntegerElementToEmptyList();

    public abstract void testAddingIntegerElementToNotEmptyList();

    public abstract void testAddingStringElementToEmptyList();

    public abstract void testAddingStringElementToNotEmptyList();

    public abstract void testAdding100ElementsToEmptyList();

    public abstract void testAddHugeAmountOfElementsToEmptyList();

    public abstract void testContainElementOnEmptyList();

    public abstract void testContainElementOnNotEmptyList();

    public abstract void testAddingAndRemovingOneElementOnEmptyList();

    public abstract void testAddingAndRemovingOneElementOnNotEmptyList();

    public abstract void testIsEmpty();

    public abstract void testRemoveRepeatedElementsOnEmptyList();

    public abstract void testRemoveRepeatedElementsOnNotEmptyList();

    public abstract void testSize();

    public abstract void testGetIndexOfElementOnEmptyList();

    public abstract void testGetIndexOfElementOnNotEmptyList();
}
