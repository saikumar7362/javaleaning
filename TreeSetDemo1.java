import java.util.*;
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(12);
        ts.add(15);
        ts.add(06);
        ts.add(1);
        ts.add(20);
        ts.add(15);

        Iterator itr = ts.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
