package javaleaning;

public class ExceptionDemo2 {
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("you are not eligible for vote");
        }else{
            System.out.println("you are eligible for vote");
        }
    }
    public static void main(String[] args) {
        validate(17);
        System.out.println("the program is succesfully excuted");
    }
}
