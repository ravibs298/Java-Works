import java.util.Arrays;
import java.util.Scanner;

public class CWR_18 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        char[] charArray = inputString.toCharArray();

        CWR_18 solution = new CWR_18();
        solution.reverseString(charArray);

        System.out.println("Reversed string: " + Arrays.toString(charArray));
        scanner.close();
    }
}