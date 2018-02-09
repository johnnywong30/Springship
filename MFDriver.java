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

          //*****CONTROL GROUP*****\\
          // Matrix trial = new Matrix(100); // 100 by 100
          // Matrix trial = new Matrix(200); // 200 by 200
          // Matrix trial = new Matrix(300); // 300 by 300
          // Matrix trial = new Matrix(400); // 400 by 400
          // Matrix trial = new Matrix(500); // 500 by 500
          // Matrix trial = new Matrix(600); // 600 by 600
          // Matrix trial = new Matrix(700); // 700 by 700
          // Matrix trial = new Matrix(800); // 800 by 800
          // Matrix trial = new Matrix(900); // 900 by 900
          // Matrix trial = new Matrix(1000); // 1000 by 1000

          //*****EXPERIMENT VARIATION 0*****\\
          // Matrix trial = new Matrix(10000); // 10000 by 10000
          // Matrix trial = new Matrix(11000); // 11000 by 11000
          // Matrix trial = new Matrix(12000); // 12000 by 12000
          // Matrix trial = new Matrix(13000); // 13000 by 13000
          // Matrix trial = new Matrix(14000); // 14000 by 14000
          // Matrix trial = new Matrix(15000); // 15000 by 15000
          // Matrix trial = new Matrix(16000); // 16000 by 16000
          // Matrix trial = new Matrix(17000); // 17000 by 17000
          // Matrix trial = new Matrix(18000); // 18000 by 18000
          // Matrix trial = new Matrix(19000); // 19000 by 19000
          // Matrix trial = new Matrix(20000); // 20000 by 20000

          //*****EXPERIMENT VARIATION 1*****\\
          // Matrix trial = new Matrix(10000); // 10000 by 10000
          // Matrix trial = new Matrix(11000); // 11000 by 11000
          // Matrix trial = new Matrix(12000); // 12000 by 12000
          // Matrix trial = new Matrix(13000); // 13000 by 13000
          // Matrix trial = new Matrix(14000); // 14000 by 14000
          // Matrix trial = new Matrix(15000); // 15000 by 15000
          // Matrix trial = new Matrix(16000); // 16000 by 16000
          // Matrix trial = new Matrix(17000); // 17000 by 17000
          // Matrix trial = new Matrix(18000); // 18000 by 18000
          // Matrix trial = new Matrix(19000); // 19000 by 19000
          // Matrix trial = new Matrix(20000); // 20000 by 20000
          // Matrix trial = new Matrix(21000); // 21000 by 21000

          //*****EXPERIMENT VARIATION 2*****\\
          // Matrix trial = new Matrix(10000); // 10000 by 10000
          // Matrix trial = new Matrix(10500); // 10500 by 10500
          // Matrix trial = new Matrix(11000); // 11000 by 11000
          // Matrix trial = new Matrix(11500); // 11500 by 11500
          // Matrix trial = new Matrix(12000); // 12000 by 12000
          // Matrix trial = new Matrix(12500); // 12500 by 12500
          // Matrix trial = new Matrix(13000); // 13000 by 13000
          // Matrix trial = new Matrix(13500); // 13500 by 13500
          // Matrix trial = new Matrix(14000); // 14000 by 14000
          // Matrix trial = new Matrix(14500); // 14500 by 14500
          // Matrix trial = new Matrix(15000); // 15000 by 15000
          // Matrix trial = new Matrix(15500); // 15500 by 15500

          //********************************************

          long timeStart = System.nanoTime(); // our start time
          int numTrials = 100;
          for (int trialNum = 0; trialNum < numTrials; trialNum++) {
               System.out.println(MatrixFinder.matrixSearch(trial.matrix, trial.matrix.length * trial.matrix.length));
          }
          long timeEnd = System.nanoTime(); // time after for loop finished
          long totalTime = timeEnd - timeStart; // time spent in between
          long averageTime = totalTime / numTrials; // avg time spent searching
          System.out.println("Total time: " + totalTime);
          System.out.println("Average time: " + averageTime);
     }
}
