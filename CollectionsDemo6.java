import java.util.*;

public class CollectionsDemo6 {
    public static void main(String[] args) {
            List<String> al1 = new ArrayList<>();
                al1.add("SAikumar");
                al1.add(0, "Adabala");

                List<String> al2= new ArrayList<>();
                al2.add("Lakshmi");
                al2.clear();    //clearMethod checkhere lakshmi is not printing
                al2.add(0, "Maha"); //index method
                al2.addAll(1, al1);   //addAll method
               
                for(String R : al1){
                    System.out.println(R);
                }
                System.out.println(" ");
                for(String S: al2){
                    System.out.println(S);
                }

    }
}
