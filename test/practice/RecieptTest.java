package practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecieptTest {

    @Test
    public void recieptCanBeCreated_withInformation(){
        //given and when
        Reciept reciept = new Reciept("001", "wristwatch",3, 100.0);
        //assert
        //assertEquals("001", reciept.getPartNumber());
        assertNotNull(reciept, reciept.toString());
    }

    @Test
    @DisplayName("partNumberCanBeGotten_whenItIsSet")
    public void getAndSetPartNumber(){
        //given
        Reciept reciept = new Reciept("001", "wristwatch",3, 100.0);
        //when
        reciept.setPartNumber("002");
        //assert
        assertEquals("002", reciept.getPartNumber());
    }

    @Test
    @DisplayName("descriptionCanBeGotten_whenItIsSet")
    public void getAndSetDescription() {
        //given
        Reciept reciept = new Reciept("001", "wristwatch", 3, 100.0);
        //when
        reciept.setDescription("bag");
        //assert
        assertEquals("bag", reciept.getDescription());
    }

    @Test
    @DisplayName("qtyCanBeGotten_whenItIsSet")
    public void getAndSetQuantity() {
        //given
        Reciept reciept = new Reciept("001", "wristwatch", 3, 100.0);
        //when
        reciept.setQuantity(15);
        //assert
        assertEquals(15, reciept.getQuantity());
    }

    @Test
    @DisplayName("priceCanBeGotten_whenItIsSet")
    public void getAndSetPrice() {
        //given
        Reciept reciept = new Reciept("001", "wristwatch", 3, 100.0);
        //when
        reciept.setPrice(500.00);
        //assert
        assertEquals(500, reciept.getPrice());
    }

    @Test
    @DisplayName("amountCanBeGotten_fromProductAndPrice")
    public void amountCanBeGotten() {
        //given
        Reciept reciept = new Reciept("001", "wristwatch", 3, 100.0);
        //when
        reciept.setQuantity(2);
        reciept.setPrice(0.0);
        //assert
        assertEquals(0.0, reciept.getInvoiceAmount());
    }

    @Test
    @DisplayName("amountWillNotBeGotten_fromQuantityAndPrice")
    public void amountReturnsZeroIfQuantityIsNegative() {
        //given
        Reciept reciept = new Reciept("001", "wristwatch", 3, 100.0);
        //when
        reciept.setQuantity(-3);
        reciept.setPrice(400.0);

        //assert
        assertEquals(0, reciept.getInvoiceAmount());
    }


}