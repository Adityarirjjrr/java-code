import java.util.Scanner;
public class function_3 {
    int n;
 int i;
    void number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
         n = sc.nextInt();
    }
    void number_2(){
        for( i=1;i<=n;i+=2){
            System.out.println(i);
        }


    }
    public static void main(String[] args) {
        function_3 obj = new function_3();
        obj.number();
        obj.number_2();
    }
}
