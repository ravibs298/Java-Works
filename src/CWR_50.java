import java.util.Scanner;
public class CWR_50 extends Exception {
    public CWR_50(String a) {
        super(a);
    }
    public static void checkForVowels(String str) throws CWR_50 {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new CWR_50("It does not contain vowel");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a string:");
            String input = sc.nextLine();

            checkForVowels(input);
            System.out.println("It contains vowel.");
        }
        catch (CWR_50 error) {
            System.out.println(error.getMessage());
        }
    }
}