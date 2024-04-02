import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put("name", "sai");
        hm.put("rollNo", 14007362);
        hm.put("address", "Kesanapalli");
        hm.put("pincode", "533244");
            Set s = hm.keySet();        // s is varible to key values  and Set is type not allowing Duplicates
        Iterator itr = s.iterator();
        while (itr.hasNext()) {    //to checking the elements or not by using this method.
            Object obj = itr.next(); // storing the elements in a object but we can't print object directly [type casting cheythunam]
            String str = (String) obj; // Converting object to String
            System.out.println(str+" = "+hm.get(str));
        }

    }
}
