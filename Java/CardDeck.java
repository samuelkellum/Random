import java.util.LinkedList;
import java.util.Deque;

public class CardDeck {
   public static void main (String[] args) {
      Deque<String> cards = new LinkedList<String>();

      cards.addFirst("3_hearts");
      cards.addFirst("6_diamonds");
      cards.addFirst("7_clubs");
      cards.addLast("ace_spades");
      cards.addLast("9_diamonds");

      System.out.println(cards.getFirst());
      System.out.println(cards.peekLast());
      System.out.println(cards.peekFirst());
      System.out.println(cards.getLast());
  }
}
