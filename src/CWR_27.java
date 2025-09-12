import java.util.Scanner;

public class CWR_27 {

    public static class Solution {
        public int trap(int[] height) {
            int n = height.length;
            if (n == 0) {
                return 0;
            }

            int[] leftMax = new int[n];
            int[] rightMax = new int[n];
            int trappedWater = 0;

            leftMax[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            }

            rightMax[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            }

            for (int i = 0; i < n; i++) {
                int waterLevel = Math.min(leftMax[i], rightMax[i]);
                if (waterLevel > height[i]) {
                    trappedWater += waterLevel - height[i];
                }
            }

            return trappedWater;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bars: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the heights of the bars:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        sc.close();

        Solution so = new Solution();
        int trappedWater = so.trap(height);
        System.out.println("Total trapped water: " + trappedWater);
    }
}