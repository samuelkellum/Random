import java.util.ArrayList;

public class IntegerManager {

   public static void printArrayList(ArrayList<Object> objList) {
      int i;

      for (i = 0; i < objList.size(); ++i) {
         System.out.println(objList.get(i));
      }
   }

   public static void main(String[] args) {
      ArrayList<Object> objList = new ArrayList<Object>();

      String myString = new String("Hello");
      Coffee myCoffee = new Coffee("Mocha", "Dark");
      Business myBusiness = new Business("Dinoco", "3 Lake St");

      objList.add(myCoffee);
      objList.add(myString);
      objList.add(myBusiness);

      printArrayList(objList);
   }
}
