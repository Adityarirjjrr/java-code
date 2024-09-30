import java.util.Scanner;
class fact {
   int fibt(int n) {
        if(n<=1){
            return 1;
        }

        return fibt(n-1)+fibt(n-2);
    }

}
public class fibonaci {
    public static void main(String[] args) {
        fact obj = new fact();
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(obj.fibt(i)+ " ");
        }
        int fact=obj.fibt(n);
        System.out.println(fact);
    }
}


