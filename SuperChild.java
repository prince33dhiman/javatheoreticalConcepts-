public class SuperChild extends SuperParent{

    int a = 100;

    public void getData(){
        //super.data(); to get to parent method we use super before method.
        System.out.println(a);
        System.out.println(super.a);// to refer to the parent class variables we use super keyword
    }


    public static void main(String[] args) {
        SuperChild cd = new SuperChild();
        cd.getData();
    }
}
