import java.util.Scanner;
public class function_5 {
    Scanner sc = new Scanner(System.in);
    int rolln;
    void roll_number(){
        System.out.println("Please enter a roll number: ");
        rolln = sc.nextInt();

     }

     void check()
     {
         if(rolln >= 1 && rolln<= 60) {

         }
         else
         {
             roll_number();
         }
     }

    public static void main(String[] args) {
        function_5 f = new function_5();
        f.roll_number();
        f.check();

    }
}
