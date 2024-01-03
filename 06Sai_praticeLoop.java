package javaleaning;

class Sai_praticeLoop {
 public static void main(String[] args){
int n =1234;
int sum =0;
for(int i=0;)
while(n>0){
 int m =n%10;
 System.out.println(m);
 sum+=m;
n=n/10;
}
System.out.println(sum);
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