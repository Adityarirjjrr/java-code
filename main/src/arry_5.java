import java.util.Scanner;

public class arry_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pos=0;
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter number " + (i + 1));
            arr[i] = sc.nextInt();
        }

        // Bubble sort to sort the array in ascending order
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter the number you want to find:");
        int n1 = sc.nextInt();

        // Find the position of the input number in the sorted array
        boolean found = false;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == n1)
            {
                pos = i+1;
                found = true;
                break;
            }
        }

        if (found == true)
        {
            System.out.println("The number " + n1 + " is found at position " + pos );
        }
        else
        {
                System.out.println("The number " + n1 + " is not found in the array");
        }
    }
}


