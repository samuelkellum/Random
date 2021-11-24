#include <iostream>
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <vector>
#include <numeric>
#include <iomanip>

using namespace std;

void roll_dice(int rolls){
  srand(time(0));
  for (int roll = 0; roll < rolls; roll ++){
    cout << "Your dice rolled: " << (rand() % 6) + 1 << endl;
  }
}

void coin_flip(int streak, int trials){
  srand(time(0));
  int streakcount = 0;
  int count = 0;
  vector<int> results;
  for (int trial = 0; trial < trials; trial++){
    while (streakcount < streak){
      int coin = rand() % 2;
      count++;
      if (coin == 0){
        streakcount ++;
      }
      else{
        streakcount = 0;
      }
  }
    results.push_back(count);
    count = 0;
    streakcount = 0;
  }
  int sum = accumulate(results.begin(), results.end(), 0);
  int average = sum / results.size();
  cout << "The average number of coin flips to reach a streak of " << streak;
  cout << " heads in a row with " << trials << " trials is: " << average << endl;
}

void coin_flip_specific_average(int streak, int average){
  srand(time(0));
  int streakcount = 0;
  int count = 0;
  vector<int> results;
  int mean = 0;
  int trials = 0;
  int coin;
  while (trials < 10000){
    while (streakcount < streak){
      coin = rand() % 2;
      count++;
      if (coin == 0){
        streakcount++;
      }
      else{
        streakcount = 0;
      }
    }
    results.push_back(count);
    count = 0;
    streakcount = 0;
    int sum = accumulate(results.begin(), results.end(), 0);
    int mean = sum / results.size();
    trials++;
    if (mean - average == 0){
      cout << "The number of trials to reach an average number of " << average;
      cout << " coin flips to reach " << streak << " consecutive heads is: " << trials << endl;
      return;
    }
  }
  cout << "Unfortunatley, the average "<< average << " could not be reached in " << trials << " trials" << endl;

}

void dice_roll_side_streak(int side, int streak){
  if(side < 1 || side > 6){
    cout << "Error: invalid side" << endl;
    return;
  }
  srand(time(0));
  int streakcount = 0;
  int count = 0;
  while (streakcount < streak){
    if ((rand() & 6 + 1) == side){
      streakcount++;
    }
    else{
      streakcount = 0;
    }
    count++;
  }
  cout << "The number of dice rolls to reach a streak of " << streak;
  cout << " consecutive " << side << "s in a row is: " << count << endl;
}

void dice_roll_streak_any(int streak, int trials){
  srand(time(0));
  int count = 0;
  int one = 0;
  int two = 0;
  int three = 0;
  int four = 0;
  int five = 0;
  int six = 0;
  int dice;
  int streakcount = 1;
  vector<int> results;
  for (int trial = 0; trial < trials; trial++){
    while(streakcount < streak){
      dice = (rand() % 6) + 1;
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
    results.push_back(count);
    count = 0;
    streakcount = 1;
    one = 0;
    two = 0;
    three = 0;
    four = 0;
    five = 0;
    six = 0;
  }
  int sum = accumulate(results.begin(), results.end(), 0);
  int average = sum / results.size();
  cout << "The average number of dice rolls to reach a streak of " << streak;
  cout << " for any number with " << trials << " trials is: " << average << endl;
}

void coin_flip_streak_any(int streak, int trials){
  srand(time(0));
  int heads_streak = 0;
  int tails_streak = 0;
  int count = 0;
  int streakcount = 1;
  int coin;
  vector<int> results;
  for (int trial = 0; trial < trials; trial++){
      while (streakcount < streak){
        coin = rand() % 2;
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
      results.push_back(count);
      count = 0;
      heads_streak = 0;
      tails_streak = 0;
      streakcount = 1;
    }
    int sum = accumulate(results.begin(), results.end(), 0);
    int average = sum / results.size();
    cout << "The average number of coin flips to reach a streak of " << streak;
    cout << " for either heads or tails with " << trials << " trials is: " << average << endl;

}
void coin_flip_heads_percentage(int flips){
  srand(time(0));
  int num_heads = 0;
  for (int flip = 0; flip < flips; flip++){
    if(rand() % 2 == 0){
      num_heads++;
    }
  }
  float percentage = (float(num_heads) /float(flips)) * 100;
  cout << "With " << flips << " coin tosses, " << setprecision(4) << percentage;
  cout << " percent of the flips landed on heads." << endl;
}

void random_number_of_the_day(int min, int max){
  srand(time(0));
  cout << "Random number of the day from " << min <<" to "<< max << ": ";
  cout << (rand() % 100) + 1 << endl;
}

int main(){
  roll_dice(2);
  coin_flip(10, 100000);
  coin_flip_specific_average(10, 2020);
  dice_roll_side_streak(6, 6);
  dice_roll_streak_any(5, 100);
  coin_flip_streak_any(15, 100);
  coin_flip_heads_percentage(12345);
  random_number_of_the_day(1, 100);
  return 0;
}
