//Define a class which has a main method, it initializes an integer array and finds the 3rd largest element without sorting the array.

import java.util.Scanner;
public class ThirdLarge {
    void find(int arr[])
    {
        int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second)
            {
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third)
            {
                third = arr[i];
            }
        }
        System.out.println("Third Largest Element is "+third);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        if (size < 3) {
            System.out.println("Need to change array size to more then 3");
        } else {
            ThirdLarge obj = new ThirdLarge();
            obj.find(arr);
        }
    }
}
