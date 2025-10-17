import java.util.Scanner;
public class CWR_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String x = s.substring(b) + s.substring(0,b);
        System.out.println(x);
    }
}