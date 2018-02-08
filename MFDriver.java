// Team Springship -- Johnny Wong, Richard Wong, and Zane Wang
// APCS2 pd1
// L00 -- But What Does the Data Say?
// 2018-02-09

/*

*/
public class MFDriver {
     public static void main (String [] args) {
          //**********INTIALIZE TRIAL MATRICES**********
          // HOW TO USE:
          // Uncomment out which trial you want to perform the experiment on
          // as this is the only way to perform the experiment without a high-end machine
          // due to insufficient memory for us low budget experimenters

           Matrix trial1 = new Matrix(10000); // 10000 by 10000
          // Matrix trial2 = new Matrix(100000); // 100000 by 100000
          // Matrix trial3 = new Matrix(1000000); // 1000000 by 1000000
          // Matrix trial4 = new Matrix(10000000); // 10000000 by 10000000
          // Matrix trial5 = new Matrix(100000000); // 100000000 by 100000000
          // Matrix trial6 = new Matrix(1000000000); // 1000000000 by 1000000000
          // Matrix trial7 = new Matrix(10000000000); // 10000000000 by 10000000000
          // Matrix trial8 = new Matrix(100000000000); // 100000000000 by 100000000000
          // Matrix trial9 = new Matrix(1000000000000); // 1000000000000 by 1000000000000
          // Matrix trial10 = new Matrix(10000000000000); // 10000000000000 by 10000000000000

          //********************************************

          // TRIAL 1
	   long timeStart = System.nanoTime();
	   int numTrials = 100;
	   for (int trial = 0; trial < numTrials; trial++) {
	       System.out.println(MatrixFinder.matrixSearch(trial1.matrix, -1));
	   }
	   long timeEnd = System.nanoTime();
	   long totalTime = timeEnd - timeStart;
	   long averageTime = totalTime / numTrials;
	   System.out.println("Total time: " + totalTime);
	   System.out.println("Average time: " + averageTime);
     }
}
