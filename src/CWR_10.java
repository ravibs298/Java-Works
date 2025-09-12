import java.util.Scanner;
public class CWR_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = n;
            int sum = 0;
            while(n%10==9){
                sum++;
                n/=10;
            }
            if (sum%2==1){
                System.out.println(m+2);
            }else{
                System.out.println(m+1);
            }
        }

        }
    }
