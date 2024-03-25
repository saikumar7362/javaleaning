import java.util.*;

public class CollectionsDemo5 {
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
            al.add("sai");
            al.add(0,"Adabala");
            al.add(1, "Lakshmi");
            al.add(2, "Narasimha");
            al.add("kumar");
            //al.add("sai");

            List<String> al1 = new ArrayList<>();
            al1.add("sai");
            al1.add(0,"Adabala");
            al1.add(1, "Lakshmi");
            al1.add(2, "Narasimha");
            al1.add("kumar");
            //al1.add("Trying for Life");
            
            List<String> al2 = new ArrayList<>();

            for(String s : al){
                System.out.println(s);
            }
            System.out.println("  ");
            for(String s : al1){
                System.out.println(s);
            }

            System.out.println(al.equals(al1));  //Using equals method
            System.out.println(al2.isEmpty()); //Using equals Method
          //  System.out.println(al.lastIndexOf("sai")); //Using lastIndexOf()
            //System.out.println(al.indexOf("sai"));   //Using indexOf();
            System.out.println(al.contains("kumar")); //Using contains();
            System.out.println(al.contains("Maha"));
            System.out.println(al.containsAll(al2));
           // System.out.println(al.remove(0));
            System.out.println(al);
           // System.out.println(al.remove("Lakshmi"));
            System.out.println(al);
            System.out.println(al.removeAll(al2));
            System.out.println(al.set(1, "Maha"));
            System.out.println(al);
            al.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println(al);
            System.out.println(al.subList(1, 3));
    }
}
