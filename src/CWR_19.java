import java.util.Scanner;

public class CWR_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows for 1st matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the no. of column for 1st matrix: ");
        int col1 = sc.nextInt();

        System.out.print("Enter the no. of rows for 2nd matrix: ");
        int row2 = sc.nextInt();
        System.out.print("Enter the no. of column for 2nd matrix: ");
        int col2 = sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication not possible. ");
            sc.close();
            return;
        }
        int[][] m1 = new int[row1][col1];
        int[][] m2 = new int[row2][col2];
        int[][] product = new int[row1][col2];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("Enter element[" + (i + 1) + "][" + (j + 1) + "]: ");
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("Enter element[" + (i + 1) + "][" + (j + 1) + "]: ");
                m2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    product[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        System.out.println("\nProduct of the two matrices:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}