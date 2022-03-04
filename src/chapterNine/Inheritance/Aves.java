package chapterNine.Inheritance;

import chapterNine.Inheritance.Animal;

public class Aves extends Animal {

    public Aves(){
        super(2);
    }

    // this can be an override and you can choose to display the @override
    public void breath(){
        System.out.println("I am an Aves and i am breathing!!");
    }

    //this is how to call the method from the parent with the same output
    public void parentBreath(){
        super.breath();
    }
    //this is an overload
//    public void breath(String lungs){
//        System.out.println("Iam an Aves and i am breathing!!");
//    }
}
