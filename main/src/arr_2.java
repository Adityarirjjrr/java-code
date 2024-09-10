import java.util.Scanner;
public class arr_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the elements"+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

        int brr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the Second Array"+(i+1)+"elements"+":");
            brr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(brr[i]+" ");
        }

        int crr[]=new int[n];
        for(int i=0;i<5;i++){
             crr[i]= arr[i];
             crr [i+5]=brr[i];
            System.out.println(crr[i]+" ");
        }
    }
}



