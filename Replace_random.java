public class Replace_random {
    int make_zero(int arr[] , int rand) {
        int sum = 10*(10+1)/2;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == rand)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
            sum -= arr[i];
        }
        System.out.println();
        return sum;
    }
    public static void main(String[] args) {
        int arr[] =  {1,3,2,9,8,7,5,4,6,10};
        Replace_random obj = new Replace_random();
        int rand = 9;
        int num = obj.make_zero(arr,rand);
        System.out.println("Replaced Element is " + num);
    }
}