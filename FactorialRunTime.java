/*
 * Author: Samuel Kellum
 * Date: December 28, 2020
 * Program Description: A program that logs the time it takes to run each iteration of a recursive function (nFacRuntimeFunc(int n)) with a time complexity of O(n!)
 * PLEASE NOTE that when n <= 12, the program will take less than 2 secgionds to run, but it would take 50 years to run the function if n = 20.
 */


import java.util.concurrent.TimeUnit;

public class FactorialRunTime{
    //this variable tracks how many time the recursive function will be called for each n value
    static long functionCalls = 0;
    public static void main(String[] args) {
        //begins "stopwatch" to time how long each function takes to run in addition to the entire program
        long start = System.nanoTime();

        for (int i = 0; i <= 16; i++){
            //think of this variable as the "lap" button of a stopwatch to start counting the time of the next function call in this for loop
            long restart = System.nanoTime();
            //the actual function with a time complexity of O(n!)
            nFacRuntimeFunc(i);
            //logs the time that the function is done running
            long finish = System.nanoTime();

            System.out.printf("Function calls where n = %d: %d\n" , i, functionCalls);

            //resets variable for the next iteration of the for loop
            functionCalls = 0;

            //calculates the total elapsed time elapsed in nanoseconds
            long timeElapsed = finish - start;

            //calculates the time for the partucilar ith iteration of the function call
            long timeForCall = finish - restart;

            //converts nanoseconds to milliseconds
            long milliElapsed = TimeUnit.NANOSECONDS.toMillis(timeElapsed);
            long milliCall = TimeUnit.NANOSECONDS.toMillis(timeForCall);

            //converts milliseconds to seconds
            long secondsElapsed = TimeUnit.MILLISECONDS.toSeconds(milliElapsed);
            long secondsCall = TimeUnit.MILLISECONDS.toSeconds(milliCall);


            //prints a time value in nanoseconds, milliseconds, or seconds if the larger unit of time is not a full second (since the time elapsed is an integer (long) variable, 999 milliseconds would convert to 0 seconds)
            if (milliCall <= 1){
                System.out.printf("Time for this iteration: %d nanoseconds\n", timeForCall);

            }
            else if (secondsCall <= 1){
                System.out.printf("Time for this iteration: %d milliseconds\n", milliCall);

            }
            else{
                System.out.printf("Time for this iteration: %d seconds\n", secondsCall);

            }

            if (milliElapsed <= 1){
                System.out.printf("Total time: %d nanoseconds\n\n", timeElapsed);

            }
            else if (secondsCall <= 1){
                System.out.printf("Total time: %d milliseconds\n\n", milliElapsed);

            }
            else{
                System.out.printf("Total time: %d seconds\n\n", secondsElapsed);

            }
        }
        
    }

    //This function has a time complexity of O(n!)
    static void nFacRuntimeFunc(int n){
        for(int i = 0; i < n; i++){
            nFacRuntimeFunc(n-1);
        }
    }
}

