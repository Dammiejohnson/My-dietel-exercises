package livingThings.openClosed;

import livingThings.singleResponsibility.Mammals;

public class Dolphin extends Mammals {
    public void aquatic() {
        System.out.println("aquatic");
    }

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.breastFeed();
        dolphin.aquatic();
    }
}
