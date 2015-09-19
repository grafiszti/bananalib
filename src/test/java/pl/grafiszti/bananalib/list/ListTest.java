package pl.grafiszti.bananalib.list;

import org.junit.Before;

public abstract class ListTest {
    protected static final int MAX_RANDOM_NUMBER_TO_TEST = 1000;
    protected static final int TEST_INT = 2 * MAX_RANDOM_NUMBER_TO_TEST;
    protected static final String TEST_STRING = "ASD";
    protected static final int TEST_OBJECTS_QUANTITY = 100;

    protected Integer testObjectInteger;
    protected Boolean testObjectBoolean;

    @Before
    public void init() {
        testObjectInteger = TEST_INT;
        testObjectBoolean = true;
    }

    public abstract void testAddingIntegerElementToEmptyList();

    public abstract void testAddingIntegerElementToNotEmptyList();

    public abstract void testAddingStringElementToEmptyList();

    public abstract void testAddingStringElementToNotEmptyList();

    public abstract void testAdding100ElementsToEmptyList();

    public abstract void testAdding100ElementsToNotEmptyList();

    public abstract void testAddHugeAmountOfElementsToEmptyList();

    public abstract void testAddHugeAmountOfElementsToNotEmptyList();

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
