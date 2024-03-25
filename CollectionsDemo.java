import java.util.*;


class CollectionsDemo{

        public static void main(String[] args){
            List<String> al = new ArrayList<>();
            al.add("Saikumar"); 
            al.add("MahaLAkshmi");
            al.add("Aravind");
            al.add("santosh");
           // System.out.println(al); // Instead of this we can use foreach loop to print
           /*for(String s:al){
                System.out.println(s);
           } */
           //for loop
          /*  for(int i=0; i<al.size(); i++){ //size method
                System.out.println(al.get(i)); //getmethod
           }*/
           //using Iterator
          /*  ListIterator<String> itr = al.listIterator();
           System.out.println("Forward direction");
           while (itr.hasNext()) {
                System.out.println(itr.next());
           }
           //reverse
           System.out.println("Reverse direction");
           while (itr.hasPrevious()) {
                System.out.println(itr.previous());
           }*/

           //if we don't know about list or string then go for Iterator interface
          /*  Iterator itr = al.iterator();
           while (itr.hasNext()) {
            System.out.println(itr.next());
           }*/

           //forEach method
        /*    al.forEach(a ->{
                System.out.println(a);
           });*/

           //forEachRemaining

           Iterator<String> itr = al.iterator();
           itr.forEachRemaining(a ->{
            System.out.println(a);
           });

        }
}