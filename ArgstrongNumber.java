public class ArgstrongNumber {
    public static void main(String[] args){
        int num =153;
        int sum =0;
        int orginalNumber =num;
        int numOfDigits =String.valueOf(num).length();
        while(num!=0){
            int digit= num%10;
            sum += Math.pow(digit, numOfDigits);
            num/=10;
        }
         if (orginalNumber==sum){
            System.out.println("argStrongNumber");
         }else{
            System.out.println("NotargstrongNumber");
         }
    }
}
