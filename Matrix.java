// Team Springship -- Johnny Wong, Richard Wong, and Zane Wang
// APCS2 pd1
// L00 -- But What Does the Data Say?
// 2018-02-09

/*
  Will make a matrix, and we will use this matrix to test the run-time efficiency of our code
*/

public class Matrix {
     int[][] matrix;

     public Matrix(int n) {
          matrix = new int[n][n];
          for (int r = 0; r < matrix.length; r++) {
     	    for (int c = 0; c < matrix[0].length; c++) {
     		matrix[r][c] = r*n + c;
     	    }
         }
     }
      
}
