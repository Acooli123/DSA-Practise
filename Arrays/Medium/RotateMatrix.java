class RotateMatrix {
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;       // rows
        int m = matrix[0].length;    // cols

        int ans[][] = new int[m][n]; // swapped dimensions

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }

        System.out.println("After rotation of 90 degree, the matrix is : ");

        // Print rotated matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotateMatrix(matrix);
    }
}
