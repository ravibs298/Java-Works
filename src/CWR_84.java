import java.util.Scanner;
public class CWR_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String x = sc.nextLine();
        int count = 0;
        for (int i=0;i<a && i<x.length();i++){
            int y = (int)x.charAt(i);
            if (y >= b && y<= b){
                count++;
            }
        }
        System.out.println(count);
    }
}