public class CTP {

   /*   static void add(int a, int b){
        System.out.println("Result1:" +(a+b));
    }
     static void add(double a, int b){
        System.out.println("Result2:" +(a+b));
    }
    public static void main(int[] args){
      System.out.println("int array");
      }
    public static void main(int args){
        System.out.println("int parameters");   
        
      }*/
      CTP(){
        System.out.println("Constructor parameter is Empty");
      }
      CTP(String name){
        System.out.println("Constructor with String parameter");
      }
    public static void main(String[] args){
       CTP ctp = new CTP("SAI");  // for static methods Object is not required
      // main(new int [] {2, 3, 4 });   
     //  main(45);   
     

    }
}
