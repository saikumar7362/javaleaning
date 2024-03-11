package javaleaning;

public class ExceptionDemo1 {
    public static void main(String[] args){
        try{
            int arr [] = {10,5};
            try{
                arr[2]= 6/0;
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        arr[3]= 7;
    }
        catch(ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }

        
    }
}
