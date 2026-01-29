import java.util.Scanner;
public class CWR_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] words = S.split(" ");
        for (String word : words) {
            if (!word.matches(".*[aeiou].*")) {
                System.out.print(word + " ");
            }
        }
    }
}
