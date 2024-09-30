import java.util.*;
class area{
   double area1(double r){
       System.out.println(r);
       double circle = 3.14 * r * r;
        return circle;
   }
   double area1(double l, double b){
       double rectangle = l*b;
       return rectangle;
   }
   double area1(int side){
       double Square = side*side;
       return Square;
   }
   double area1(int height, double base){
        double triangle = base*height/2;
        return triangle;
   }
   double  area1(double h, int radius){
       double cylinder=2*3.14*radius*h+2*radius*radius;
       return cylinder;
   }
}
public class shape {
    public static void main(String []args){
        area obj = new area();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        System.out.println("Enter the length of rectangle");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double b = sc.nextDouble();

        System.out.println("Enter the area of Square");
        int side = sc.nextInt();

        System.out.println("Enter the height of triangle");
        int height=sc.nextInt();
        System.out.println("Enter the base of trinagle");
        double base=sc.nextDouble();

        System.out.println("Enter the radius of Cylinder");
        int radius=sc.nextInt();
        System.out.println("Enter the heigth of Cylinder");
        double h=sc.nextDouble();





        double round=obj.area1(r);
        System.out.println("Area of Circle "+round);

        double semisquare=obj.area1(l,b);
        System.out.println("Area of Rectangle "+semisquare);

        double square=obj.area1(side);
        System.out.println("Area of Square "+square);

        double triangle=obj.area1(height,base/2);
        System.out.println("Area of Triangle "+triangle);

        double cylinder=obj.area1(h,radius);
        System.out.println("Area of Cylinder "+cylinder);

    }
}
