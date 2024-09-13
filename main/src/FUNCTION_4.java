import java.util.Scanner;
public class FUNCTION_4 {
    int a=0;
    int b=0;

    void sum(int a,int b){
        int c=0;

        System.out.println(a);
        System.out.println(b);

        c=a;
        a=b;
        b=c;

        System.out.println();

        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        FUNCTION_4 f = new FUNCTION_4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        f.sum(a,b);



    }
}
