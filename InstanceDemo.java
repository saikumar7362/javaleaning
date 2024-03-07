package javaleaning;

 class InstanceDemo {
    static {
        System.out.println("Static block1");
    }
    {
        System.out.println("Instance block1");
        }
    InstanceDemo() {
        System.out.println("Zero Constructor");
       }
    InstanceDemo(int x) {
        System.out.println("parameterized Constructor");
    }
        public static void main(String[] args) {
            System.out.println("Main method");
            InstanceDemo id = new InstanceDemo();
           // InstanceDemo id2 = new InstanceDemo();  
            InstanceDemo id1 =new InstanceDemo(12);
        }
    static{
        System.out.println("Static block2");
        }
        {
            System.out.println("Instance block2");
        }

}
