import java.util.Scanner;
import java.util.Stack;

public class CWR_13 {
    public static int[] nextHigherPeak(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        Stack<Integer>stack = new Stack<>();
        for (int i=n-1;i >=0;i--){
            while (!stack.isEmpty() && heights[i] >= heights[stack.peek()]){
                stack.pop();

            }
            result[i] = stack.isEmpty() ?-1 : heights[stack.peek()];
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; ++i) {
            heights[i] = sc.nextInt();
        }

        int[] result = nextHigherPeak(heights);

        for (int height : result) {
            System.out.print(height + " ");
        }
        System.out.println();
    }
}
