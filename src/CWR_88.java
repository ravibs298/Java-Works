import java.util.Scanner;
public class CWR_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a*b;
        if (total >= 10000 && total<= 99999){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}