package javaleaning;

import java.util.Scanner;

class karthik_ControlFlowStatements {
    public static void main(String [] args)
    {
    //Sample Condition for both If /If else statements ------------------->
         boolean sunny = true;
         if(sunny) {
            System.out.println("Let's go outSide");
    }
    else{
        System.out.println("Let's stay Inside");
    }
    //Switch case Statements---------------------->
     Scanner Sc = new Scanner(System.in);

    String LI="Login";
    String M ="MENU";
    String VP ="View Profile";
    String EP ="Edit Profile";
    String LO="Logout";
System.out.println("Enter your Choice:");
int Choice =Sc.nextInt();
switch(Choice)
{
    case 1: System.out.println("log in to...");
    break;
    case 2: System.out.println("Menu...");
    break;
    case 3: System.out.println("View the Profile...");
    break;
    case 4: System.out.println("Editing Profile...");
    break;
    case 5: System.out.println("Logging out....");
    break;
    default :System.out.println("Invalid  choice:");
     
}
        //do while  Statemets ------------------->
      int K = 2;
       do{
        System.out.println("Karthik");
        K++;
       }
        while(K<3);

        String Subject ="JAVA";//For Loop Statements------------------>
        for (int i=0;i<Subject.length();i++){
            char presentchar=Subject.charAt(i);
            System.out.println("Subject:"+i+":"+presentchar);

        }
    

        

        }
    }
    

