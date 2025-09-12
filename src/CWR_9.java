import java.util.Scanner;
public class CWR_9 {
    public static int removeDuplicates(int[] nums){
            if (nums.length == 0) {
                return 0;
            }
            int slow = 0;
            for (int fast = 1; fast < nums.length; fast++) {
                if (nums[fast] != nums[slow]) {
                    slow++;
                    nums[slow] = nums[fast];
                }
            }
            return slow + 1;
        }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println("No. of unique elements: " +k);
        System.out.println("Array after removing duplicates");
        for (int i=0;i<k;i++){
            System.out.println(nums[i]);
        }
    }
}
