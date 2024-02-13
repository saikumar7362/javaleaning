import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(4);
        System.out.println("safdg :"+nums);
        //iterating the ArrayList
        for(int num : nums){
            System.out.println("Iterating ArrayList by using forloop :"+num);
           
        }
         //remove the element from the Array List
         nums.remove(2);
         System.out.println("After remove :" +nums);
         // calling by index value
         System.out.print(nums.get(1));
        
         System.out.print(nums.set(1, 8));
         System.out.println(nums);
         System.out.println(nums.add(3));
         System.out.println(nums);
        nums.remove(Integer.valueOf(5));
        System.out.println(nums);
        nums.add(1, 15);
        System.out.println(nums);
        //contains
        boolean elementContains = nums.contains(20);
        System.out.println("Contains :"+ elementContains);
        int size = nums.size();
        System.out.println("size of the elements :" +size);
        boolean empty = nums.isEmpty();
        System.out.println("isempty :"+empty);
    }
}
