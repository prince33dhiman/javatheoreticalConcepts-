import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("prince");
        a.add("dhiman");
        a.add("ram");
        System.out.println(a);
        Iterator<String> i = a.iterator();
        System.out.println(i.next());


        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
