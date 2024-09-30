import java.util.Scanner;
public class Cons {
    int a,b;
    Cons()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
       a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
    }

    void addit(){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }


    public static void main(String[] args) {
            Cons obj = new Cons();
            obj.addit();
    }
}
