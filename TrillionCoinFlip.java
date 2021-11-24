import java.io.*;
import java.util.*;

public class TrillionCoinFlip{
    public static void main(String[] args) {
       q(1000000000L);
    }

    public static void q(long f){
        long t = 0;
        for(int i = 0; i < f; i++){
            t++;
        }
        System.out.println("Done");
        System.out.println(t);
    }
}