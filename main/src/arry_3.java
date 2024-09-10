import java.util.Scanner;
public class arry_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number" + (i + 1));
            arr[i] = sc.nextInt();
        }

       // System.out.println("Assending order of an array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
        }

        System.out.println("Assending order of an array");
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Which number you want");
        int n1 = sc1.nextInt();



    }
}
