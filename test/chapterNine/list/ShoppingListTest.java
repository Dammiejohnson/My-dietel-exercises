package chapterNine.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingListTest {
    ShoppingList list;

    @BeforeEach
    public void setUpShoppingList() {
        list = new ShoppingList();
    }

    @Test
    public void checkListSize(){
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");
        assertEquals(3, list.getSize());
    }

    @Test
    public void canAddToTheLIst() {
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");
        list.addToList("ear_rings");
        list.addToList("necklace");
        list.addToList("pads");
       assertEquals(6, list.getSize());
        assertArrayEquals(new String[]{"chocolates", "eyeshadows", "lip-gloss", "ear_rings","necklace","pads", null, null, null, null}, list.getItems());
    }
    @Test
    public void checkListCapacity(){
        assertEquals(5, list.getCapacity());
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");
        list.addToList("ear_rings");
        list.addToList("necklace");
        list.addToList("pads");
        assertEquals(10, list.getCapacity());
        assertEquals(6, list.getSize());
    }

    @Test
    public void addToListByIndex(){
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");

        list.addToListByIndex("shoes",2);
        assertEquals(4, list.getSize());
        assertArrayEquals(new String[]{"chocolates", "eyeshadows", "shoes", "lip-gloss", null}, list.getItems());
    }

    @Test
    public void removeFromListByIndex(){
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");
        list.addToList("pads");

        list.removeFromListByIndex(2);
        assertEquals(3, list.getSize());
        assertArrayEquals(new String[]{"chocolates", "eyeshadows", "pads", null, null}, list.getItems());
    }

    @Test
    public void getByIndex(){
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");
        list.addToList("pads");

        list.getByIndex(2);
        assertEquals(4, list.getSize());
        assertEquals("lip-gloss", list.getPurchase());

    }

    @Test
    public void removeFromListByName(){
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");
        list.addToList("pads");

        list.removeFromListByName("eyeshadows");
        assertEquals(3, list.getSize());
        assertArrayEquals(new String[]{"chocolates", null, "lip-gloss", "pads", null}, list.getItems());
    }

    @Test
    public void removeLastInputFromList(){
        list.addToList("chocolates");
        list.addToList("eyeshadows");
        list.addToList("lip-gloss");
        list.addToList("pads");

        list.removeLastInputFromList(-1);
        assertEquals(3, list.getSize());
        assertArrayEquals(new String[]{"chocolates", "eyeshadows", "lip-gloss", null, null}, list.getItems());


    }
}