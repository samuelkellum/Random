import java.util.*;
import java.io.*;

public class CoinFlipObfuscate{

  public static void main(String[] args){
    a(2);
    d(10, 1000000);
    e(10, 2020);
    f(6, 6);
    g(5, 100);
    h(15, 100);
    i(12345);
    j(1, 100);
  }

  public static void a(int k){
    for (int m = 0; m < k; m++){
      Random rand = new Random();
      System.out.printf("Your dice rolled: %d\n", rand.nextInt(6) + 1);
    }
  }


  public static void d(int o, int r){
    ArrayList<Integer> ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk = new ArrayList<Integer>();
    Random rand = new Random();
    int n = 0;
    int p = 0;
    for (int s = 0; s < r; s++){
      while (n < o){
        int l = rand.nextInt(2);
        p++;
        if (l == 0){
          n ++;
        }
        else{
          n = 0;
        }
    }
    ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.add(p);
    p = 0;
    n = 0;
  }
  int t = 0;
  for(int s = 0; s <ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size(); s++){
    t = t + ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.get(s);
  }
  int u = t/ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size();
  System.out.printf("The average number of coin flips to reach a streak of %d heads in a row with %d trials is: %d\n" , o, r, u);
  }

  public static void e(int o, int u){
    Random rand = new Random();
    int n = 0;
    int p = 0;
    ArrayList<Integer> ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk = new ArrayList<Integer>();
    int v = 0;
    int r = 0;
    int l;
    while (r < 10000){
      while (n < o){
        l = rand.nextInt(2);
        p++;
        if (l == 0){
          n++;
        }
        else{
          n = 0;
        }
      }
      ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.add(p);
      p = 0;
      n = 0;
      int t = 0;
      for(int s = 0; s <ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size(); s++){
        t = t + ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.get(s);
      }
      v = t/ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size();
      r++;
      if (v - u == 0){
        System.out.print("The number of trials to reach an average number of " + u);
        System.out.println(" coin flips to reach " + o + " consecutive heads is: " + r);
        return;
      }
    }
    System.out.println("Unfortunatley, the average " + u + " could not be reached in " + r + " trials");

  }

  public static void f(int w, int o){
    if(w < 1 || w > 6){
      System.out.println("Error: invalid side");
      return;
    }
    Random rand = new Random();
    int n = 0;
    int p = 0;
    while (n < o){
      if ((rand.nextInt(6) + 1) == w){
        n++;
      }
      else{
        n = 0;
      }
      p++;
    }
    System.out.print("The number of dice rolls to reach a streak of " + o);
    System.out.println(" consecutive " + w + "s in a row is: " + p);
  }

  public static void g(int o, int r){
    Random rand = new Random();
    int p = 0;
    int x = 0;
    int y = 0;
    int z = 0;
    int aa = 0;
    int ab = 0;
    int ac = 0;
    int ad;
    int n = 1;
    ArrayList<Integer> ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk = new ArrayList<Integer>();
    for (int s = 0; s < r; s++){
      while(n < o){
        ad = rand.nextInt(6) + 1;
        p++;
        if (ad == 1){
          x++;
          y = 0;
          z = 0;
          aa = 0;
          ab = 0;
          ac = 0;
        }
        else if(ad == 2){
          y++;
          x = 0;
          z = 0;
          aa = 0;
          ab = 0;
          ac = 0;
        }
        else if(ad == 3){
          z++;
          x = 0;
          y = 0;
          aa = 0;
          ab = 0;
          ac = 0;
        }
        else if(ad == 4){
          aa++;
          x = 0;
          y = 0;
          z = 0;
          ab = 0;
          ac = 0;
        }
        else if(ad == 5){
          ab++;
          x = 0;
          y = 0;
          z = 0;
          aa = 0;
          ac = 0;
        }
        else if(ad == 6){
          ac++;
          x = 0;
          y = 0;
          z = 0;
          aa = 0;
          ab = 0;
        }
        if(x > 1 || y > 1|| z > 1|| aa > 1|| ab > 1|| ac > 1){
          n++;
        }
        else{
          n = 1;
        }
      }
      ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.add(p);
      p = 0;
      n = 1;
      x = 0;
      y = 0;
      z = 0;
      aa = 0;
      ab = 0;
      ac = 0;
    }
    int t = 0;
    for(int s = 0; s <ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size(); s++){
      t = t + ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.get(s);
    }
    int u = t/ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size();
    System.out.print("The average number of dice rolls to reach a streak of " + o);
    System.out.println(" for any number with " + r + " trials is: " + u);
  }

  public static void h(int o, int r){
    Random rand = new Random();
    int ae = 0;
    int af = 0;
    int p = 0;
    int n = 1;
    int l;
    ArrayList<Integer> ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk = new ArrayList<Integer>();
    for (int s = 0; s < r; s++){
        while (n < o){
          l = rand.nextInt(2);
          if (l == 0){
            ae++;
            af = 0;
          }
          else{
            ae = 0;
            af++;
          }
          if (ae > 1 || af > 1){
            n++;
          }
          else{
            n = 1;
          }
          p++;
        }
        ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.add(p);
        p = 0;
        ae = 0;
        af = 0;
        n = 1;
      }
      int t = 0;
      for(int s = 0; s <ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size(); s++){
        t = t + ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.get(s);
      }
      int u = t/ghusughuiofdshuiogfhiuodsghioufdsoiuhgfdhiosugohuifdshoiugfdsouhiguiofdsougyfsuoyigfuyiodsuyiosvbjk.size();
      System.out.print("The average number of coin flips to reach a streak of " + o);
      System.out.println(" for either heads or tails with " + r + " trials is: " + u);
}

  public static void i(int ai){
    Random rand = new Random();
    int ag = 0;
    for (int ah = 0; ah < ai; ah++){
      if(rand.nextInt(2) == 0){
        ag++;
      }
    }
    float aj = (ag * 100.0f) / ai;
    System.out.print("With " + ai + " coin tosses, ");
    System.out.printf("%.2f" , aj);
    System.out.println(" percent of the flips landed on heads.");
  }

  public static void j(int afsd, int vshjkjvfs){
    Random rand = new Random();
    System.out.print("Random number of the day from " + afsd + " to " + vshjkjvfs + ": ");
    System.out.println(rand.nextInt(100) + 1);
  }
}
