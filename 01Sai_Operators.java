package javaleaning;
 class Sai_Operators {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        int c = 5;
        //arthmatic operators
        int result1 = (a+b)+(a*b)*(a/b)/(a-c)-(a%b);
        System.out.println("Arthmatic operators :" +result1);
        //Assignment operators
        int result2 = result1;
            result2 += 5;
        System.out.println("Assignment :" +result2); 
        int result3 = result2;
         result3 -= 10;
        System.out.println("Assignment :" +result3 );
        //logical Operators
        boolean condition1 = (a>b);
        boolean condition2 = (c!=5);
        boolean result4 = condition1 || condition2;
        System.out.println("logical operators :" +result4);
        System.out.println(!(a>=3 && a< 11));
        //relational operators
        boolean result5 = (result1>= 30);
        System.out.println(result5);
    }
}
