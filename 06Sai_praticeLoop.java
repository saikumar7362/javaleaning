package javaleaning;

class Sai_praticeLoop {
 public static void main(String[] args){
 int date = 13;
 String festival;
 switch(date){
    case 13 : festival = "no festival";
        break;
    case 14 : festival = "Happy Bhogi";
    case 15 : festival = "happy sankranti";
    case 16:  festival = "happy kanuma";
    default: festival = "unknown";
 }
    System.out.println("the festival day is :" +festival);
 }   
}
