/*
 * Author: Samuel Kellum
 * Date Due: Monday June 28th, 2021
 * Program Description: Computes the number of days for a ball clock to cycle using queues and stacks,
 * based on the number of balls in the clock.
*/

import java.util.*;

public class Homework2 {

    public static void main(String[] args) {
        // Scans txt file, only accepts integers in the range from 27 to 127
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();

        // Checks for valid integer
        if ((line < 27 || line > 127) && (line != 0)) {
            System.out.println("Please enter a valid number.");
        } else {
            // code that runs until scanner reads a 0
            while (line != 0) {
                // this int array represents one day
                int[] day = new int[line];
                // computes the clock function using the scanned value, simulating the balls
                // moving around the clock
                clock(day, line);
                // initializes our final answer to 1 as a "base case" to begin computing LCM
                int result = 1;
                // loops from 0 to the number of balls in the clock
                for (int i = 0; i < line; i++) {
                    int count = 1;
                    int spin = day[i];
                    while (spin != i) {
                        count++;
                        spin = day[spin];
                    }
                    // computes LCM of the result from the previous loop and the most recent count
                    // of days based on the number of spins
                    result = lcm(result, count);
                }
                System.out.println(line + " balls cycle after " + result + " days.");
                line = input.nextInt();
            }
        }
        input.close();
    }

    // Computes GCD of two integers
    public static int gcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        return gcd;
    }

    // Computes LCM of two integers, using the GCD function
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static void clock(int[] day, int numBalls) {

        // these values represent the number of balls each time unit can hold (since I
        // learned coding using JavScript, I like to carry over the idea of using
        // "consts")
        final int minuteQueueSize = 4;
        final int fiveMinutesQueueSize = 11;
        final int hourQueueSize = 11;

        // first in first out
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // last in first out (since the last ball is the first to leave in this clock
        // design when it resets to 0)
        Stack<Integer> minute = new Stack<Integer>();
        Stack<Integer> fiveMinutes = new Stack<Integer>();
        Stack<Integer> hour = new Stack<Integer>();

        // adds each ball into the clock in the form of a queue
        for (int i = 0; i < numBalls; i++) {
            queue.addLast(i);
        }

        // for each minute in a day, simulates one day (which has 1440 minutes)
        for (int min = 0; min < 1440; min++) {
            int ball = queue.removeFirst();

            // if the minute stack is full
            if (minute.size() == minuteQueueSize) {
                // pop each minute ball
                for (int i = 0; i < minuteQueueSize; i++) {
                    queue.addLast(minute.pop());
                }
                // if the five minute stack is full
                if (fiveMinutes.size() == fiveMinutesQueueSize) {
                    // pop each five minute ball
                    for (int i = 0; i < fiveMinutesQueueSize; i++) {
                        queue.addLast(fiveMinutes.pop());
                    }
                    // if the hour stack is full
                    if (hour.size() == hourQueueSize) {
                        // pop each hour ball
                        for (int i = 0; i < hourQueueSize; i++) {
                            queue.addLast(hour.pop());
                        }
                        queue.addLast(ball);
                    }
                    // adds another hour ball into the stack
                    else {
                        hour.push(ball);
                    }
                }
                // adds another five minute ball into the stack
                else {
                    fiveMinutes.push(ball);
                }
            }
            // adds another minute ball into the stack
            else {
                minute.push(ball);
            }
        }

        // stores result for day
        for (int i = 0; i < numBalls; i++) {
            day[i] = queue.removeFirst();
        }

    }

}