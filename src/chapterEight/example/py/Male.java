package chapterEight.example.py;

public class Male extends Human{
    @Override
    public void type() {
        System.out.println("I am a male");
    }

    @Override
    public void giveBirth() {
        super.giveBirth();
        System.out.println("I cannot give birth");
    }

    @Override
    public void breastFeeding() {
        System.out.println("I cannot breastfeed");
    }

    public void deepVoice(){
        System.out.println("I have a deep voice");
    }
}
