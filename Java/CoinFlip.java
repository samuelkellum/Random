import java.util.*;
import java.io.*;

public class CoinFlip{

  public static void main(String[] args){
    longest_streak(100);
  }

  public static void longest_streak(long flips){
    Random rand = new Random();
    int headStreak = 0;
    int tailStreak = 0;
    int longestStreak = 0;
    for (long flip = 0; flip < flips; flip++) {
      int coin = rand.nextInt(2);
      if (coin == 0){
        headStreak++;
        tailStreak = 0;
      }
      else{
        tailStreak++;
        headStreak = 0;
      }
      if(headStreak > longestStreak || tailStreak > longestStreak){
        longestStreak++;
      }
    }
    System.out.printf("The longest streak of either heads or tails attained by flipping %d coins is: %d\n", 
        flips, longestStreak);
  }

  public static void roll_dice(int rolls){
    Random rand = new Random();
    for (int roll = 0; roll < rolls; roll++){
      System.out.printf("Your dice rolled: %d\n", rand.nextInt(6) + 1);
    }
  }


  public static void coin_flip(int streak, int trials){
    ArrayList<Integer> results = new ArrayList<Integer>();
    Random rand = new Random();
    int streakcount = 0;
    int count = 0;
    for (int trial = 0; trial < trials; trial++){
      while (streakcount < streak){
        int coin = rand.nextInt(2);
        count++;
        if (coin == 0){
          streakcount ++;
        }
        else{
          streakcount = 0;
        }
    }
    results.add(count);
    count = 0;
    streakcount = 0;
  }
  int sum = 0;
  for(int trial = 0; trial <results.size(); trial++){
    sum = sum + results.get(trial);
  }
  int average = sum/results.size();
  System.out.printf("The average number of coin flips to reach a streak of %d heads in a row with %d trials is: %d\n" , streak, trials, average);
  }

  public static void coin_flip_specific_average(int streak, int average){
    Random rand = new Random();
    int streakcount = 0;
    int count = 0;
    ArrayList<Integer> results = new ArrayList<Integer>();
    int mean = 0;
    int trials = 0;
    int coin;
    while (trials < 10000){
      while (streakcount < streak){
        coin = rand.nextInt(2);
        count++;
        if (coin == 0){
          streakcount++;
        }
        else{
          streakcount = 0;
        }
      }
      results.add(count);
      count = 0;
      streakcount = 0;
      int sum = 0;
      for(int trial = 0; trial <results.size(); trial++){
        sum = sum + results.get(trial);
      }
      mean = sum/results.size();
      trials++;
      if (mean - average == 0){
        System.out.print("The number of trials to reach an average number of " + average);
        System.out.println(" coin flips to reach " + streak + " consecutive heads is: " + trials);
        return;
      }
    }
    System.out.println("Unfortunatley, the average " + average + " could not be reached in " + trials + " trials");

  }

  public static void dice_roll_side_streak(int side, int streak){
    if(side < 1 || side > 6){
      System.out.println("Error: invalid side");
      return;
    }
    Random rand = new Random();
    int streakcount = 0;
    int count = 0;
    while (streakcount < streak){
      if ((rand.nextInt(6) + 1) == side){
        streakcount++;
      }
      else{
        streakcount = 0;
      }
      count++;
    }
    System.out.print("The number of dice rolls to reach a streak of " + streak);
    System.out.println(" consecutive " + side + "s in a row is: " + count);
  }

  public static void dice_roll_streak_any(int streak, int trials){
    Random rand = new Random();
    int count = 0;
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;
    int dice;
    int streakcount = 1;
    ArrayList<Integer> results = new ArrayList<Integer>();
    for (int trial = 0; trial < trials; trial++){
      while(streakcount < streak){
        dice = rand.nextInt(6) + 1;
        count++;
        if (dice == 1){
          one++;
          two = 0;
          three = 0;
          four = 0;
          five = 0;
          six = 0;
        }
        else if(dice == 2){
          two++;
          one = 0;
          three = 0;
          four = 0;
          five = 0;
          six = 0;
        }
        else if(dice == 3){
          three++;
          one = 0;
          two = 0;
          four = 0;
          five = 0;
          six = 0;
        }
        else if(dice == 4){
          four++;
          one = 0;
          two = 0;
          three = 0;
          five = 0;
          six = 0;
        }
        else if(dice == 5){
          five++;
          one = 0;
          two = 0;
          three = 0;
          four = 0;
          six = 0;
        }
        else if(dice == 6){
          six++;
          one = 0;
          two = 0;
          three = 0;
          four = 0;
          five = 0;
        }
        if(one > 1 || two > 1|| three > 1|| four > 1|| five > 1|| six > 1){
          streakcount++;
        }
        else{
          streakcount = 1;
        }
      }
      results.add(count);
      count = 0;
      streakcount = 1;
      one = 0;
      two = 0;
      three = 0;
      four = 0;
      five = 0;
      six = 0;
    }
    int sum = 0;
    for(int trial = 0; trial <results.size(); trial++){
      sum = sum + results.get(trial);
    }
    int average = sum/results.size();
    System.out.print("The average number of dice rolls to reach a streak of " + streak);
    System.out.println(" for any number with " + trials + " trials is: " + average);
  }

  public static void coin_flip_streak_any(int streak, int trials){
    Random rand = new Random();
    int heads_streak = 0;
    int tails_streak = 0;
    int count = 0;
    int streakcount = 1;
    int coin;
    ArrayList<Integer> results = new ArrayList<Integer>();
    for (int trial = 0; trial < trials; trial++){
        while (streakcount < streak){
          coin = rand.nextInt(2);
          if (coin == 0){
            heads_streak++;
            tails_streak = 0;
          }
          else{
            heads_streak = 0;
            tails_streak++;
          }
          if (heads_streak > 1 || tails_streak > 1){
            streakcount++;
          }
          else{
            streakcount = 1;
          }
          count++;
        }
        results.add(count);
        count = 0;
        heads_streak = 0;
        tails_streak = 0;
        streakcount = 1;
      }
      int sum = 0;
      for(int trial = 0; trial <results.size(); trial++){
        sum = sum + results.get(trial);
      }
      int average = sum/results.size();
      System.out.print("The average number of coin flips to reach a streak of " + streak);
      System.out.println(" for either heads or tails with " + trials + " trials is: " + average);
  }

  public static void coin_flip_heads_percentage(int flips){
    Random rand = new Random();
    int num_heads = 0;
    for (int flip = 0; flip < flips; flip++){
      if(rand.nextInt(2) == 0){
        num_heads++;
      }
    }
    float percentage = (num_heads * 100.0f) / flips;
    System.out.print("With " + flips + " coin tosses, ");
    System.out.printf("%.2f" , percentage);
    System.out.println(" percent of the flips landed on heads.");
  }

  public static void random_number_of_the_day(int min, int max){
    Random rand = new Random();
    System.out.print("Random number of the day from " + min + " to " + max + ": ");
    System.out.println(rand.nextInt(100) + 1);
  }
}
