import java.util.Scanner;
public class Swapinvalur {
    int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a;
    }
    public static void main(String[] args) {
        Swapinvalur s = new Swapinvalur();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();

        int abc=s.swap(a,b);
        System.out.println("Your Swap Value ="+abc);
    }
}
