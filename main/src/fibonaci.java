 class fact {
    static int factorial(int n) {
        int fibo = 1;
        for (int i = 2; i <= n; i++) {
            fibo *= i;
        }
        return fibo;
    }
}
public class fibonaci {
    public static void main(String[] args) {
        int n = 10; // number of terms
        int t1 = 0;
        int t2 = 1;
        System.out.print(n + "  Fibonacci series with factorial: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + "! = " + fact.factorial(t1) + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    }


