public class AccessModifiers {

    // default modifier can only be accessed in the package.
    // public modifier can be accessed across the different packages
    // private modifier restricts the variable/ method to the class

    // protected modifier variable can be accessed only in the sub classes. the parent class protected variable
                                    //can be used in the sub class


    //int age;        // it can be used within the package
    //public int age; // this variable can be acessed in the different packages
    //private int age; // this can not be accessed outside the particular class


    void getData(){                 // this is assumed as a default modifier
        System.out.println();       // default modifiers can only be accessed in the package, not outside the package
    }
}
