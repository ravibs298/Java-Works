import java.util.Scanner;
public class CWR_85 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();
        String result = s.substring(b,a-b);
        System.out.println(result);
        sc.close();
    }
}