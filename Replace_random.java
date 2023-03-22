import java.util.Scanner;
public class Replace_random {
    int arr[] = new int[10];
    int make_zero(int rand) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=arr[i];
            if (i == rand) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i<10;i++)
        {
            sum-=arr[i];
        }
        return sum;
    }
    void printarr() {
        System.out.println("After Array is ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Replace_random obj = new Replace_random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Element into the array form 1 - 10");
        for (int i = 0; i < 10; i++) {
            obj.arr[i] = sc.nextInt();
        }
        int rand = (int) (Math.random() * 10)+1;
        int num = obj.make_zero(rand);
        obj.printarr();
        System.out.println("Replaced Element is " + num);

    }
}
