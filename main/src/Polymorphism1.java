import java.util.Scanner;

class multiple{

    void abc(int a,Double b)
    {
        System.out.println("value of Int :"+a);
        System.out.println("value of Double :"+b);
    }
    void abc(int c,int d)
    {
        System.out.println("value of Int :"+c);
        System.out.println("value of Int :"+d);
    }
    void abc(double e,double f)
    {
        System.out.println("value of Double :"+e);
        System.out.println("value of Double :"+f);
    }
    void abc(String g,char h)
    {
        System.out.println("value of String :"+g);
        System.out.println("value of Char :"+h);
    }
    void abc(String i,String j)
    {
        System.out.println("value of String :"+i);
        System.out.println("value of String :"+j);
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        multiple obj = new multiple();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Int :");
        int a = sc.nextInt();
        System.out.println("Enter the value of Double :");
        double b = sc.nextDouble();

        System.out.println("Enter the value of Int :");
        int c = sc.nextInt();
        System.out.println("Enter the value of Int :");
        int d = sc.nextInt();

        System.out.println("Enter the value of Double :");
        double e = sc.nextDouble();
        System.out.println("Enter the value of Double :");
        double f = sc.nextDouble();

        System.out.println("Enter the value of String :");
        String g = sc.next();
        System.out.println("Enter the value of Char :");
        char h = sc.next().charAt(0);

        System.out.println("Enter the value of String :");
        String i = sc.next();
        System.out.println("Enter the value of String :");
        String j = sc.next();

        obj.abc(a,b);
        obj.abc(c,d);
        obj.abc(e,f);
        obj.abc(g,h);
        obj.abc(i,h);

    }
}
