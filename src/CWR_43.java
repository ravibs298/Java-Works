import java.util.Scanner;
public class CWR_43 {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + "is not a Palindrome.");
        }
    }
}