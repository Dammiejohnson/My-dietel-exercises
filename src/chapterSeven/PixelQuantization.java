package chapterSeven;

public class PixelQuantization {
    public static void main(String[] args) {
        int [] pixels = {19,178,155,33,75,115,30,25,200};

        for (int i = 0; i < pixels.length; i++){
            if (pixels[i] >=0 && pixels[i]<= 20){
                System.out.print(10 + " ");
            }
            else if (pixels[i] >=21  && pixels[i]<= 40){
                System.out.print(30 + " ");
            }
            else if (pixels[i] >=41  && pixels[i]<= 60){
                System.out.print(50 + " ");
            }
            else if (pixels[i] >=61  && pixels[i]<= 80){
                System.out.print(70 + " ");
            }
            else if (pixels[i] >=81  && pixels[i]<= 100){
                System.out.print(90 + " ");
            }
            else if (pixels[i] >=101  && pixels[i]<= 120){
                System.out.print(110 + " ");
            }
            else if (pixels[i] >=121  && pixels[i]<= 140){
                System.out.print(130 + " ");
            }
            else if (pixels[i] >=141  && pixels[i]<= 160){
                System.out.print(150 + " ");
            }
            else if (pixels[i] >=161  && pixels[i]<= 180){
                System.out.print(170 + " ");
            }
            else{
                System.out.print(190);
            }
        }
    }
}
