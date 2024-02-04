public class FibonacciSeries1 {
    public static void main(String[] args) {
        int n = 5; // Change the value of n to generate different number of Fibonacci numbers
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series upto " + n + " terms:");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
