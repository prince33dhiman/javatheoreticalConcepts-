public class StaticVar<Static, city> {

    String name;                    // these are dynamic instance variables
    int age;
    static String city = "Bangalore"; // this instance variable is being used for different objects so, make it static

    StaticVar(String name , int age){
        this.name = name; // we assign this local variable of method to the instance variable of class
        this.age = age;
    }

    public void getData(){
        System.out.println(name + " " +age +" " + city);
    }

    public static void main(String[] args) {

        StaticVar sv = new StaticVar("prince", 10); //same static variable
        sv.getData();

        StaticVar sv2 = new StaticVar("dhiman", 20); // used same static variable and it saved memory
        sv2.getData();
    }

}
