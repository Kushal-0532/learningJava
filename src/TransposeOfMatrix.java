public class TransposeOfMatrix
{
    int[][] transpose(int[][] matrix){
        int[][] temporary = new int[matrix[0].length][matrix.length];
        
        for(int i=0; i< matrix.length;i++){
            for(int j = 0; j<matrix[0].length; j++){
                temporary[i][j] = matrix[j][i];
            }
        }

        return temporary;

    }

    public static void main(String[] args) {
        TransposeOfMatrix tm = new TransposeOfMatrix();
        int[][] arr = {{1,2},{4,5}};
        int[][] res = tm.transpose(arr);

        for(int i=0; i< res.length;i++){
            for(int j=0;j< res.length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
