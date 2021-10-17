public abstract class AbstractClass {


}

//In abstract class we hide the implementation from the user, only the functionality will be provided to him
//
//implementation: abstract class keyword , atleast one abstract method ( without the body) and other non abstract methods
//why partial abstraction with the abstract class?
//bcoz abstract class has other non-abstract methods(with the body) also
//but in interface we have only abstract methods without body. which is full abstraction
// we can not instantiate the object of abstract class, it is must to extend the abstract class for implementation




//example

//abstract class implementation
//public abstract class parentClass
//
//public abstract void getData();   // abstract method
//public void ExtentData(){"data"}  // non abstract method

//interface implementation

//public interface parentClass{
//    public void getData();        // abstract method
//    public void noData();         // abstract method , no non-abstract methods are allowed

}