import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("name", "sai");
        lhm.put("rollNo",14007362 );
        lhm.put("address", "Kesanapalli");
         Set s = lhm.keySet();
          Iterator itr = s.iterator();
          while (itr.hasNext()) {
            Object obj = itr.next();
            String str = (String)obj;
            System.out.println(str+ " = " + lhm.get(str));
          }
    }
}
