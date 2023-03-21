import java.util.Scanner;
public class Replace_random {
    int arr[] = new int[10];
    int makezero(int rand) {
        int num = arr[rand];
        for (int i = 0; i < 10; i++) {
            if (i == rand) {
                arr[i] = 0;
            }
        }
        return num;
    }
    void printarr() {
        System.out.println("Array is ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void CraeteArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Element into the array form 1 - 10");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Replace_random obj = new Replace_random();
        obj.CraeteArr();
        obj.printarr();
        int rand = (int) (Math.random() * 10)+1;
        int num = obj.makezero(rand);
        System.out.println("Replaced Element is " + num);
        obj.printarr();


    }
}
