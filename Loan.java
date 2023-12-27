package javaleaning;
public class Loan {
    String  name;
    int loanID;
    float rateofinterest;
    public static void main(String []args){
        Loan L= new Loan();
        L.name="Gold loan";
        L.loanID=7789;
        L.rateofinterest =0.24f;
        System.out.println("Loan Details:"+L.name);
        System.out.println("Loan ID:"+L.loanID);
        System.out.println("Loan interest:"+L.rateofinterest);
  }

}
