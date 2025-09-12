import java.util.Scanner;
public class CWR_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = a*b;
        if (num<99999 && num>10000){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}