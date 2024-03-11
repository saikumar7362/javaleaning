package javaleaning;

public class ExceptionDemo {
    public static void main(String[] args){
        System.out.println("Today's topic is Exception handling");
       try{
         int a =10;
         int b = 0;
         double c = a/b;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
       }
        catch(ArithmeticException ae){
            ae.printStackTrace(); // Exception name, Reason, linenumber,method, class
            System.out.println(ae.toString()); // Exception name, Reason and this toString() method is inside the Sysout
          System.out.println(ae.getMessage()); // Only  Reason will display.
          System.out.println("You can not divided a number with 0"); //programer can print their own message 
        }
        finally{
        System.out.println("Hello Agini from the finally block");
        }
        System.out.println("hey Aginii");
    }
    
}
