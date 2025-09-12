import java.util.Scanner;

public class CWR_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the jagged array: ");
        int rows = sc.nextInt();
        int[][] jaggedArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int columns = sc.nextInt();
            jaggedArray[i] = new int[columns];
            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < columns; j++) {
                System.out.print("Element " + (j + 1) + ": ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}