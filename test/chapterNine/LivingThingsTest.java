package chapterNine;

import chapterNine.Inheritance.Aves;
import org.junit.jupiter.api.Test;

class LivingThingsTest {

    @Test
    public  void livingAvesBreathingTest(){
        Aves aje = new Aves(); // note that if the test for this default constructor is run
        // it will give an output which is by calling the constructors
        // of the super classes above it(direct and indirect) and this is only possible
        // if the superclass is a no args one(esp that of the indirect one). But if the superclass has a parameter in the
        // constructor, it will need to create its own default then call the constructor of the super class with the keyword super(arguments)
//        aje.breath();// it has the breath method of the super class but it is behaving on its own  here
//        aje.parentBreath(); // this is to call the superclass method directly and act like it

    }

}