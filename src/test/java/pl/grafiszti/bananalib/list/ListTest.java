package pl.grafiszti.bananalib.list;

public interface ListTest {
    void init();

    void testAddingIntegerElement();

    void testAddingStringElement();

    void testAdding100ElementsToList();

    void testAddHugeAmountOfElements();

    void testContainElementOnEmptyList();

    void testContainElementOnNotEmptyList();

    void testAddingAndRemovingOneElementOnEmptyList();

    void testAddingAndRemovingOneElementOnNotEmptyList();

    void testIsEmpty();

    void testRemoveRepeatedElementsOnEmptyList();

    void testRemoveRepeatedElementsOnNotEmptyList();
}
