/*
  Will make a matrix, and we will use this matrix to test the run-time efficiency of our code 
*/

public class MatrixCreator {
    public static int[][] MatrixCreator(int n) {
	int[][] matrix = new int[n][n];
	for (int r = 0; r < matrix.length; r++) {
	    for (int c = 0; c < matrix[0].length; c++) {
		matrix[r][c] = r*n + c;
	    }
	}
	return matrix;
    }
}
