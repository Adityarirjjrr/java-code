import java.util.Scanner;
public class fun_areaofcircle_2 {
    double areaofcircle(double a) {

            return 3.14*a*a;
    }
    public static void main(String[] args) {
        fun_areaofcircle_2 c = new fun_areaofcircle_2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double a = sc.nextDouble();

        double abc= c.areaofcircle(a);
        System.out.println("The area of the circle is "+abc);

    }
}
