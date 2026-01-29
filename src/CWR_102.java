import java.util.Scanner;
public class CWR_102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length();
        int mid = n/2;
        String left,right;
        if (n%2==0){
            left = S.substring(0,mid);
            right = S.substring(mid);
        }else {
            left = S.substring(0, mid);
            right = S.substring(mid);
        }
        String T = new StringBuilder(left).reverse().toString() + new StringBuilder(right).reverse().toString();
        System.out.println(isPalindrome(T) ? "True" : "False");
    }
    static boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while (i<j){
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }
};
