import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> s = new HashSet<Integer>();

        s.add(2);
        s.add(6);
        s.add(8);
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.remove(1));
        System.out.println(s.contains(6));

        s.add(6);
        System.out.println(s);

    }

}
