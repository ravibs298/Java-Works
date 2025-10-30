import java.util.Scanner;
public class CWR_92 {
    public static int root(int sum){
        if(sum==0){
            return  0;
        }
        return 1+(sum-1)%9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int k = sc.nextInt();
        int x=0;
        for (char c:n.toCharArray()){
            x += c-'0';
        }
        int y = x*k;
        while (y>=10){
            int temp =0;
            while (y>0){
                temp += y%10;
                y /= 10;
            }
            y = temp;
        }
        System.out.println(y);
    }
}