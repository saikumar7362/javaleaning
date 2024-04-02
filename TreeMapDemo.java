import java.util.*;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>(); // Specify the types for better type safety

        tm.put("name", "sai");
        tm.put("rollNo", "14007362");
        tm.put("address", "Kesanapalli");

        Set<String> s = tm.keySet();

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str + " = " + tm.get(str)); // Use tm.get(str) to retrieve the value
        }
    }
}
