import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(12);
        ts.add(15);
        ts.add(06);
        ts.add(1);
        ts.add(20);
        ts.add(15);

        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());
        System.out.println(ts.contains(060));
        System.out.println(ts.floor(20));

        TreeSet ts1 = (TreeSet) ts.headSet(12);     //this method will be shows before that element
        System.out.println(ts1);

        TreeSet ts2 = (TreeSet) ts.tailSet(12);   //this method will be shows  after and with  the element
        System.out.println(ts2);
        
        TreeSet ts3 = (TreeSet) ts.subSet(10,16);   //this method will be shows in between that range
        System.out.println(ts3);
    }
}
