import java.util.Scanner;

class sub{
    double area(double a,double b){
        return a*b/2;
    }

}
public class areoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        double a = sc.nextDouble();
        System.out.println("Enter the height :");
        double b = sc.nextDouble();

        sub sub = new sub();
        double area = sub.area(a,b);
        System.out.println("Area of triangle is: "+area);

    }
}

