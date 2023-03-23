import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,45,3,12,9};
        int sum=0;
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.print("and the sum is "+sum);
    }
}
