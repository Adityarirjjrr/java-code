import java.util.Scanner;
public class loop_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows =");
        int num = sc.nextInt();
        int sum = 0;
        int rem, temp = num;
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println("y");
        } else {
            System.out.println("n");


        }
    }
}
