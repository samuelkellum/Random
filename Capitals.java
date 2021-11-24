import java.util.Scanner;
import java.util.HashMap;

public class Capitals {
   public static void main (String[] args) {
      HashMap<String, String> countryCapital = new HashMap<String, String>();
      Scanner scnr = new Scanner(System.in);
      String country;

      countryCapital.put("Egypt", "Cairo");
      countryCapital.put("Chile", "Santiago");
      countryCapital.put("Italy", "Rome");
      countryCapital.put("Austria", "Vienna");

      countryCapital.remove("Egypt");
      countryCapital.remove("Austria");

      country = scnr.next();
      while (!country.equals("exit")) {
         if (countryCapital.containsKey(country)) {
            System.out.print(country + ": ");
            System.out.println(countryCapital.get(country));
         }
         else {
            System.out.println(country + ": n/a");
         }
         country = scnr.next();
      }
   }
}
