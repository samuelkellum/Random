public class Nurse extends Employee {
   private String hospital;

   public void setHospital(String setHospital) {
      hospital = setHospital;
   }

   @Override
   public void printInfo() {
      System.out.println(name + " works at " + hospital);
   }
}
