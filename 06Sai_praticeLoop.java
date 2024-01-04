package javaleaning;

class Sai_praticeLoop {
 public static void main(String[] args){
  int n = 10;
 int factorial = 0;
 for(int i=2; i<=n; i++ ){
  for(int j=1; j<=i; j++){
    if(i%j==0){
      factorial+=1;
    }
  }
  if(factorial==0){
    System.out.println(i);
  }
 }
}
}
   

/* 
//1015
output-7;
1015/10 =101;
1015%10=5;

101/10=10;
101%10=1;

10/10=1;
10%10=0;

1/10=0;
1%10=1;*/