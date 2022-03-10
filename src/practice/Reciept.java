package practice;

public class Reciept {
    private String partNumber;
    private String description;
    private int qty;
    private double price;
//    private double amount;


    public Reciept(String partNumber, String description, int qty, double price) {
        this.partNumber = partNumber;
        this.description = description;
        this.qty = qty;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reciept{");
        sb.append("partNumber='").append(partNumber).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", qty=").append(qty);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int qty) {
        if (qty < 0){
            qty = 0;
        }
        this.qty = qty;
    }

    public int getQuantity() {
        return qty;
    }

    public void setPrice(double price) {
        if (price < 0) {
            price = 0.0;
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public double getInvoiceAmount() {
        return qty * price;
    }
}
