import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
            hs.add("SaIKUMAR");
            hs.add("LAKSHMI");
            hs.add("NARASIMHA");
            hs.add("ADABALA");

        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
