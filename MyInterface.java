package javaleaning;

interface  MyInterface {        //interface
   public static final int x = 12;
     public abstract void m1();                  // abstract method
}

interface  MyInterface2 {        //interface
    public static final int z = 12;
      default void m3(){              //default method 
        System.out.println("changes in java8 and java9");
      } 
      static void m4(){
        System.out.println("Static method in interface and call by using reference");
    }                
 }

interface  MyInterface1 extends MyInterface, MyInterface2 {        //interface to interface using extends
    public static final int y = 12;
      public abstract void m2();                  // abstract method
 }

class InstanceDemo1 implements  MyInterface1{ 
    public void m1(){
        System.out.println("my Interface");
    }
    public void m2(){
        System.out.println("my Interface1");
    }
   /*  public void m3(){
        System.out.println("my Interface2");  //the commented method is removed then  error msg will shows
        // recently the java 8 and 9 versions are implemented default method  instead of public abstract method
    } */  

    public static void main(String[] args) {
        InstanceDemo1 id = new InstanceDemo1();
        id.m1();
    
      //  x= x+5; it will not going to print because  interface varibles are defualt public static final varibles
        System.out.println(id.x);
        id.m2();
        System.out.println(id.y);

        id.m3();
        MyInterface2.m4();
        System.out.println(id.z);
    }
}
