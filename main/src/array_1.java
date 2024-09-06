import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int total=0;
        int arry[]= new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+"th element");
            arry[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(arry[i]);
            total += arry[i];
        }
        System.out.println("Total is "+total);
    }
}
