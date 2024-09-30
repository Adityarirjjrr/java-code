import java.util.Scanner;
public class cons3 {
    int math,eng;
    String nam;

    cons3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
         nam=sc.nextLine();
        System.out.println("Enter your Maths marks :");
         math = sc.nextInt();
         System.out.println("Enter your English marks :");
         eng = sc.nextInt();
    }
    double   solution()
    {
        if (math >= 0 && math <= 60 && eng >= 0 && eng <= 60)
        {
            double average = (math + eng) / 2.0;

            System.out.println("You Entered  Maths Marks Is:"+math);
            System.out.println("You Entered  English Marks Is:"+eng);

            System.out.println("Hello, " + nam + "!");
            System.out.println("Your average marks is: " + average);
        }
        else
        {
            System.out.println("Your marks is invalid.Marks should be between 0 and 60");
        }

        return 0;
    }

    public static void main(String[] args)
    {
        cons3 obj = new cons3();
        obj.solution();
    }
}
