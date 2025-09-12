import java.util.Scanner;
public class CWR_28 {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        for (int x = 0; x < nums.length; x++) {
            b += nums[x];

            while (b >= target) {
                minLength = Math.min(minLength, x - a + 1);
                b -= nums[a];
                a++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int minLength = minSubArrayLen(target, nums);

        System.out.println("Minimum length of subarray with sum greater than or equal to target: " + minLength);

        sc.close();
    }
}

