import java.util.*;
class area{
   double areacircle(double r){
       System.out.println(r);
       double circle = 3.14 * r * r;
        return circle;
   }
   double arearectangle(double l, double b){
       double rectangle = l*b;
       return rectangle;
   }
   double areaSquare(double side){
       double Square = side*side;
       return Square;
   }
   double areatriangle(double height, double base){
        double triangle = base*height/2;
        return triangle;
   }
   double  areaofcylinder(double h, double radius){
       double cylinder=2*3.14*radius*h+2*radius*radius;
       return cylinder;
   }
}
public class shape {
    public static void main(String []args){
        area obj = new area();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = sc.nextDouble();

        System.out.println("Enter the length of rectangle");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double b = sc.nextDouble();

        System.out.println("Enter the area of Square");
        double side = sc.nextDouble();

        System.out.println("Enter the height of triangle");
        double height=sc.nextDouble();
        System.out.println("Enter the base of trinagle");
        double base=sc.nextDouble();

        System.out.println("Enter the radius of Cylinder");
        double radius=sc.nextDouble();
        System.out.println("Enter the heigth of Cylinder");
        double h=sc.nextDouble();





        double round=obj.areacircle(r);
        System.out.println("Area of Circle "+round);

        double semisquare=obj.arearectangle(l,b);
        System.out.println("Area of Rectangle "+semisquare);

        double square=obj.areaSquare(side);
        System.out.println("Area of Square "+square);

        double triangle=obj.areatriangle(height,base/2);
        System.out.println("Area of Triangle "+triangle);

        double cylinder=obj.areatriangle(h,radius);
        System.out.println("Area of Cylinder "+cylinder);

    }
}
