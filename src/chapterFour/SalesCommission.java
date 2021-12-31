package chapterFour;

public class SalesCommission {
    private double grossSale;
    private double earning;
    private int item;
    private double value;


    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getEarning() {
        double earning = (value * 0.09);
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    public void setItem(int item){
        if (item == 1) value = 239.99;
        else if (item == 2) value = 129.75;
       else if (item == 3) value = 99.95;
       else if (item == 4) value = 350.89;
        else value = 0.0;
    }
    public double getItem (){
        return value;
    }
}
