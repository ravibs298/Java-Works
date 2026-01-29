import java.util.Scanner;
public class CWR_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (char c : S1.toCharArray()) {
            if (S2.indexOf(c) == -1) {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}