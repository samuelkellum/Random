import java.util.concurrent.TimeUnit;

public class Recursion{

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (long i = 0; i <= 41; i++){
            long restart = System.nanoTime();
            System.out.printf("F(%d): %d\n", i, fibonacciRec(i));
            long finish = System.nanoTime();
            long timeElapsed = finish - start;
            long timeFunction = finish - restart;
            long fuckThisShit = TimeUnit.NANOSECONDS.toMillis(timeElapsed);
            long imtired = TimeUnit.NANOSECONDS.toMillis(timeFunction);
            long fuckJava = TimeUnit.MILLISECONDS.toSeconds(imtired);
            long fuckingAnswer = TimeUnit.MILLISECONDS.toSeconds(fuckThisShit);
            //System.out.printf("Time for this iteration: %d seconds\n", fuckJava);
            System.out.printf("%d\n", realSeconds);
        }
    }

    static long fibonacci(long n){
        long fn = 0;
        long fn1 = 1;
        long fn2 = 2;
        if (n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if (n > 1){
            for(long i = 3; i < n; i++){
                fn = fn1 + fn2;
                fn1 = fn2;
                fn2 = fn;
            }
            return fn;
        }
        else{
            System.out.println("Fuck you");
            return -1;
        }
    }
    static int factorialRec(int number){
        if (number < 0){
            System.out.println("Fuck you");
            return -1;
        }
        else if ((number == 0) || (number == 1)){
            return 1;
        }
        else{
            return (number * factorialRec(number - 1));
        }
    }

    static long fibonacciRec(long n){
        if (n < 0){
            System.out.println("Fuck you");
            return -1;
        }
        else if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            return fibonacciRec(n - 1) + fibonacciRec(n -2);
        }
    }
}