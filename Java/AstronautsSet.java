
import java.util.Scanner;
import java.util.HashSet;

public class AstronautsSet {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashSet<String> astronauts = new HashSet<String>();
      String userInput;

      userInput = scnr.nextLine();
      while (userInput.compareTo("done") != 0) {
         if (astronauts.add(userInput)) {
            System.out.println("a");
         }
         else {
            System.out.println("n");
         }
         userInput = scnr.nextLine();
      }

      System.out.println("Size: " + astronauts.size());
   }
}
