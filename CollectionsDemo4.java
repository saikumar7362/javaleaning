import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsDemo4 {
        public static void main(String[] args){
                List<String> al= new ArrayList<>();
               // System.out.println("Forward direction");
                
                al.add("kumar");
                al.add("ML");
               /*   ListIterator<String> itr = al.listIterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());   
                }*/
                System.out.println("Reverse direction");
                ListIterator<String> itr = al.listIterator();
                while(itr.hasPrevious()){
                    System.out.println(itr.previous());
                } 
        }
}
