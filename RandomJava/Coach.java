public class Coach extends Employee {
   private String sport;

   public void setSport(String setSport) {
      sport = setSport;
   }

   @Override
   public void printInfo() {
      System.out.println(name + " coaches " + sport);
   }
}
