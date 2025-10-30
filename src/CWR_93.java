import java.util.Scanner;
public class CWR_93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc. nextInt();
        int b = sc.nextInt();
        boolean found = false;
        for (int num=a;num<=b;num++){
            int x=num;
            int y=0;
            int m = String.valueOf(num).length();

            while (x>0){
                int n = x%10;
                y += Math.pow(n,m);
                x /= 10;
            }
            if (y==num){
                System.out.print(num+" ");
                found = true;
            }
        }
        if(!found){
            System.out.print("-1");
        }
    }
}