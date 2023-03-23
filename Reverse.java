//Define a class which has a main method, it receives a string as input and reverses it. Do it twice, first using the methods of the String class second by defining your own reverse method.
import java.util.Scanner;
public class Reverse {
    String reverse(String str, int size, String ans) {
        for (int i = size - 1; i >= 0; i--)
            ans += str.charAt(i);
        return ans; //here total size number of object are creating
    }
    StringBuilder preDefined(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        return input.reverse();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();
        Reverse obj = new Reverse();
//        System.out.println(obj.reverse(str, str.length(), ""));
        System.out.println(obj.preDefined(str));

    }
}
