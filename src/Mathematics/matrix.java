package Mathematics;
public class matrix {
    private int[][] matrix;
    public matrix(int[][] matrix) {
        if(matrix.length!=2 || matrix[0].length!=2 || matrix[1].length!=2) {
            throw new IllegalArgumentException("Only 2*2 matrices are allowed");
        }
        this.matrix=matrix;
    }
    public int[][] add(matrix other){
        int[][] result=new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                result[i][j]=this.matrix[i][j]+other.matrix[i][j];
            }
        }
        return result;
    }
    public int[][] subtract(matrix other){
        int[][] result=new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                result[i][j]=this.matrix[i][j]-other.matrix[i][j];
            }
        }
        return result;
    }
    public void printMatrix() {
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix1= {{9,8},{5,4}};
        int[][] matrix2= {{7,6},{3,2}};
        matrix m1=new matrix(matrix1);
        matrix m2=new matrix(matrix2);
        System.out.println("matrix 1:");
        m1.printMatrix();
        System.out.println("matrix 2:");
        m2.printMatrix();
        int[][] resultAdd=m1.add(m2);
        matrix resultAddMatrix=new matrix(resultAdd);
        System.out.println("sum :");
        resultAddMatrix.printMatrix();
        int[][] resultSubtract=m1.subtract(m2);
        matrix resultSubtractMatrix=new matrix(resultSubtract);
        System.out.println("difference:");
        resultSubtractMatrix.printMatrix();
    }
}