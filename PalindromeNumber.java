public class PalindromeNumber {
    public static void main(String[] args){
        int num=12321;
        int orginalNumber =num;
        int reverseNumber = 0;
        while(num !=0){
                int digit = num%10;
                reverseNumber= reverseNumber*10+digit;
                num/=10;
        }
        if(orginalNumber==reverseNumber){
            System.out.println("palindromeNumber");
        }else{
            System.out.println("Not palindromeNumber");
        }
    }
}
