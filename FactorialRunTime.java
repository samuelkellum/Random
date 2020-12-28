import java.util.concurrent.TimeUnit;

public class FactorialRunTime{
    static long functionCalls = 0;

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i <= 16; i++){
            long restart = System.nanoTime();
            nFacRuntimeFunc(i);
            long finish = System.nanoTime();

            System.out.printf("Function calls where n = %d: %d\n" , i, functionCalls);
            functionCalls = 0;

            long timeElapsed = finish - start;
            long timeForCall = finish - restart;
            long milliElapsed = TimeUnit.NANOSECONDS.toMillis(timeElapsed);
            long milliCall = TimeUnit.NANOSECONDS.toMillis(timeForCall);
            long secondsElapsed = TimeUnit.MILLISECONDS.toSeconds(milliElapsed);
            long secondsCall = TimeUnit.MILLISECONDS.toSeconds(milliCall);

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
    
    static void nFacRuntimeFunc(int n){
        for(int i = 0; i < n; i++){
            nFacRuntimeFunc(n-1);
        }
    }
}

