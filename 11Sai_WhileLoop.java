package javaleaning;
class Sai_WhileLoop {
    public static void main(String[] args) {
        /*int i=1;
        while(i<1){
            System.out.println("HelloWorld "+i);
            i++;
        }
        do{
            System.out.println("Hello" +i);
            i++;
        }while(i<1);*/
        int x=1;
        while(x<5){
            int y=0;
            while(y<x){
                System.out.print("*");
                y++;
            }
            System.out.println();
            x++;
        }
    }
    
}
