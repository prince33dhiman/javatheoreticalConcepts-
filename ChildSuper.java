public class ChildSuper extends SuperKeyword {

    int a = 10;

    public void getdata() {

        System.out.println(a);
        //System.out.println(super.a);
        // by using super keyword we can refer to parent variable

        //super.data();// by using super with method we can refer to the method
    }


    public static void main(String[] args) {
        ChildSuper cp = new ChildSuper();
        cp.getdata();

    }
}
