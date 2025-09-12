import java.util.Scanner;
public class CWR_69 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int odd = 0, even = 0;
        for (int i = 0; i < a; i++){
            int b = sc.nextInt();
            if (b % 2 == 0)
                even++;
            else
                odd++;
        }
        if (odd > even)
            System.out.println("odd");
        else if (even > odd)
            System.out.println("even");
        else
            System.out.println("tie");
    }
}