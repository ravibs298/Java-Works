import java.util.Arrays;
import java.util.Scanner;

public class CWR_21 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }

        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of nums1 (comma-separated):");
        String nums1Str = scanner.nextLine();
        String[] nums1ArrStr = nums1Str.split(",");
        int[] nums1 = new int[nums1ArrStr.length];
        for (int i = 0; i < nums1ArrStr.length; i++) {
            nums1[i] = Integer.parseInt(nums1ArrStr[i].trim());
        }

        System.out.print("Enter the value of m (number of elements in nums1 that are actually used): ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the elements of nums2 (comma-separated):");
        String nums2Str = scanner.nextLine();
        String[] nums2ArrStr = nums2Str.split(",");
        int[] nums2 = new int[nums2ArrStr.length];
        for (int i = 0; i < nums2ArrStr.length; i++) {
            nums2[i] = Integer.parseInt(nums2ArrStr[i].trim());
        }

        System.out.print("Enter the value of n (number of elements in nums2): ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] mergedNums1 = new int[m + n];
        System.arraycopy(nums1, 0, mergedNums1, 0, m);

        CWR_21 solution = new CWR_21();
        solution.merge(mergedNums1, m, nums2, n);

        System.out.println("Merged array nums1: " + Arrays.toString(mergedNums1));

        scanner.close();
    }
}