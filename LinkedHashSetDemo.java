import java.util.*;


public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();
            ls.add(12);
            ls.add(15);
            ls.add(06);
            ls.add(1);
            ls.add(20);
            ls.add(15);
            Iterator itr = ls.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
    }
}
