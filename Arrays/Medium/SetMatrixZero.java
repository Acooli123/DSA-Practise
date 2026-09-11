class SetMatrixZero {

    public static int[][] setMatrixZero(int arr[][]){
        int n = arr.length;     // length of the row
        int m = arr[0].length;      // length of the col

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    // mark every element in the row is -1 (except zeros)
                    for(int col=0; col<n; col++){
                        if(arr[i][col] != 0){
                            arr[i][col] = -1;
                        }
                    }

                    // mark every element in the col is -1 (except zeros)
                    for(int row=0; row<n; row++){
                        if(arr[row][j] != 0){
                            arr[row][j] = -1;
                        }
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int res[][] = setMatrixZero(arr);

        int n = res.length;     // length of the row
        int m = res[0].length;      // length of the col

        System.err.println("After converting to the zero the matrix is : ");
        for(int i=0; i<n; i++){
            System.err.println("");
            for(int j=0; j<m; j++){
                System.err.print(res[i][j] + " ");
            }
        }
    }
}