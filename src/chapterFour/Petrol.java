package chapterFour;

public class Petrol {
    
    private String location;
    private String type;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public Petrol(String location, String type, int quantity, double pricePerLitre, double percentageDiscount) {
        this.location = location;
        this.type = type;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount(){
        double netPurchaseAmount = (quantity * pricePerLitre) - percentageDiscount;

        return netPurchaseAmount;
    }
}
