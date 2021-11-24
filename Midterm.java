public class Midterm {
  private static long count = 0;

  public void Block() {
    this.blockID = count;
    count++;
     }
  public long getBlockID(){
    return this.blockID;
  }

  public void blockCreationTest() {    // at this point ZERO blocks have been instantiated
    Block a = new Block(); // create the very first block ever!
    Block b = new Block();
    Block c = new Block();
    long c_ID = c.getBlockID();
}
}
