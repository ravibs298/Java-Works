import java.util.Scanner;
public class CWR_89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean a = s.contains("&");
        boolean b = s.contains("#");
        boolean c = (s.length() % 2 == 0);
        if (a && b && c){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}