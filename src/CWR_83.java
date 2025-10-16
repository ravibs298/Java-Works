import java.util.Scanner;

public class CWR_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String n = sc.nextLine();
        int x = Integer.parseInt(n);
        StringBuilder result = new StringBuilder();
        int len = a.length();
        int index = 0;
        while (index < len) {
            int toTake = x;
            if (index + x > len) {
                toTake = len - index;
            }

            result.append(a.substring(index, index + toTake));
            index += toTake;

            if (toTake == x && index < len) {
                result.append(b);
            }
        }
        System.out.println(result.toString());
    }
}
