import java.util.Scanner;
public class revarsenumber_arry_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int num = sc.nextInt();
        int i=0;
        int revarse=0;

        int arr[] = new int[num];

        for ( i = 0; i < arr.length; i++)
        {
            System.out.println("Enter number " + (i + 1));
            arr[i] = sc.nextInt();
        }
        for( i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }

        for( i=num-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
