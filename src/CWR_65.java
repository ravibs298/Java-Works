import java.util.Scanner;
public class CWR_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = a+b/2;
        if (avg>c){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}