package javaleaning;

public class forloop {
    public static void main(String[] args){
      /*  outer: for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.println(i+"-"+j);
                if(j==2)
                break;
                if(i==3)
                break outer;          
            }
        }*/
      /*   L1:while (true) {
            System.out.println("Started");
            while(true){
              System.out.println("inner Started");
              break L1;
        
            }
          }*/
          label:do{
        System.out.println("Hello !");
            continue label;
          }while(false);
    }
}
