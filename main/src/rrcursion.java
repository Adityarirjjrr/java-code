import java.util.Scanner;
class test {
    int factorial(int n) {
        if(n<=1) {
            return 1;
        }
        return n+factorial(n-1);
    }
}
  class rrcursion {
    public static void main(String[] args) {
        test obj = new test();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int fact=obj.factorial(n);
        System.out.println(fact);
    }
}
