import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        int sum=0;
        for(int i = 0;i<size;i++)
        {
            arr[i] = input.nextInt();
            sum+=arr[i];
        }
        System.out.println("provided array is....");
        for(int i = 0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("and the sum is "+sum);
    }
}
