import java.util.Scanner;
public class loops_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int a = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + a + "=" + i * a);
        }
    }
}
