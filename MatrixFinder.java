// Team Springship -- Johnny Wong, Richard Wong, and Zane Wang
// APCS2 pd1
// HW03 -- I Am Still Searching
// 2018-02-01

/*
  Our code starts at the top right corner of the 2D array, and goes to the left if the search input is less than the integer at the current position,
  and down if the search input is greater than the integer at the current position. Once it finds the number, it would return the position it is at.
  If it tries to go left when at the leftmost column or down at the bottommost row, the code will return the position [-1,-1].
*/

public class MatrixFinder {
    public static String matrixSearch (int [][] array, int input) {
	// in order to start at the top right corner of the array
	// these variables must be initialized as follows

	int row = 0; // start at the first row
	int col = array[0].length - 1; // start at the last column

	// while col has not reached -1
	// and row is still within the number of rows present in the inputted array
	// continue the search

	while (row < array.length && col >= 0) {
	    if (array[row][col] == input) {
		return "(" + row + ", " + col + ")"; // if input is found, return the location
	    }
	    else if (array[row][col] < input) {
		// System.out.println("pass");
		row++; // if the current value is less than the input, go down one row
	    }
	    else {
		// System.out.println("pass");
		col--; // if the current value is greater, go left one column
	    }
	}
	return "(-1,-1)"; // if input not found
    }

    public static void main (String[] args) {
	int [][] test1 = { {1, 2, 3},
			   {2, 3, 4},
			   {3, 4, 5},
	};

	int [][] test2 = { {1, 2, 3, 4},
			   {2, 3, 4, 5},
			   {3, 4, 5, 6},
			   {7, 8, 9, 10}
	};

	System.out.println(matrixSearch(test1, 3)); // Best Case; should be (0,2)
	System.out.println(matrixSearch(test1, 4)); // Middle Case; should be (1,2)
	System.out.println(matrixSearch(test2, 7)); // Worst Case; should be (3,0)
	System.out.println(matrixSearch(test2, 0)); // Not found; should be (-1,-1)
	System.out.println(MatrixCreator.MatrixCreator(1000));
    }
}
