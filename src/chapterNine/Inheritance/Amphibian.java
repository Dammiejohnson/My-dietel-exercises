package chapterNine.Inheritance;

public class Amphibian extends Animal {

    public Amphibian(){
        super(7);
    }
    // note that whether written or not, this has an inheritance relationship and bear the method of it's superclass Animal(breath)
    // this is an overload because the signature
    public void breath(String gills){
        System.out.println("I am an amphibian and i am breathing");
    }

    public void move(){
        System.out.println("Move like an amphibian");


    }

}
