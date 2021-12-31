package chapterFour;

public class Tax {
    private String name;
    private double earning;
    private double totalTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEarning() {
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        if (earning <= 0)
            if (earning <= 30_000) {
                totalTax = earning * 0.15;
            } else {
                totalTax = earning * 0.2;
            }
            this.totalTax = totalTax;

    }
}
