package javaleaning;

class KarthikOperator {
public static void main (String [] args)
    {
      int book1 =5;
      int book2 =2;
       int Result =(book1+book2)*(book1-book2)/(book1*book2);//Arithmetic Operator
       int Result0 =(book2-book1)+(book2*book1)%(book1-book2);//Arithmetic
       boolean Result1 =(book1 > 5) && (book2 > 2);//Logical AND operator
       boolean Result2 =(book1 < 2) || (book2 < 5);//logical OR Operator
       boolean Result3 =(book1!=book2);//Logical NOT Operator
       boolean Result4 =(book1*book2)==(book2/book1);//Relational Operator
       boolean Result5= (book1/book2)!=(book2/book1);//Relational operator
       int Result6= (book1+--book2);//incremet/Decrement
       int Result7= book1-10;//Assignment Operator
       book1=book1+5;
       System.out.println("Books:"+Result);
       System.out.println("Books:"+Result0);
       System.out.println("Books:"+Result1);
       System.out.println("Books:"+Result2);
       System.out.println("Books:"+Result3);
       System.out.println("Books:"+Result4);
       System.out.println("Books:"+Result5);
       System.out.println("Books:"+Result6);
       System.out.println("Books:"+Result7);
    }
    
}
