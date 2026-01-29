import java.util.Scanner;
public class CWR_94{
    public static boolean jump(int num) {
        if (num < 10) return true;
        int p_Digit = num % 10;
        num /= 10;
        while (num > 0) {
            int currDigit = num % 10;
            if (Math.abs(p_Digit - currDigit) != 1) return false;
            p_Digit = currDigit;
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            if (jump(i)) System.out.print(i + " ");

        }
    }
}
