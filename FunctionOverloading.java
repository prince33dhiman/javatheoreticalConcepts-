public class FunctionOverloading {

    // if we have two methods with same name and different arguements
    // it is called function overloading

    public void getData(int a, int b){

    }    // if the arguments are not same, there is error

    public void getData( int a ){

    }

    //Either argument type is different
    // or the data type is different

    public static void main(String[] args) {

        FunctionOverloading fl = new FunctionOverloading();
        fl.getData(2);
        fl.getData(2,5); // both the methods are different
    }


    // in the method overriding, the function name, argument will be same
    // we will just override the method with new block of code in child class
    // but in method overloading the arguments are different






}
