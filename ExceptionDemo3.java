package javaleaning;

public class ExceptionDemo3 {
    static void display() throws ArithmeticException{
        int a = 10;
        int b = 0;
        int c = a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        try{
        display();
    }catch(ArithmeticException ae){
        ae.printStackTrace();
    }
        System.out.println("Successfully printed");
    }
}
