package practice;

public class AtmCard {
    private String cardNumber;
    private CardType cardType;

    public AtmCard(String cardNumber) {
        validate(cardNumber);
        checkCardTypeOf(cardNumber);
    }

    private void checkCardTypeOf(String cardNumber) {
        if (cardNumber.charAt(0) == '4'){
            cardType = CardType.VISA;
        }
        else if (cardNumber.charAt(0) == '5'){
            cardType = CardType.MASTERCARD;
        }
       else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
            cardType = CardType.AMERICAN_EXPRESS;
        }
     else if (cardNumber.charAt(0) == '6'){
            cardType = CardType.DISCOVER;
        }
     else cardType = CardType.INVALID;
    }

    private void validate(String cardNumber) {
        if(cardNumber.length() >= 13 && cardNumber.length() <= 16) {
            this.cardNumber = cardNumber;
        }
        else {
            throw new IllegalArgumentException("invalid card length");
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }


    public CardType getCardType() {
        return cardType;
    }
}
