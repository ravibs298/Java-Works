import java.util.Scanner;
public class CWR_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length-1;
        while (left<right){
            if (!Character.isLetter(arr[left])){
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(arr));
    }
}