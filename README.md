# Springship's Matrix Search Algo

Springship - Johnny Wong, Richard Wong, and Zane Wang<br />
APCS pd1<br />
L00 -- But What Does the Data Say?<br />
2018-02-09

## Hypothesis
  <p> Springship hypothesizes that our Matrix Search Algo will run in O(n) time regardless of the size of an inputted matrix. </p>

## Background
  <p> Due to procrastination and time constraints, we did not teach ourselves again about command line redirection, as suggested by thinker Raymond Wu. Instead, we inputted data values produced by our MFDriver.java manually into a google spreadsheet that can be found here https://goo.gl/9B94JH. </p>
  <p> Due to our low budget machines, we had to perform the experiment on each matrix manually instead of all at once because of a lack of memory. </p>

## Experiment Methodology
  1. Create a class that makes a n by n matrix that aligns with the rules that values increase from left to right and from top to bottom.      This was completed in Matrix.java
  2. Our MFDriver.java starts timing prior to a loop that searches through each matrix for the bottom left value 1000 times. We can say        for sure that this does not interfere with our data since a O(n) method can be interpretted as the equations "An + B" or "An", where      b is a constant that includes the time it takes to iterate. 
  3. After dividing the total time step 2 took by the number of trials - 1000 times -, we inserted this average time to search into our        spreadsheet with its corresponding matrix of size n times n.
  4. Repeat steps 2 through 3 by executing the driver for each unique matrix.
  5. Graph results.
  
## Results 
  Control Group: <br/>
  ![alt text](https://i.imgur.com/d8OczgE.png)
  
  Experiment Variation 0: <br/>
  ![alt text](https://i.imgur.com/Wd4zn47.png)
  
  Experiment Variation 1: <br/>
  ![alt text](https://i.imgur.com/1DTz18y.png)
  
  Experiment Variation 2: <br/>
  ![alt text](https://i.imgur.com/qCEPdes.png)

## Conclusions
  Our search algorithm seems to run relatively linear. However, there seems to be several outliers when running our experiment, as indicated by the spikes in our graphs. If a best line of fit is drawn on these graphs, it seems like our search algorithm is O(n). The spikes could be a result of problems involving memory or relate to the machine running these trials, as none of our searches were equivalent when run on the same matrix. The search algo looks most linear at lower values due to how quick Java can search through the matrix, but with larger matrices, more spikes appear. 

