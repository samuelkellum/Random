import java.util.*;
import java.io.*;

public class AAAAvsRoyal {
    public static void main(String[] args) {
        Random rand = new Random();
        long count = 0;
        int royalcount = 0;
        int royalflush = 0;
        int quadaces_count = 0;
        int aaaa = 0;
        int ace_countp1 = 0;
        int ace_countp2 = 0;
        int spadesp1 = 0;
        int heartsp1 = 0;
        int diamondsp1 = 0;
        int clubsp1 = 0;
        int spadesp2 = 0;
        int heartsp2 = 0;
        int diamondsp2 = 0;
        int clubsp2 = 0;
        int aaaaL = 0;
        ArrayList<String> deck = new ArrayList<String>();
        deck.add("A of Spades"); deck.add("2 of Spades"); deck.add("3 of Spades"); deck.add("4 of Spades"); deck.add("5 of Spades"); deck.add("6 of Spades"); deck.add("7 of Spades"); deck.add("8 of Spades"); deck.add("9 of Spades"); deck.add("10 of Spades"); deck.add("J of Spades"); deck.add("Q of Spades"); deck.add("K of Spades");
        deck.add("A of Diamonds"); deck.add("2 of Diamonds"); deck.add("3 of Diamonds"); deck.add("4 of Diamonds"); deck.add("5 of Diamonds"); deck.add("6 of Diamonds"); deck.add("7 of Diamonds"); deck.add("8 of Diamonds"); deck.add("9 of Diamonds"); deck.add("10 of Diamonds"); deck.add("J of Diamonds"); deck.add("Q of Diamonds"); deck.add("K of Diamonds");
        deck.add("A of Hearts"); deck.add("2 of Hearts"); deck.add("3 of Hearts"); deck.add("4 of Hearts"); deck.add("5 of Hearts"); deck.add("6 of Hearts"); deck.add("7 of Hearts"); deck.add("8 of Hearts"); deck.add("9 of Hearts"); deck.add("10 of Hearts"); deck.add("J of Hearts"); deck.add("Q of Hearts"); deck.add("K of Hearts");
        deck.add("A of Clubs"); deck.add("2 of Clubs"); deck.add("3 of Clubs"); deck.add("4 of Clubs"); deck.add("5 of Clubs"); deck.add("6 of Clubs"); deck.add("7 of Clubs"); deck.add("8 of Clubs"); deck.add("9 of Clubs"); deck.add("10 of Clubs"); deck.add("J of Clubs"); deck.add("Q of Clubs"); deck.add("K of Clubs"); 
        while (aaaaL < 100){
            count++;
            String hand1p1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand1p1);
            String hand2p1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand2p1);
            String hand1p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand1p2);
            String hand2p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand2p2);
            String flop1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(flop1);
            String flop2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(flop2);
            String flop3 = deck.get(rand.nextInt(deck.size()));
            deck.remove(flop3);
            String turn = deck.get(rand.nextInt(deck.size()));
            deck.remove(turn);
            String river = deck.get(rand.nextInt(deck.size()));
            deck.remove(river);

            //Quad Aces Finder
            if (hand1p1 == "A of Clubs" || hand1p1 == "A of Diamonds" || hand1p1 == "A of Hearts" || hand1p1 == "A of Spades"){
                ace_countp1 ++;}
            if (hand2p1 == "A of Clubs" || hand2p1 == "A of Diamonds" || hand2p1 == "A of Hearts" || hand2p1 == "A of Spades"){
                ace_countp1 ++;}
            if (hand1p2 == "A of Clubs" || hand1p2 == "A of Diamonds" || hand1p2 == "A of Hearts" || hand1p2 == "A of Spades"){
                ace_countp2 ++;}
            if (hand2p2 == "A of Clubs" || hand2p2 == "A of Diamonds" || hand2p2 == "A of Hearts" || hand2p2 == "A of Spades"){
                ace_countp2 ++;}
            if (flop1 == "A of Clubs" || flop1 == "A of Diamonds" || flop1 == "A of Hearts" || flop1 == "A of Spades"){
                ace_countp1 ++;
                ace_countp2 ++;}
            if (flop2 == "A of Clubs" || flop2 == "A of Diamonds" || flop2 == "A of Hearts" || flop2 == "A of Spades"){
                ace_countp1 ++;
                ace_countp2 ++;}
            if (flop3 == "A of Clubs" || flop3 == "A of Diamonds" || flop3 == "A of Hearts" || flop3 == "A of Spades"){
                ace_countp1 ++;
                ace_countp2 ++;}
            if (turn == "A of Clubs" || turn == "A of Diamonds" || turn == "A of Hearts" || turn == "A of Spades"){
                ace_countp1 ++;
                ace_countp2 ++;}
            if (river == "A of Clubs" || river == "A of Diamonds" || river == "A of Hearts" || river == "A of Spades"){
                ace_countp1 ++;
                ace_countp2 ++;}
            
            //Royal Flush Finder
            //Hand 1 Player 1
            if (hand1p1 == "A of Spades" || hand1p1 == "10 of Spades" || hand1p1 == "J of Spades" || hand1p1 == "Q of Spades" || hand1p1 == "K of Spades"){
                clubsp1 ++;
            } else if (hand1p1 == "A of Diamonds" || hand1p1 == "10 of Diamonds" || hand1p1 == "J of Diamonds" || hand1p1 == "Q of Diamonds" || hand1p1 == "K of Diamonds"){
                diamondsp1 ++;
            } else if (hand1p1 == "A of Hearts" || hand1p1 == "10 of Hearts" || hand1p1 == "J of Hearts" || hand1p1 == "Q of Hearts" || hand1p1 == "K of Hearts"){
                heartsp1 ++;
            } else if (hand1p1 == "A of Clubs" || hand1p1 == "10 of Clubs" || hand1p1 == "J of Clubs" || hand1p1 == "Q of Clubs" || hand1p1 == "K of Clubs"){
                spadesp1 ++;}
        //Hand 2 Player 1 
            if (hand2p1 == "A of Spades" || hand2p1 == "10 of Spades" || hand2p1 == "J of Spades" || hand2p1 == "Q of Spades" || hand2p1 == "K of Spades"){
                clubsp1 ++;
            } else if (hand2p1 == "A of Diamonds" || hand2p1 == "10 of Diamonds" || hand2p1 == "J of Diamonds" || hand2p1 == "Q of Diamonds" || hand2p1 == "K of Diamonds"){
                diamondsp1 ++;
            } else if (hand2p1 == "A of Hearts" || hand2p1 == "10 of Hearts" || hand2p1 == "J of Hearts" || hand2p1 == "Q of Hearts" || hand2p1 == "K of Hearts"){
                heartsp1 ++;
            } else if (hand2p1 == "A of Clubs" || hand2p1 == "10 of Clubs" || hand2p1 == "J of Clubs" || hand2p1 == "Q of Clubs" || hand2p1 == "K of Clubs"){
                spadesp1 ++;}
            //Hand 1 Player 2
            if (hand1p2 == "A of Spades" || hand1p2 == "10 of Spades" || hand1p2 == "J of Spades" || hand1p2 == "Q of Spades" || hand1p2 == "K of Spades"){
                clubsp2 ++;
            } else if (hand1p2 == "A of Diamonds" || hand1p2 == "10 of Diamonds" || hand1p2 == "J of Diamonds" || hand1p2 == "Q of Diamonds" || hand1p2 == "K of Diamonds"){
                diamondsp2 ++;
            } else if (hand1p2 == "A of Hearts" || hand1p2 == "10 of Hearts" || hand1p2 == "J of Hearts" || hand1p2 == "Q of Hearts" || hand1p2 == "K of Hearts"){
                heartsp2 ++;
            } else if (hand1p2 == "A of Clubs" || hand1p2 == "10 of Clubs" || hand1p2 == "J of Clubs" || hand1p2 == "Q of Clubs" || hand1p2 == "K of Clubs"){
                spadesp2 ++;}
        //Hand 2 Player 2
            if (hand2p2 == "A of Spades" || hand2p2 == "10 of Spades" || hand2p2 == "J of Spades" || hand2p2 == "Q of Spades" || hand2p2 == "K of Spades"){
                clubsp2 ++;
            } else if (hand2p2 == "A of Diamonds" || hand2p2 == "10 of Diamonds" || hand2p2 == "J of Diamonds" || hand2p2 == "Q of Diamonds" || hand2p2 == "K of Diamonds"){
                diamondsp2 ++;
            } else if (hand2p2 == "A of Hearts" || hand2p2 == "10 of Hearts" || hand2p2 == "J of Hearts" || hand2p2 == "Q of Hearts" || hand2p2 == "K of Hearts"){
                heartsp2 ++;
            } else if (hand2p2 == "A of Clubs" || hand2p2 == "10 of Clubs" || hand2p2 == "J of Clubs" || hand2p2 == "Q of Clubs" || hand2p2 == "K of Clubs"){
                spadesp2 ++;}
            //Flop 1
            if (flop1 == "A of Spades" || flop1 == "10 of Spades" || flop1 == "J of Spades" || flop1 == "Q of Spades" || flop1 == "K of Spades"){
                clubsp1 ++;
                clubsp2 ++;
            } else if (flop1 == "A of Diamonds" || flop1 == "10 of Diamonds" || flop1 == "J of Diamonds" || flop1 == "Q of Diamonds" || flop1 == "K of Diamonds"){
                diamondsp1 ++;
                diamondsp2 ++;
            } else if (flop1 == "A of Hearts" || flop1 == "10 of Hearts" || flop1 == "J of Hearts" || flop1 == "Q of Hearts" || flop1 == "K of Hearts"){
                heartsp1 ++;
                heartsp2 ++;
            } else if (flop1 == "A of Clubs" || flop1 == "10 of Clubs" || flop1 == "J of Clubs" || flop1 == "Q of Clubs" || flop1 == "K of Clubs"){
                spadesp1 ++;
                spadesp2 ++;}
        //Flop 2
            if (flop2 == "A of Spades" || flop2 == "10 of Spades" || flop2 == "J of Spades" || flop2 == "Q of Spades" || flop2 == "K of Spades"){
                clubsp1 ++;
                clubsp2 ++;
            } else if (flop2 == "A of Diamonds" || flop2 == "10 of Diamonds" || flop2 == "J of Diamonds" || flop2 == "Q of Diamonds" || flop2 == "K of Diamonds"){
                diamondsp1 ++;
                diamondsp2 ++;
            } else if (flop2 == "A of Hearts" || flop2 == "10 of Hearts" || flop2 == "J of Hearts" || flop2 == "Q of Hearts" || flop2 == "K of Hearts"){
                heartsp1 ++;
                heartsp2 ++;
            } else if (flop2 == "A of Clubs" || flop2 == "10 of Clubs" || flop2 == "J of Clubs" || flop2 == "Q of Clubs" || flop2 == "K of Clubs"){
                spadesp1 ++;
                spadesp2 ++;}
        //Flop 3
            if (flop3 == "A of Spades" || flop3 == "10 of Spades" || flop3 == "J of Spades" || flop3 == "Q of Spades" || flop3 == "K of Spades"){
                clubsp1 ++;
                clubsp2 ++;
            } else if (flop3 == "A of Diamonds" || flop3 == "10 of Diamonds" || flop3 == "J of Diamonds" || flop3 == "Q of Diamonds" || flop3 == "K of Diamonds"){
                diamondsp1 ++;
                diamondsp2 ++;
            } else if (flop3 == "A of Hearts" || flop3 == "10 of Hearts" || flop3 == "J of Hearts" || flop3 == "Q of Hearts" || flop3 == "K of Hearts"){
                heartsp1 ++;
                heartsp2 ++;
            } else if (flop3 == "A of Clubs" || flop3 == "10 of Clubs" || flop3 == "J of Clubs" || flop3 == "Q of Clubs" || flop3 == "K of Clubs"){
                spadesp1 ++;
                spadesp2 ++;}
            //Turn
            if (turn == "A of Spades" || turn == "10 of Spades" || turn == "J of Spades" || turn == "Q of Spades" || turn == "K of Spades"){
                clubsp1 ++;
                clubsp2 ++;
            } else if (turn == "A of Diamonds" || turn == "10 of Diamonds" || turn == "J of Diamonds" || turn == "Q of Diamonds" || turn == "K of Diamonds"){
                diamondsp1 ++;
                diamondsp2 ++;
            } else if (turn == "A of Hearts" || turn == "10 of Hearts" || turn == "J of Hearts" || turn == "Q of Hearts" || turn == "K of Hearts"){
                heartsp1 ++;
                heartsp2 ++;
            } else if (turn == "A of Clubs" || turn == "10 of Clubs" || turn == "J of Clubs" || turn == "Q of Clubs" || turn == "K of Clubs"){
                spadesp1 ++;
                spadesp2 ++;}
        //River
            if (river == "A of Spades" || river == "10 of Spades" || river == "J of Spades" || river == "Q of Spades" || river == "K of Spades"){
                clubsp1 ++;
                clubsp2 ++;
            } else if (river == "A of Diamonds" || river == "10 of Diamonds" || river == "J of Diamonds" || river == "Q of Diamonds" || river == "K of Diamonds"){
                diamondsp1 ++;
                diamondsp2 ++;
            } else if (river == "A of Hearts" || river == "10 of Hearts" || river == "J of Hearts" || river == "Q of Hearts" || river == "K of Hearts"){
                heartsp1 ++;
                heartsp2 ++;
            } else if (river == "A of Clubs" || river == "10 of Clubs" || river == "J of Clubs" || river == "Q of Clubs" || river == "K of Clubs"){
                spadesp1 ++;
                spadesp2 ++;}
            
            //Pocket Aces for Both Players
            //Player 1
            if ((hand1p1 == "A of Clubs" || hand1p1 == "A of Hearts" || hand1p1 == "A of Diamonds" || hand1p1 == "A of Spades") &&
                (hand2p1 == "A of Clubs" || hand2p1 == "A of Hearts" || hand2p1 == "A of Diamonds" || hand2p1 == "A of Spades") &&
                (hand1p2 == "A of Clubs" || hand1p2 == "A of Hearts" || hand1p2 == "A of Diamonds" || hand1p2 == "A of Spades") &&
                (hand2p2 == "A of Clubs" || hand2p2 == "A of Hearts" || hand2p2 == "A of Diamonds" || hand2p2 == "A of Spades")){
                /*System.out.println (hand1p1)
                System.out.println (hand2p1)
                System.out.println ("")
                System.out.println (hand1p2)
                System.out.println (hand2p2)
                System.out.println ("")
                System.out.println (flop1)
                System.out.println (flop2)
                System.out.println (flop3)
                System.out.println (turn)
                System.out.println (river)
                System.out.println (("Count %d") % (count))
                System.out.println ("")
                System.out.println ("")*/
                }

            if (ace_countp1 == 4 || ace_countp2 == 4){
                quadaces_count ++;
                aaaa ++;}

            if (clubsp1 == 5 || clubsp2 == 5 || heartsp1 == 5 || heartsp2 == 5 || diamondsp1 == 5 || diamondsp2 == 5 || spadesp1 == 5 || spadesp2 == 5){
                royalcount ++;
                royalflush ++;
                /*System.out.println (hand1p1)
                System.out.println (hand2p1)
                System.out.println ("")
                System.out.println (hand1p2)
                System.out.println (hand2p2)
                System.out.println ("")
                System.out.println (flop1)
                System.out.println (flop2)
                System.out.println (flop3)
                System.out.println (turn)
                System.out.println (river)
                System.out.println ("")
                System.out.println ("")*/
            }

            if (aaaa == 1 && royalflush == 1){
                aaaaL ++;
                System.out.println (hand1p1);
                System.out.println(hand2p1+"\n");
                System.out.println(hand1p2);
                System.out.println(hand2p2 + "\n");
                System.out.println(flop1);
                System.out.println(flop2);
                System.out.println(flop3);
                System.out.println(turn);
                System.out.println(river);
                System.out.println(count);
                System.out.println(aaaaL + "\n\n");
            }

            //Resets Variables
            ace_countp1 = 0;
            ace_countp2 = 0;
            spadesp1 = 0;
            heartsp1 = 0;
            diamondsp1 = 0;
            clubsp1 = 0;
            spadesp2 = 0;
            heartsp2 = 0;
            diamondsp2 = 0;
            clubsp2 = 0;
            aaaa = 0;
            royalflush = 0;

            deck.add(hand1p1);
            deck.add(hand2p1);
            deck.add(hand1p2);
            deck.add(hand2p2);
            deck.add(flop1);
            deck.add(flop2);
            deck.add(flop3);
            deck.add(turn);
            deck.add(river);
        }
    }
}