package javaleaning;

import java.util.Scanner;

public class TotalCalculator {
        public static void main(String[] args){
            Scanner scan= new Scanner(System.in);
            int num;
            int total = 0;
            for(int i=1; i<=3;i++){
                System.out.println("enter the no"+i+ ":");
                num = scan.nextInt();
                total+=num;
            }
            System.out.println("total :"+total);
        }
}
