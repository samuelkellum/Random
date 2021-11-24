import java.util.*;
import java.lang.*;


public class IsPrime{
    public static void main(String[] args) {
        //findNthPrime(1234567);
        int n = 19394489;
        if(isPrime(n)){
            System.out.printf("%d is prime\n", n);
        }
        else{
            System.out.printf("%d is not prime\n", n);
        }
    }

    static boolean recIsPrime(int n){
        int i = 2;
        if (n == 0 || n == 1){
            return false;
        }
        if (n == i){
            return true;
        }

        if (n % i == 0){
            return false;
        }
        i++;
        return isPrime(n);
    }

    static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        else if(n == 2){
            return true;
        }
        else if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    static int findNthPrime(int nthPrime){
        int n = 2;
        int primeCount = 0;
        while(primeCount < nthPrime){
            if(isPrime(n) == true){
                primeCount++;

            }
            n++;
        }
        System.out.printf("Prime number %d: %d\n" , nthPrime, n-1);
        return(n-1);
    }
    
}