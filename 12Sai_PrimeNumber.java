package javaleaning;

class Sai_PrimeNumber {
    Public Static void main(String[] args){
        int n=10;
        
        for(int i =2; i<=n; i++){
            int fact = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    fact+=1;
                }

            }
            if(fact == 2){
                System.out.println("i");
            }
        }
    }    
}
