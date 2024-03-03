public class EncapBank {
    private String name = "saikumar";
    private double balance;
    private double amount;
    public String getname(){
        return name;
    }
    public void Diposit(double amount){
            balance+=amount;
    }
    public void WithDraw(double amount){
        if(balance> amount){
                balance-= amount;
        }else{
            System.out.println("in sufficent balance");
        }
    }
}
