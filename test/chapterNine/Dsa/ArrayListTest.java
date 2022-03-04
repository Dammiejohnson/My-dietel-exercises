package chapterNine.Dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    ArrayList myList;
    @BeforeEach
    public void setUp() {
        myList = new ArrayList();
    }

    @Test
    public void myListCanBeCreatedTest() { //new list is empty
        assertNotNull(myList);
        assertTrue(myList.isEmpty());
    }

    @Test
    public void addItem_ListIsNotEmptyTest(){
        myList.add("Item");
        assertFalse(myList.isEmpty());
    }

    @Test
    public void addItem_removeItem_listIsEmptyTest(){
        myList.add("item");
        myList.remove("item");
        assertTrue(myList.isEmpty());
    }



    @Test
    public void addItem_SizeIsOneTest(){
        myList.add("item");
        assertEquals(1,myList.size());
    }

    @Test
    public void addTwoItems_sizeIsTwoTest() {
        myList.add("Item");
        myList.add("item");

    }
}
