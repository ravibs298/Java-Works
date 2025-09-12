import java.util.Scanner;

public class CWR_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            String type = sc.next();

            if (type.equals("INT")) {
                int sum = 0;
                for (int j = 0; j < M; j++) {
                    sum += sc.nextInt();
                }
                System.out.println(sum);
            } else {
                int x = 0;
                    for (int j = 0; j < M; j++) {
                        String s = sc.next();
                        if (s.length() > x) x = s.length();
                    }
                    System.out.println(x);
                }
            }
        }
    }