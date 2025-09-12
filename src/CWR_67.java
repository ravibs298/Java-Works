import java.util.Scanner;
public class CWR_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("&") && s.contains("#") && s.length() % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
