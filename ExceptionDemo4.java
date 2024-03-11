package javaleaning;

public class ExceptionDemo4 extends Exception {  //step -1
    public ExceptionDemo4(String str){    // step-2
        Super(str);      //step-3
    }
    public static void main(String[] args) throws ExceptionDemo4  {    //step-4
        try{                                                            //step-5
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int age = sc.nextInt();

            if(age<18){
                throw new ExceptionDemo4("You are not Eligible for vote");
            }
            else{
                System.out.println("you are eligible for vote");
            }
        }
        catch(ExceptionDemo4 ed){                                  //step-6
            ed.printStackTrace();
        }
        
    }
    
}
