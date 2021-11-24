
import java.util.Scanner;
import java.util.HashMap;

public class Teams {
   public static void main (String[] args) {
      HashMap<String, String> playerTeam = new HashMap<String, String>();
      Scanner scnr = new Scanner(System.in);
      String playerName;

      playerTeam.put("Sharif", "Tigers");
      playerTeam.put("Woods", "Rams");
      playerTeam.put("Gregory", "Ravens");
      playerTeam.putIfAbsent("Wang", "Lions");
      playerTeam.putIfAbsent("Woods", "Eagles");

      playerName = scnr.next();
      while (!playerName.equals("exit")) {
         System.out.print(playerName + ": ");
         System.out.println(playerTeam.get(playerName));
         playerName = scnr.next();
      }
   }
}
