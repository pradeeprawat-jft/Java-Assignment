//Define a class which has a main method, it initializes an integer array and finds the 3rd largest element without sorting the array.
public class ThirdLarge {
    void find(int arr[])
    {
        int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }
        System.out.println("First Largest Element is " + first);
        System.out.println("Second Largest Element is " + second);
        System.out.println("Third Largest Element is " + third);
    }
    public static void main(String[] args) {
        int arr[] = {7, 2, 1, 4, 9, 10, 6};
        ThirdLarge obj = new ThirdLarge();
        obj.find(arr);
    }
}
