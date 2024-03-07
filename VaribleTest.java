package javaleaning;

public class VaribleTest {
    public static void main(String[] args) {
        /*int a,b,sum;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        sum = a + b;
        System.out.println("sum of Aand B :"+sum);    */
        int n = 9;
        for(int i =0; i<n; i++){
            int  b= i * i;
                if (b>=n)
                break;
                System.out.println(b);
        }
    }
}
