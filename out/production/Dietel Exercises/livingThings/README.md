THE SOLID PRINCIPLE EXPLAINED WITH LIVING THINGS

1.SINGLE RESPONSIBILITY PRINCIPLE: There are different similar attributes of living things, nevertheless a class should do one
 thing and do it well. this is such that the class the class mammals can perform the functions of just mammals, even though
 reptiles and amphibians are living things too.. They should have their own separate classes which descibes just their own sttributes
 alone.

 2. OPEN-CLOSED PRINCIPLE: This principle states that a class should be open for extension and closed for modification.
 Dolphin as a mammal has all the attributes of class mammal, but it is an acquatic mammal, it will be wrong to put the attribute of method
 aquatic in the class mammal as a modification to suit dolphins but cather, another class of dolphin can be created and it can extend
 class mammal, which means that it has all the mammal attribute as a living thing but could have its own additional attribute and behaviours.
 As indicated in the code, it could breastfeed(from mammals) and be aquatic(from itself).

 3. LISCOV SUBSTITUTION PRINCIPLE: This principle states that a sub class should be able to represent or substitute for a super class
As written in the code the class Human(subclass) extends the class mammals and for this reason, every behaviour that class Mmmal(superclass)
can exhibit, the class human can also be substituted to do the same.

4. INTEGRATION SEGREGATION: This principle states that a class should not be forced to implement methods from an interface that it
does not need but rather if it needs another method it should be placed in another interface , which means that the class could implement
more than one interface for the method it needs.
As written in the code,  class duck and  class Eagle are both birds(interface) but it will be wrong to put the fly method in the bird interface
because an eagle can fly but a duck cannot, so if the fly method is placed in bird, the duck would be forced to implement it but if there are
two other interfaces ( canfly and cannotfly) the eagle and the duck can implement appropriately behaviours that pertains to them.

5. DEPENDENCY INVERSION: This principle states that higher classes should not depend on the lower classes but rather they should depend on abstractions,
such that both the higher class and the lower class can depend on abstractions rather than concretions. According to the code, the higher class is
class LivingThing and  instead of the class Dog, class Snake and Class fish to depend solely on living things concrete methods, they
depend on an interface that holds abstract methods for the characteristics of living things, this way they can implement the same methods in
their own ways. Also that the class LivingThing uses the abstraction as a means to create instances who can exhibit the characteristics through
the constructor injection.






