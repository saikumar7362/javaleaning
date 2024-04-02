import java.util.Stack;
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(5); //push method 
        s.push(6);
        s.push(7);
        System.out.println(s);
            s.pop();             //pop method
            System.out.println(s); 
            System.out.println(s.peek());  //peek method
            System.out.println(s.empty());  //empty method
            System.out.println(s);
            System.out.println(s.search(5));  //search method


    }
    
}
