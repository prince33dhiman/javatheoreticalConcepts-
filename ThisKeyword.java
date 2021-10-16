public class ThisKeyword {

    int a =5; // this is a global or class variable

    public void getData(){
        int a =10; // this is a local variable

        System.out.println(a);
        System.out.println(this.a); // to call the global variable in local variable we use (this) keyword
    }

    public static void main(String[] args) {
        ThisKeyword tt = new ThisKeyword();
        tt.getData();

    }
}
