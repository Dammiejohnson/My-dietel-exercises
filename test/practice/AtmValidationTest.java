package practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtmValidationTest {

    @Test
    public void AtmCanBeCreated (){
        AtmCard atm = new AtmCard("2435676898765876");
        assertEquals("2435676898765876", atm.getCardNumber());
    }
    @Test
    public void AtmCardDigitsAbove16_throwsException(){
        try {
            AtmCard atm = new AtmCard("243567689876587698");
        } catch ( IllegalArgumentException e){
            assertEquals("invalid card length", e.getMessage());
        }
    }

    @Test
    public void AtmCardDigitsBelow13_throwsException(){
        assertThrows(IllegalArgumentException.class, ()-> {
           AtmCard atm = new AtmCard("243567689876");
        });
    }

    @Test
    public void AtmCardNumberThatBeginsWith4_isAVisaCard(){
        AtmCard atm = new AtmCard("4435676898765876");
        assertSame(CardType.VISA, atm.getCardType());
    }

    @Test
    public void AtmCardNumberThatBeginsWith5_isAMasterCard(){
        AtmCard atm = new AtmCard("5435676898765876");
        assertSame(CardType.MASTERCARD, atm.getCardType());
    }

    @Test
    public void AtmCardNumberThatBeginsWith37_isAnAmericanExpressCard(){
        AtmCard atm = new AtmCard("3735676898765876");
        assertSame(CardType.AMERICAN_EXPRESS, atm.getCardType());
    }

    @Test
    public void AtmCardNumberThatBeginsWith6_isADiscoverCard(){
        AtmCard atm = new AtmCard("6735676898765876");
        assertSame(CardType.DISCOVER, atm.getCardType());
    }

    @Test
    @DisplayName("InvalidCardTypes")
    public void AtmCardNumberThatBeginsWithAnyOtherNumber_apartFrom4_5_6_3_isAnInvalidCard(){
        AtmCard atm = new AtmCard("2735676898765876");
        assertSame(CardType.INVALID, atm.getCardType());
    }



}
