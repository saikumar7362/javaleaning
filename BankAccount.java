package javaleaning;

public class BankAccount {
    String accountName;
    long  accountNumber;
    float rateOfInterest;
    String bankName ="SBI"; 
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.accountName = "karthik";
        b.accountNumber = 170073620;
        b.rateOfInterest = 0.8f;
        System.out.println("accountName:"+b.accountName);
        System.out.println("accountName:"+b.rateOfInterest);
        System.out.println("accountName:"+b.accountNumber);
        System.out.println("BankName:"+b.bankName);
        
    }
}
