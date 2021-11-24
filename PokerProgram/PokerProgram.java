import java.util.*;
import java.io.*;

public class PokerProgram {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] cards = {"A♠", "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♦", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♥", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♣", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣"};
        ArrayList<String> deck = new ArrayList<String>(Arrays.asList(cards));
        ////Global variables
        int count = 0;
        int total = 0;
        String hand;
        String hand1;
        String hand2;
        /*String hand1p2;
        String hand2p2;*/
        String flop1;
        String flop2;
        String flop3;
        String turn;
        String river;
        //Royal Flush Variables
        int clubs = 0;
        int diamonds = 0;
        int hearts = 0;
        int spades = 0;
        int royalcount = 0;
        int royalflush = 0;
        //Straight Flush Variables
        int c5 = 0;
        int c6 = 0;
        int c7 = 0;
        int c8 = 0;
        int c9 = 0;
        int c10 = 0;
        int cJ = 0;
        int cQ = 0;
        int cK = 0;
        int d5 = 0;
        int d6 = 0;
        int d7 = 0;
        int d8 = 0;
        int d9 = 0;
        int d10 = 0;
        int dJ = 0;
        int dQ = 0;
        int dK = 0;
        int h5 = 0;
        int h6 = 0;
        int h7 = 0;
        int h8 = 0;
        int h9 = 0;
        int h10 = 0;
        int hJ = 0;
        int hQ = 0;
        int hK = 0;
        int s5 = 0;
        int s6 = 0;
        int s7 = 0;
        int s8 = 0;
        int s9 = 0;
        int s10 = 0;
        int sJ = 0;
        int sQ = 0;
        int sK = 0;
        int straightflush = 0;
        int straight_flush_count = 0;
        //Flush Variables
        int flushspades = 0;
        int flushhearts = 0;
        int flushclubs = 0;
        int flushdiamonds = 0;
        int flushcount = 0;
        int flush = 0;
        //Straight Variables
        int tothe5 = 0;
        int tothe6 = 0;
        int tothe7 = 0;
        int tothe8 = 0;
        int tothe9 = 0;
        int tothe10 = 0;
        int totheJ = 0;
        int totheQ = 0;
        int totheK = 0;
        int totheA = 0;
        int straightcount = 0;
        int straight = 0;
        //Four of a Kind + Full House + Straight + Three of a Kind + Two Pair + Pair
        int two_count = 0;
        int three_count = 0;
        int four_count = 0;
        int five_count = 0;
        int six_count = 0;
        int seven_count = 0;
        int eight_count = 0;
        int nine_count = 0;
        int ten_count = 0;
        int jack_count = 0;
        int queen_count = 0;
        int king_count = 0;
        int ace_count = 0;
        //Four of a Kind Variables
        int four_of_a_kind_count = 0;
        int quad_count = 0;
        //Full House Variables
        int full_house = 0;
        int full_house_count = 0;
        //Three of a Kind Variables
        int three_of_a_kind_count = 0;
        int trips_count = 0;
        //Two Pair Variables
        int two_pair_count = 0;
        //Pocket Aces Variables
        int pocket_aces_count = 0;
        int pocketaces = 0;
        int bullets = 0;
        //Pair Variables
        int two_of_a_kind_count = 0;
        int pair_count = 0;
        //High Card Variables
        int high_card_count = 0;
        // 2-7 Offsuit Variables{
        int two_seven_offs_count = 0;
        int two_seven_offsuit = 0;

        /*int userInput;
        Scanner s = new Scanner(System.in);
        System.out.println("How many trials? ");
        userInput = s.nextInt();*/

        while(count < 5000){
            count++;
            //Randomly selects cards from deck, removing each card from deck after selected.
            hand1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand1);
            hand2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand2);
            /*hand1p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand1p2);
            hand1p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(hand1p2);*/
            flop1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(flop1);
            flop2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(flop2);
            flop3 = deck.get(rand.nextInt(deck.size()));
            deck.remove(flop3);
            turn = deck.get(rand.nextInt(deck.size()));
            deck.remove(turn);
            river = deck.get(rand.nextInt(deck.size()));
            deck.remove(river);



            /*System.out.println(hand1);
            System.out.println(hand2+"\n");
            System.out.println(flop1);
            System.out.println(flop2);
            System.out.println(flop3);
            System.out.println(turn);
            System.out.println(river+"\n\n");*/

            ////Hand Finders
            //Royal Flush
            //Hand 1
            if (hand1 == "A♠" || hand1 == "10♠" || hand1 == "J♠" || hand1 == "Q♠" || hand1 == "K♠"){
                clubs ++;
            }else if (hand1 == "A♦" || hand1 == "10♦" || hand1 == "J♦" || hand1 == "Q♦" || hand1 == "K♦"){
                diamonds ++;
            }else if (hand1 == "A♥" || hand1 == "10♥" || hand1 == "J♥" || hand1 == "Q♥" || hand1 == "K♥"){
                hearts ++;
            }else if (hand1 == "A♣" || hand1 == "10♣" || hand1 == "J♣" || hand1 == "Q♣" || hand1 == "K♣"){
                spades ++;
            }
            //Hand 2
            if (hand2 == "A♠" || hand2 == "10♠" || hand2 == "J♠" || hand2 == "Q♠" || hand2 == "K♠"){
                clubs ++;
            }else if (hand2 == "A♦" || hand2 == "10♦" || hand2 == "J♦" || hand2 == "Q♦" || hand2 == "K♦"){
                diamonds ++;
            }else if (hand2 == "A♥" || hand2 == "10♥" || hand2 == "J♥" || hand2 == "Q♥" || hand2 == "K♥"){
                hearts ++;
            }else if (hand2 == "A♣" || hand2 == "10♣" || hand2 == "J♣" || hand2 == "Q♣" || hand2 == "K♣"){
                spades ++;
            }
            //Flop 1
            if (flop1 == "A♠" || flop1 == "10♠" || flop1 == "J♠" || flop1 == "Q♠" || flop1 == "K♠"){
                clubs ++;
            }else if (flop1 == "A♦" || flop1 == "10♦" || flop1 == "J♦" || flop1 == "Q♦" || flop1 == "K♦"){
                diamonds ++;
            }else if (flop1 == "A♥" || flop1 == "10♥" || flop1 == "J♥" || flop1 == "Q♥" || flop1 == "K♥"){
                hearts ++;
            }else if (flop1 == "A♣" || flop1 == "10♣" || flop1 == "J♣" || flop1 == "Q♣" || flop1 == "K♣"){
                spades ++;
            }
            //Flop 2
            if (flop2 == "A♠" || flop2 == "10♠" || flop2 == "J♠" || flop2 == "Q♠" || flop2 == "K♠"){
                clubs ++;
            }else if (flop2 == "A♦" || flop2 == "10♦" || flop2 == "J♦" || flop2 == "Q♦" || flop2 == "K♦"){
                diamonds ++;
            }else if (flop2 == "A♥" || flop2 == "10♥" || flop2 == "J♥" || flop2 == "Q♥" || flop2 == "K♥"){
                hearts ++;
            }else if (flop2 == "A♣" || flop2 == "10♣" || flop2 == "J♣" || flop2 == "Q♣" || flop2 == "K♣"){
                spades ++;
            }
            //Flop 3
            if (flop3 == "A♠" || flop3 == "10♠" || flop3 == "J♠" || flop3 == "Q♠" || flop3 == "K♠"){
                clubs ++;
            }else if (flop3 == "A♦" || flop3 == "10♦" || flop3 == "J♦" || flop3 == "Q♦" || flop3 == "K♦"){
                diamonds ++;
            }else if (flop3 == "A♥" || flop3 == "10♥" || flop3 == "J♥" || flop3 == "Q♥" || flop3 == "K♥"){
                hearts ++;
            }else if (flop3 == "A♣" || flop3 == "10♣" || flop3 == "J♣" || flop3 == "Q♣" || flop3 == "K♣"){
                spades ++;
            }
            //Turn
            if (turn == "A♠" || turn == "10♠" || turn == "J♠" || turn == "Q♠" || turn == "K♠"){
                clubs ++;
            }else if (turn == "A♦" || turn == "10♦" || turn == "J♦" || turn == "Q♦" || turn == "K♦"){
                diamonds ++;
            }else if (turn == "A♥" || turn == "10♥" || turn == "J♥" || turn == "Q♥" || turn == "K♥"){
                hearts ++;
            }else if (turn == "A♣" || turn == "10♣" || turn == "J♣" || turn == "Q♣" || turn == "K♣"){
                spades ++;
            }
            //River
            if (river == "A♠" || river == "10♠" || river == "J♠" || river == "Q♠" || river == "K♠"){
                clubs ++;
            }else if (river == "A♦" || river == "10♦" || river == "J♦" || river == "Q♦" || river == "K♦"){
                diamonds ++;
            }else if (river == "A♥" || river == "10♥" || river == "J♥" || river == "Q♥" || river == "K♥"){
                hearts ++;
            }else if (river == "A♣" || river == "10♣" || river == "J♣" || river == "Q♣" || river == "K♣"){
                spades ++;
            }

            ////Straight Flush
            //Clubs
            //Clubs to the 5
            if (hand1 == "A♣" || hand1 == "2♣" || hand1 == "3♣" || hand1 == "4♣" || hand1 == "5♣"){
                c5 ++;}
            if (hand2 == "A♣" || hand2 == "2♣" || hand2 == "3♣" || hand2 == "4♣" || hand2 == "5♣"){
                c5 ++;}
            if (flop1 == "A♣" || flop1 == "2♣" || flop1 == "3♣" || flop1 == "4♣" || flop1 == "5♣"){
                c5 ++;}
            if (flop2 == "A♣" || flop2 == "2♣" || flop2 == "3♣" || flop2 == "4♣" || flop2 == "5♣"){
                c5 ++;}
            if (flop3 == "A♣" || flop3 =="2♣" || flop3 == "3♣" || flop3 == "4♣" || flop3 == "5♣"){
                c5 ++;}
            if (turn == "A♣" || turn == "2♣" || turn == "3♣" || turn == "4♣" || turn == "5♣"){
                c5 ++;}
            if (river == "A♣" || river == "2♣" || river == "3♣" || river == "4♣" || river == "5♣"){
                c5 ++;}
            //Clubs to the 6
            if (hand1 == "6♣" || hand1 == "2♣" || hand1 == "3♣" || hand1 == "4♣" || hand1 == "5♣"){
                c6 ++;}
            if (hand2 == "6♣" || hand2 == "2♣" || hand2 == "3♣" || hand2 == "4♣" || hand2 == "5♣"){
                c6 ++;}
            if (flop1 == "6♣" || flop1 == "2♣" || flop1 == "3♣" || flop1 == "4♣" || flop1 == "5♣"){
                c6 ++;}
            if (flop2 == "6♣" || flop2 == "2♣" || flop2 == "3♣" || flop2 == "4♣" || flop2 == "5♣"){
                c6 ++;}
            if (flop3 == "6♣" || flop3 =="2♣" || flop3 == "3♣" || flop3 == "4♣" || flop3 == "5♣"){
                c6 ++;}
            if (turn == "6♣" || turn == "2♣" || turn == "3♣" || turn == "4♣" || turn == "5♣"){
                c6 ++;}
            if (river == "6♣" || river == "2♣" || river == "3♣" || river == "4♣" || river == "5♣"){
                c6 ++;}
            //Clubs to the 7
            if (hand1 == "6♣" || hand1 == "7♣" || hand1 == "3♣" || hand1 == "4♣" || hand1 == "5♣"){
                c7 ++;}
            if (hand2 == "6♣" || hand2 == "7♣" || hand2 == "3♣" || hand2 == "4♣" || hand2 == "5♣"){
                c7 ++;}
            if (flop1 == "6♣" || flop1 == "7♣" || flop1 == "3♣" || flop1 == "4♣" || flop1 == "5♣"){
                c7 ++;}
            if (flop2 == "6♣" || flop2 == "7♣" || flop2 == "3♣" || flop2 == "4♣" || flop2 == "5♣"){
                c7 ++;}
            if (flop3 == "6♣" || flop3 =="7♣" || flop3 == "3♣" || flop3 == "4♣" || flop3 == "5♣"){
                c7 ++;}
            if (turn == "6♣" || turn == "7♣" || turn == "3♣" || turn == "4♣" || turn == "5♣"){
                c7 ++;}
            if (river == "6♣" || river == "7♣" || river == "3♣" || river == "4♣" || river == "5♣"){
                c7 ++;}
            //Clubs to the 8
            if (hand1 == "6♣" || hand1 == "7♣" || hand1 == "8♣" || hand1 == "4♣" || hand1 == "5♣"){
                c8 ++;}
            if (hand2 == "6♣" || hand2 == "7♣" || hand2 == "8♣" || hand2 == "4♣" || hand2 == "5♣"){
                c8 ++;}
            if (flop1 == "6♣" || flop1 == "7♣" || flop1 == "8♣" || flop1 == "4♣" || flop1 == "5♣"){
                c8 ++;}
            if (flop2 == "6♣" || flop2 == "7♣" || flop2 == "8♣" || flop2 == "4♣" || flop2 == "5♣"){
                c8 ++;}
            if (flop3 == "6♣" || flop3 =="7♣" || flop3 == "8♣" || flop3 == "4♣" || flop3 == "5♣"){
                c8 ++;}
            if (turn == "6♣" || turn == "7♣" || turn == "8♣" || turn == "4♣" || turn == "5♣"){
                c8 ++;}
            if (river == "6♣" || river == "7♣" || river == "8♣" || river == "4♣" || river == "5♣"){
                c8 ++;}
            //Clubs to the 9
            if (hand1 == "6♣" || hand1 == "7♣" || hand1 == "8♣" || hand1 == "9♣" || hand1 == "5♣"){
                c9 ++;}
            if (hand2 == "6♣" || hand2 == "7♣" || hand2 == "8♣" || hand2 == "9♣" || hand2 == "5♣"){
                c9 ++;}
            if (flop1 == "6♣" || flop1 == "7♣" || flop1 == "8♣" || flop1 == "9♣" || flop1 == "5♣"){
                c9 ++;}
            if (flop2 == "6♣" || flop2 == "7♣" || flop2 == "8♣" || flop2 == "9♣" || flop2 == "5♣"){
                c9 ++;}
            if (flop3 == "6♣" || flop3 =="7♣" || flop3 == "8♣" || flop3 == "9♣" || flop3 == "5♣"){
                c9 ++;}
            if (turn == "6♣" || turn == "7♣" || turn == "8♣" || turn == "9♣" || turn == "5♣"){
                c9 ++;}
            if (river == "6♣" || river == "7♣" || river == "8♣" || river == "9♣" || river == "5♣"){
                c9 ++;}
            //Clubs to the 10
            if (hand1 == "6♣" || hand1 == "7♣" || hand1 == "8♣" || hand1 == "9♣" || hand1 == "10♣"){
                c10 ++;}
            if (hand2 == "6♣" || hand2 == "7♣" || hand2 == "8♣" || hand2 == "9♣" || hand2 == "10♣"){
                c10 ++;}
            if (flop1 == "6♣" || flop1 == "7♣" || flop1 == "8♣" || flop1 == "9♣" || flop1 == "10♣"){
                c10 ++;}
            if (flop2 == "6♣" || flop2 == "7♣" || flop2 == "8♣" || flop2 == "9♣" || flop2 == "10♣"){
                c10 ++;}
            if (flop3 == "6♣" || flop3 =="7♣" || flop3 == "8♣" || flop3 == "9♣" || flop3 == "10♣"){
                c10 ++;}
            if (turn == "6♣" || turn == "7♣" || turn == "8♣" || turn == "9♣" || turn == "10♣"){
                c10 ++;}
            if (river == "6♣" || river == "7♣" || river == "8♣" || river == "9♣" || river == "10♣"){
                c10 ++;}
            //Clubs to the J
            if (hand1 == "J♣" || hand1 == "7♣" || hand1 == "8♣" || hand1 == "9♣" || hand1 == "10♣"){
                cJ ++;}
            if (hand2 == "J♣" || hand2 == "7♣" || hand2 == "8♣" || hand2 == "9♣" || hand2 == "10♣"){
                cJ ++;}
            if (flop1 == "J♣" || flop1 == "7♣" || flop1 == "8♣" || flop1 == "9♣" || flop1 == "10♣"){
                cJ ++;}
            if (flop2 == "J♣" || flop2 == "7♣" || flop2 == "8♣" || flop2 == "9♣" || flop2 == "10♣"){
                cJ ++;}
            if (flop3 == "J♣" || flop3 =="7♣" || flop3 == "8♣" || flop3 == "9♣" || flop3 == "10♣"){
                cJ ++;}
            if (turn == "J♣" || turn == "7♣" || turn == "8♣" || turn == "9♣" || turn == "10♣"){
                cJ ++;}
            if (river == "J♣" || river == "7♣" || river == "8♣" || river == "9♣" || river == "10♣"){
                cJ ++;}
            //Clubs to the Q
            if (hand1 == "J♣" || hand1 == "Q♣" || hand1 == "8♣" || hand1 == "9♣" || hand1 == "10♣"){
                cQ ++;}
            if (hand2 == "J♣" || hand2 == "Q♣" || hand2 == "8♣" || hand2 == "9♣" || hand2 == "10♣"){
                cQ ++;}
            if (flop1 == "J♣" || flop1 == "Q♣" || flop1 == "8♣" || flop1 == "9♣" || flop1 == "10♣"){
                cQ ++;}
            if (flop2 == "J♣" || flop2 == "Q♣" || flop2 == "8♣" || flop2 == "9♣" || flop2 == "10♣"){
                cQ ++;}
            if (flop3 == "J♣" || flop3 =="Q♣" || flop3 == "8♣" || flop3 == "9♣" || flop3 == "10♣"){
                cQ ++;}
            if (turn == "J♣" || turn == "Q♣" || turn == "8♣" || turn == "9♣" || turn == "10♣"){
                cQ ++;}
            if (river == "J♣" || river == "Q♣" || river == "8♣" || river == "9♣" || river == "10♣"){
                cQ ++;}
            //Clubs to the K
            if (hand1 == "J♣" || hand1 == "Q♣" || hand1 == "K♣" || hand1 == "9♣" || hand1 == "10♣"){
                cK ++;}
            if (hand2 == "J♣" || hand2 == "Q♣" || hand2 == "K♣" || hand2 == "9♣" || hand2 == "10♣"){
                cK ++;}
            if (flop1 == "J♣" || flop1 == "Q♣" || flop1 == "K♣" || flop1 == "9♣" || flop1 == "10♣"){
                cK ++;}
            if (flop2 == "J♣" || flop2 == "Q♣" || flop2 == "K♣" || flop2 == "9♣" || flop2 == "10♣"){
                cK ++;}
            if (flop3 == "J♣" || flop3 =="Q♣" || flop3 == "K♣" || flop3 == "9♣" || flop3 == "10♣"){
                cK ++;}
            if (turn == "J♣" || turn == "Q♣" || turn == "K♣" || turn == "9♣" || turn == "10♣"){
                cK ++;}
            if (river == "J♣" || river == "Q♣" || river == "K♣" || river == "9♣" || river == "10♣"){
                cK ++;}
            //Diamonds
            //Diamonds to the 5
            if (hand1 == "A♦" || hand1 == "2♦" || hand1 == "3♦" || hand1 == "4♦" || hand1 == "5♦"){
                d5 ++;}
            if (hand2 == "A♦" || hand2 == "2♦" || hand2 == "3♦" || hand2 == "4♦" || hand2 == "5♦"){
                d5 ++;}
            if (flop1 == "A♦" || flop1 == "2♦" || flop1 == "3♦" || flop1 == "4♦" || flop1 == "5♦"){
                d5 ++;}
            if (flop2 == "A♦" || flop2 == "2♦" || flop2 == "3♦" || flop2 == "4♦" || flop2 == "5♦"){
                d5 ++;}
            if (flop3 == "A♦" || flop3 =="2♦" || flop3 == "3♦" || flop3 == "4♦" || flop3 == "5♦"){
                d5 ++;}
            if (turn == "A♦" || turn == "2♦" || turn == "3♦" || turn == "4♦" || turn == "5♦"){
                d5 ++;}
            if (river == "A♦" || river == "2♦" || river == "3♦" || river == "4♦" || river == "5♦"){
                d5 ++;}
            //Diamonds to the 6
            if (hand1 == "6♦" || hand1 == "2♦" || hand1 == "3♦" || hand1 == "4♦" || hand1 == "5♦"){
                d6 ++;}
            if (hand2 == "6♦" || hand2 == "2♦" || hand2 == "3♦" || hand2 == "4♦" || hand2 == "5♦"){
                d6 ++;}
            if (flop1 == "6♦" || flop1 == "2♦" || flop1 == "3♦" || flop1 == "4♦" || flop1 == "5♦"){
                d6 ++;}
            if (flop2 == "6♦" || flop2 == "2♦" || flop2 == "3♦" || flop2 == "4♦" || flop2 == "5♦"){
                d6 ++;}
            if (flop3 == "6♦" || flop3 =="2♦" || flop3 == "3♦" || flop3 == "4♦" || flop3 == "5♦"){
                d6 ++;}
            if (turn == "6♦" || turn == "2♦" || turn == "3♦" || turn == "4♦" || turn == "5♦"){
                d6 ++;}
            if (river == "6♦" || river == "2♦" || river == "3♦" || river == "4♦" || river == "5♦"){
                d6 ++;}
            //Diamonds to the 7
            if (hand1 == "6♦" || hand1 == "7♦" || hand1 == "3♦" || hand1 == "4♦" || hand1 == "5♦"){
                d7 ++;}
            if (hand2 == "6♦" || hand2 == "7♦" || hand2 == "3♦" || hand2 == "4♦" || hand2 == "5♦"){
                d7 ++;}
            if (flop1 == "6♦" || flop1 == "7♦" || flop1 == "3♦" || flop1 == "4♦" || flop1 == "5♦"){
                d7 ++;}
            if (flop2 == "6♦" || flop2 == "7♦" || flop2 == "3♦" || flop2 == "4♦" || flop2 == "5♦"){
                d7 ++;}
            if (flop3 == "6♦" || flop3 =="7♦" || flop3 == "3♦" || flop3 == "4♦" || flop3 == "5♦"){
                d7 ++;}
            if (turn == "6♦" || turn == "7♦" || turn == "3♦" || turn == "4♦" || turn == "5♦"){
                d7 ++;}
            if (river == "6♦" || river == "7♦" || river == "3♦" || river == "4♦" || river == "5♦"){
                d7 ++;}
            //Diamonds to the 8
            if (hand1 == "6♦" || hand1 == "7♦" || hand1 == "8♦" || hand1 == "4♦" || hand1 == "5♦"){
                d8 ++;}
            if (hand2 == "6♦" || hand2 == "7♦" || hand2 == "8♦" || hand2 == "4♦" || hand2 == "5♦"){
                d8 ++;}
            if (flop1 == "6♦" || flop1 == "7♦" || flop1 == "8♦" || flop1 == "4♦" || flop1 == "5♦"){
                d8 ++;}
            if (flop2 == "6♦" || flop2 == "7♦" || flop2 == "8♦" || flop2 == "4♦" || flop2 == "5♦"){
                d8 ++;}
            if (flop3 == "6♦" || flop3 =="7♦" || flop3 == "8♦" || flop3 == "4♦" || flop3 == "5♦"){
                d8 ++;}
            if (turn == "6♦" || turn == "7♦" || turn == "8♦" || turn == "4♦" || turn == "5♦"){
                d8 ++;}
            if (river == "6♦" || river == "7♦" || river == "8♦" || river == "4♦" || river == "5♦"){
                d8 ++;}
            //Diamonds to the 9
            if (hand1 == "6♦" || hand1 == "7♦" || hand1 == "8♦" || hand1 == "9♦" || hand1 == "5♦"){
                d9 ++;}
            if (hand2 == "6♦" || hand2 == "7♦" || hand2 == "8♦" || hand2 == "9♦" || hand2 == "5♦"){
                d9 ++;}
            if (flop1 == "6♦" || flop1 == "7♦" || flop1 == "8♦" || flop1 == "9♦" || flop1 == "5♦"){
                d9 ++;}
            if (flop2 == "6♦" || flop2 == "7♦" || flop2 == "8♦" || flop2 == "9♦" || flop2 == "5♦"){
                d9 ++;}
            if (flop3 == "6♦" || flop3 =="7♦" || flop3 == "8♦" || flop3 == "9♦" || flop3 == "5♦"){
                d9 ++;}
            if (turn == "6♦" || turn == "7♦" || turn == "8♦" || turn == "9♦" || turn == "5♦"){
                d9 ++;}
            if (river == "6♦" || river == "7♦" || river == "8♦" || river == "9♦" || river == "5♦"){
                d9 ++;}
            //Diamonds to the 10
            if (hand1 == "6♦" || hand1 == "7♦" || hand1 == "8♦" || hand1 == "9♦" || hand1 == "10♦"){
                d10 ++;}
            if (hand2 == "6♦" || hand2 == "7♦" || hand2 == "8♦" || hand2 == "9♦" || hand2 == "10♦"){
                d10 ++;}
            if (flop1 == "6♦" || flop1 == "7♦" || flop1 == "8♦" || flop1 == "9♦" || flop1 == "10♦"){
                d10 ++;}
            if (flop2 == "6♦" || flop2 == "7♦" || flop2 == "8♦" || flop2 == "9♦" || flop2 == "10♦"){
                d10 ++;}
            if (flop3 == "6♦" || flop3 =="7♦" || flop3 == "8♦" || flop3 == "9♦" || flop3 == "10♦"){
                d10 ++;}
            if (turn == "6♦" || turn == "7♦" || turn == "8♦" || turn == "9♦" || turn == "10♦"){
                d10 ++;}
            if (river == "6♦" || river == "7♦" || river == "8♦" || river == "9♦" || river == "10♦"){
                d10 ++;}
            //Diamonds to the J
            if (hand1 == "J♦" || hand1 == "7♦" || hand1 == "8♦" || hand1 == "9♦" || hand1 == "10♦"){
                dJ ++;}
            if (hand2 == "J♦" || hand2 == "7♦" || hand2 == "8♦" || hand2 == "9♦" || hand2 == "10♦"){
                dJ ++;}
            if (flop1 == "J♦" || flop1 == "7♦" || flop1 == "8♦" || flop1 == "9♦" || flop1 == "10♦"){
                dJ ++;}
            if (flop2 == "J♦" || flop2 == "7♦" || flop2 == "8♦" || flop2 == "9♦" || flop2 == "10♦"){
                dJ ++;}
            if (flop3 == "J♦" || flop3 =="7♦" || flop3 == "8♦" || flop3 == "9♦" || flop3 == "10♦"){
                dJ ++;}
            if (turn == "J♦" || turn == "7♦" || turn == "8♦" || turn == "9♦" || turn == "10♦"){
                dJ ++;}
            if (river == "J♦" || river == "7♦" || river == "8♦" || river == "9♦" || river == "10♦"){
                dJ ++;}
            //Diamonds to the Q
            if (hand1 == "J♦" || hand1 == "Q♦" || hand1 == "8♦" || hand1 == "9♦" || hand1 == "10♦"){
                dQ ++;}
            if (hand2 == "J♦" || hand2 == "Q♦" || hand2 == "8♦" || hand2 == "9♦" || hand2 == "10♦"){
                dQ ++;}
            if (flop1 == "J♦" || flop1 == "Q♦" || flop1 == "8♦" || flop1 == "9♦" || flop1 == "10♦"){
                dQ ++;}
            if (flop2 == "J♦" || flop2 == "Q♦" || flop2 == "8♦" || flop2 == "9♦" || flop2 == "10♦"){
                dQ ++;}
            if (flop3 == "J♦" || flop3 =="Q♦" || flop3 == "8♦" || flop3 == "9♦" || flop3 == "10♦"){
                dQ ++;}
            if (turn == "J♦" || turn == "Q♦" || turn == "8♦" || turn == "9♦" || turn == "10♦"){
                dQ ++;}
            if (river == "J♦" || river == "Q♦" || river == "8♦" || river == "9♦" || river == "10♦"){
                dQ ++;}
            //Diamonds to the K
            if (hand1 == "J♦" || hand1 == "Q♦" || hand1 == "K♦" || hand1 == "9♦" || hand1 == "10♦"){
                dK ++;}
            if (hand2 == "J♦" || hand2 == "Q♦" || hand2 == "K♦" || hand2 == "9♦" || hand2 == "10♦"){
                dK ++;}
            if (flop1 == "J♦" || flop1 == "Q♦" || flop1 == "K♦" || flop1 == "9♦" || flop1 == "10♦"){
                dK ++;}
            if (flop2 == "J♦" || flop2 == "Q♦" || flop2 == "K♦" || flop2 == "9♦" || flop2 == "10♦"){
                dK ++;}
            if (flop3 == "J♦" || flop3 =="Q♦" || flop3 == "K♦" || flop3 == "9♦" || flop3 == "10♦"){
                dK ++;}
            if (turn == "J♦" || turn == "Q♦" || turn == "K♦" || turn == "9♦" || turn == "10♦"){
                dK ++;}
            if (river == "J♦" || river == "Q♦" || river == "K♦" || river == "9♦" || river == "10♦"){
                dK ++;}
            //Hearts
            //Hearts to the 5
            if (hand1 == "A♥" || hand1 == "2♥" || hand1 == "3♥" || hand1 == "4♥" || hand1 == "5♥"){
                h5 ++;}
            if (hand2 == "A♥" || hand2 == "2♥" || hand2 == "3♥" || hand2 == "4♥" || hand2 == "5♥"){
                h5 ++;}
            if (flop1 == "A♥" || flop1 == "2♥" || flop1 == "3♥" || flop1 == "4♥" || flop1 == "5♥"){
                h5 ++;}
            if (flop2 == "A♥" || flop2 == "2♥" || flop2 == "3♥" || flop2 == "4♥" || flop2 == "5♥"){
                h5 ++;}
            if (flop3 == "A♥" || flop3 =="2♥" || flop3 == "3♥" || flop3 == "4♥" || flop3 == "5♥"){
                h5 ++;}
            if (turn == "A♥" || turn == "2♥" || turn == "3♥" || turn == "4♥" || turn == "5♥"){
                h5 ++;}
            if (river == "A♥" || river == "2♥" || river == "3♥" || river == "4♥" || river == "5♥"){
                h5 ++;}
            //Hearts to the 6
            if (hand1 == "6♥" || hand1 == "2♥" || hand1 == "3♥" || hand1 == "4♥" || hand1 == "5♥"){
                h6 ++;}
            if (hand2 == "6♥" || hand2 == "2♥" || hand2 == "3♥" || hand2 == "4♥" || hand2 == "5♥"){
                h6 ++;}
            if (flop1 == "6♥" || flop1 == "2♥" || flop1 == "3♥" || flop1 == "4♥" || flop1 == "5♥"){
                h6 ++;}
            if (flop2 == "6♥" || flop2 == "2♥" || flop2 == "3♥" || flop2 == "4♥" || flop2 == "5♥"){
                h6 ++;}
            if (flop3 == "6♥" || flop3 =="2♥" || flop3 == "3♥" || flop3 == "4♥" || flop3 == "5♥"){
                h6 ++;}
            if (turn == "6♥" || turn == "2♥" || turn == "3♥" || turn == "4♥" || turn == "5♥"){
                h6 ++;}
            if (river == "6♥" || river == "2♥" || river == "3♥" || river == "4♥" || river == "5♥"){
                h6 ++;}
            //Hearts to the 7
            if (hand1 == "6♥" || hand1 == "7♥" || hand1 == "3♥" || hand1 == "4♥" || hand1 == "5♥"){
                h7 ++;}
            if (hand2 == "6♥" || hand2 == "7♥" || hand2 == "3♥" || hand2 == "4♥" || hand2 == "5♥"){
                h7 ++;}
            if (flop1 == "6♥" || flop1 == "7♥" || flop1 == "3♥" || flop1 == "4♥" || flop1 == "5♥"){
                h7 ++;}
            if (flop2 == "6♥" || flop2 == "7♥" || flop2 == "3♥" || flop2 == "4♥" || flop2 == "5♥"){
                h7 ++;}
            if (flop3 == "6♥" || flop3 =="7♥" || flop3 == "3♥" || flop3 == "4♥" || flop3 == "5♥"){
                h7 ++;}
            if (turn == "6♥" || turn == "7♥" || turn == "3♥" || turn == "4♥" || turn == "5♥"){
                h7 ++;}
            if (river == "6♥" || river == "7♥" || river == "3♥" || river == "4♥" || river == "5♥"){
                h7 ++;}
            //Hearts to the 8
            if (hand1 == "6♥" || hand1 == "7♥" || hand1 == "8♥" || hand1 == "4♥" || hand1 == "5♥"){
                h8 ++;}
            if (hand2 == "6♥" || hand2 == "7♥" || hand2 == "8♥" || hand2 == "4♥" || hand2 == "5♥"){
                h8 ++;}
            if (flop1 == "6♥" || flop1 == "7♥" || flop1 == "8♥" || flop1 == "4♥" || flop1 == "5♥"){
                h8 ++;}
            if (flop2 == "6♥" || flop2 == "7♥" || flop2 == "8♥" || flop2 == "4♥" || flop2 == "5♥"){
                h8 ++;}
            if (flop3 == "6♥" || flop3 =="7♥" || flop3 == "8♥" || flop3 == "4♥" || flop3 == "5♥"){
                h8 ++;}
            if (turn == "6♥" || turn == "7♥" || turn == "8♥" || turn == "4♥" || turn == "5♥"){
                h8 ++;}
            if (river == "6♥" || river == "7♥" || river == "8♥" || river == "4♥" || river == "5♥"){
                h8 ++;}
            //Hearts to the 9
            if (hand1 == "6♥" || hand1 == "7♥" || hand1 == "8♥" || hand1 == "9♥" || hand1 == "5♥"){
                h9 ++;}
            if (hand2 == "6♥" || hand2 == "7♥" || hand2 == "8♥" || hand2 == "9♥" || hand2 == "5♥"){
                h9 ++;}
            if (flop1 == "6♥" || flop1 == "7♥" || flop1 == "8♥" || flop1 == "9♥" || flop1 == "5♥"){
                h9 ++;}
            if (flop2 == "6♥" || flop2 == "7♥" || flop2 == "8♥" || flop2 == "9♥" || flop2 == "5♥"){
                h9 ++;}
            if (flop3 == "6♥" || flop3 =="7♥" || flop3 == "8♥" || flop3 == "9♥" || flop3 == "5♥"){
                h9 ++;}
            if (turn == "6♥" || turn == "7♥" || turn == "8♥" || turn == "9♥" || turn == "5♥"){
                h9 ++;}
            if (river == "6♥" || river == "7♥" || river == "8♥" || river == "9♥" || river == "5♥"){
                h9 ++;}
            //Hearts to the 10
            if (hand1 == "6♥" || hand1 == "7♥" || hand1 == "8♥" || hand1 == "9♥" || hand1 == "10♥"){
                h10 ++;}
            if (hand2 == "6♥" || hand2 == "7♥" || hand2 == "8♥" || hand2 == "9♥" || hand2 == "10♥"){
                h10 ++;}
            if (flop1 == "6♥" || flop1 == "7♥" || flop1 == "8♥" || flop1 == "9♥" || flop1 == "10♥"){
                h10 ++;}
            if (flop2 == "6♥" || flop2 == "7♥" || flop2 == "8♥" || flop2 == "9♥" || flop2 == "10♥"){
                h10 ++;}
            if (flop3 == "6♥" || flop3 =="7♥" || flop3 == "8♥" || flop3 == "9♥" || flop3 == "10♥"){
                h10 ++;}
            if (turn == "6♥" || turn == "7♥" || turn == "8♥" || turn == "9♥" || turn == "10♥"){
                h10 ++;}
            if (river == "6♥" || river == "7♥" || river == "8♥" || river == "9♥" || river == "10♥"){
                h10 ++;}
            //Hearts to the J
            if (hand1 == "J♥" || hand1 == "7♥" || hand1 == "8♥" || hand1 == "9♥" || hand1 == "10♥"){
                hJ ++;}
            if (hand2 == "J♥" || hand2 == "7♥" || hand2 == "8♥" || hand2 == "9♥" || hand2 == "10♥"){
                hJ ++;}
            if (flop1 == "J♥" || flop1 == "7♥" || flop1 == "8♥" || flop1 == "9♥" || flop1 == "10♥"){
                hJ ++;}
            if (flop2 == "J♥" || flop2 == "7♥" || flop2 == "8♥" || flop2 == "9♥" || flop2 == "10♥"){
                hJ ++;}
            if (flop3 == "J♥" || flop3 =="7♥" || flop3 == "8♥" || flop3 == "9♥" || flop3 == "10♥"){
                hJ ++;}
            if (turn == "J♥" || turn == "7♥" || turn == "8♥" || turn == "9♥" || turn == "10♥"){
                hJ ++;}
            if (river == "J♥" || river == "7♥" || river == "8♥" || river == "9♥" || river == "10♥"){
                hJ ++;}
            //Hearts to the Q
            if (hand1 == "J♥" || hand1 == "Q♥" || hand1 == "8♥" || hand1 == "9♥" || hand1 == "10♥"){
                hQ ++;}
            if (hand2 == "J♥" || hand2 == "Q♥" || hand2 == "8♥" || hand2 == "9♥" || hand2 == "10♥"){
                hQ ++;}
            if (flop1 == "J♥" || flop1 == "Q♥" || flop1 == "8♥" || flop1 == "9♥" || flop1 == "10♥"){
                hQ ++;}
            if (flop2 == "J♥" || flop2 == "Q♥" || flop2 == "8♥" || flop2 == "9♥" || flop2 == "10♥"){
                hQ ++;}
            if (flop3 == "J♥" || flop3 =="Q♥" || flop3 == "8♥" || flop3 == "9♥" || flop3 == "10♥"){
                hQ ++;}
            if (turn == "J♥" || turn == "Q♥" || turn == "8♥" || turn == "9♥" || turn == "10♥"){
                hQ ++;}
            if (river == "J♥" || river == "Q♥" || river == "8♥" || river == "9♥" || river == "10♥"){
                hQ ++;}
            //Hearts to the K
            if (hand1 == "J♥" || hand1 == "Q♥" || hand1 == "K♥" || hand1 == "9♥" || hand1 == "10♥"){
                hK ++;}
            if (hand2 == "J♥" || hand2 == "Q♥" || hand2 == "K♥" || hand2 == "9♥" || hand2 == "10♥"){
                hK ++;}
            if (flop1 == "J♥" || flop1 == "Q♥" || flop1 == "K♥" || flop1 == "9♥" || flop1 == "10♥"){
                hK ++;}
            if (flop2 == "J♥" || flop2 == "Q♥" || flop2 == "K♥" || flop2 == "9♥" || flop2 == "10♥"){
                hK ++;}
            if (flop3 == "J♥" || flop3 =="Q♥" || flop3 == "K♥" || flop3 == "9♥" || flop3 == "10♥"){
                hK ++;}
            if (turn == "J♥" || turn == "Q♥" || turn == "K♥" || turn == "9♥" || turn == "10♥"){
                hK ++;}
            if (river == "J♥" || river == "Q♥" || river == "K♥" || river == "9♥" || river == "10♥"){
                hK ++;}
            //Spades
            //Spades to the 5
            if (hand1 == "A♠" || hand1 == "2♠" || hand1 == "3♠" || hand1 == "4♠" || hand1 == "5♠"){
                s5 ++;}
            if (hand2 == "A♠" || hand2 == "2♠" || hand2 == "3♠" || hand2 == "4♠" || hand2 == "5♠"){
                s5 ++;}
            if (flop1 == "A♠" || flop1 == "2♠" || flop1 == "3♠" || flop1 == "4♠" || flop1 == "5♠"){
                s5 ++;}
            if (flop2 == "A♠" || flop2 == "2♠" || flop2 == "3♠" || flop2 == "4♠" || flop2 == "5♠"){
                s5 ++;}
            if (flop3 == "A♠" || flop3 =="2♠" || flop3 == "3♠" || flop3 == "4♠" || flop3 == "5♠"){
                s5 ++;}
            if (turn == "A♠" || turn == "2♠" || turn == "3♠" || turn == "4♠" || turn == "5♠"){
                s5 ++;}
            if (river == "A♠" || river == "2♠" || river == "3♠" || river == "4♠" || river == "5♠"){
                s5 ++;}
            //Spades to the 6
            if (hand1 == "6♠" || hand1 == "2♠" || hand1 == "3♠" || hand1 == "4♠" || hand1 == "5♠"){
                s6 ++;}
            if (hand2 == "6♠" || hand2 == "2♠" || hand2 == "3♠" || hand2 == "4♠" || hand2 == "5♠"){
                s6 ++;}
            if (flop1 == "6♠" || flop1 == "2♠" || flop1 == "3♠" || flop1 == "4♠" || flop1 == "5♠"){
                s6 ++;}
            if (flop2 == "6♠" || flop2 == "2♠" || flop2 == "3♠" || flop2 == "4♠" || flop2 == "5♠"){
                s6 ++;}
            if (flop3 == "6♠" || flop3 =="2♠" || flop3 == "3♠" || flop3 == "4♠" || flop3 == "5♠"){
                s6 ++;}
            if (turn == "6♠" || turn == "2♠" || turn == "3♠" || turn == "4♠" || turn == "5♠"){
                s6 ++;}
            if (river == "6♠" || river == "2♠" || river == "3♠" || river == "4♠" || river == "5♠"){
                s6 ++;}
            //Spades to the 7
            if (hand1 == "6♠" || hand1 == "7♠" || hand1 == "3♠" || hand1 == "4♠" || hand1 == "5♠"){
                s7 ++;}
            if (hand2 == "6♠" || hand2 == "7♠" || hand2 == "3♠" || hand2 == "4♠" || hand2 == "5♠"){
                s7 ++;}
            if (flop1 == "6♠" || flop1 == "7♠" || flop1 == "3♠" || flop1 == "4♠" || flop1 == "5♠"){
                s7 ++;}
            if (flop2 == "6♠" || flop2 == "7♠" || flop2 == "3♠" || flop2 == "4♠" || flop2 == "5♠"){
                s7 ++;}
            if (flop3 == "6♠" || flop3 =="7♠" || flop3 == "3♠" || flop3 == "4♠" || flop3 == "5♠"){
                s7 ++;}
            if (turn == "6♠" || turn == "7♠" || turn == "3♠" || turn == "4♠" || turn == "5♠"){
                s7 ++;}
            if (river == "6♠" || river == "7♠" || river == "3♠" || river == "4♠" || river == "5♠"){
                s7 ++;}
            //Spades to the 8
            if (hand1 == "6♠" || hand1 == "7♠" || hand1 == "8♠" || hand1 == "4♠" || hand1 == "5♠"){
                s8 ++;}
            if (hand2 == "6♠" || hand2 == "7♠" || hand2 == "8♠" || hand2 == "4♠" || hand2 == "5♠"){
                s8 ++;}
            if (flop1 == "6♠" || flop1 == "7♠" || flop1 == "8♠" || flop1 == "4♠" || flop1 == "5♠"){
                s8 ++;}
            if (flop2 == "6♠" || flop2 == "7♠" || flop2 == "8♠" || flop2 == "4♠" || flop2 == "5♠"){
                s8 ++;}
            if (flop3 == "6♠" || flop3 =="7♠" || flop3 == "8♠" || flop3 == "4♠" || flop3 == "5♠"){
                s8 ++;}
            if (turn == "6♠" || turn == "7♠" || turn == "8♠" || turn == "4♠" || turn == "5♠"){
                s8 ++;}
            if (river == "6♠" || river == "7♠" || river == "8♠" || river == "4♠" || river == "5♠"){
                s8 ++;}
            //Spades to the 9
            if (hand1 == "6♠" || hand1 == "7♠" || hand1 == "8♠" || hand1 == "9♠" || hand1 == "5♠"){
                s9 ++;}
            if (hand2 == "6♠" || hand2 == "7♠" || hand2 == "8♠" || hand2 == "9♠" || hand2 == "5♠"){
                s9 ++;}
            if (flop1 == "6♠" || flop1 == "7♠" || flop1 == "8♠" || flop1 == "9♠" || flop1 == "5♠"){
                s9 ++;}
            if (flop2 == "6♠" || flop2 == "7♠" || flop2 == "8♠" || flop2 == "9♠" || flop2 == "5♠"){
                s9 ++;}
            if (flop3 == "6♠" || flop3 =="7♠" || flop3 == "8♠" || flop3 == "9♠" || flop3 == "5♠"){
                s9 ++;}
            if (turn == "6♠" || turn == "7♠" || turn == "8♠" || turn == "9♠" || turn == "5♠"){
                s9 ++;}
            if (river == "6♠" || river == "7♠" || river == "8♠" || river == "9♠" || river == "5♠"){
                s9 ++;}
            //Spades to the 10
            if (hand1 == "6♠" || hand1 == "7♠" || hand1 == "8♠" || hand1 == "9♠" || hand1 == "10♠"){
                s10 ++;}
            if (hand2 == "6♠" || hand2 == "7♠" || hand2 == "8♠" || hand2 == "9♠" || hand2 == "10♠"){
                s10 ++;}
            if (flop1 == "6♠" || flop1 == "7♠" || flop1 == "8♠" || flop1 == "9♠" || flop1 == "10♠"){
                s10 ++;}
            if (flop2 == "6♠" || flop2 == "7♠" || flop2 == "8♠" || flop2 == "9♠" || flop2 == "10♠"){
                s10 ++;}
            if (flop3 == "6♠" || flop3 =="7♠" || flop3 == "8♠" || flop3 == "9♠" || flop3 == "10♠"){
                s10 ++;}
            if (turn == "6♠" || turn == "7♠" || turn == "8♠" || turn == "9♠" || turn == "10♠"){
                s10 ++;}
            if (river == "6♠" || river == "7♠" || river == "8♠" || river == "9♠" || river == "10♠"){
                s10 ++;}
            //Spades to the J
            if (hand1 == "J♠" || hand1 == "7♠" || hand1 == "8♠" || hand1 == "9♠" || hand1 == "10♠"){
                sJ ++;}
            if (hand2 == "J♠" || hand2 == "7♠" || hand2 == "8♠" || hand2 == "9♠" || hand2 == "10♠"){
                sJ ++;}
            if (flop1 == "J♠" || flop1 == "7♠" || flop1 == "8♠" || flop1 == "9♠" || flop1 == "10♠"){
                sJ ++;}
            if (flop2 == "J♠" || flop2 == "7♠" || flop2 == "8♠" || flop2 == "9♠" || flop2 == "10♠"){
                sJ ++;}
            if (flop3 == "J♠" || flop3 =="7♠" || flop3 == "8♠" || flop3 == "9♠" || flop3 == "10♠"){
                sJ ++;}
            if (turn == "J♠" || turn == "7♠" || turn == "8♠" || turn == "9♠" || turn == "10♠"){
                sJ ++;}
            if (river == "J♠" || river == "7♠" || river == "8♠" || river == "9♠" || river == "10♠"){
                sJ ++;}
            //Spades to the Q
            if (hand1 == "J♠" || hand1 == "Q♠" || hand1 == "8♠" || hand1 == "9♠" || hand1 == "10♠"){
                sQ ++;}
            if (hand2 == "J♠" || hand2 == "Q♠" || hand2 == "8♠" || hand2 == "9♠" || hand2 == "10♠"){
                sQ ++;}
            if (flop1 == "J♠" || flop1 == "Q♠" || flop1 == "8♠" || flop1 == "9♠" || flop1 == "10♠"){
                sQ ++;}
            if (flop2 == "J♠" || flop2 == "Q♠" || flop2 == "8♠" || flop2 == "9♠" || flop2 == "10♠"){
                sQ ++;}
            if (flop3 == "J♠" || flop3 =="Q♠" || flop3 == "8♠" || flop3 == "9♠" || flop3 == "10♠"){
                sQ ++;}
            if (turn == "J♠" || turn == "Q♠" || turn == "8♠" || turn == "9♠" || turn == "10♠"){
                sQ ++;}
            if (river == "J♠" || river == "Q♠" || river == "8♠" || river == "9♠" || river == "10♠"){
                sQ ++;}
            //Spades to the K
            if (hand1 == "J♠" || hand1 == "Q♠" || hand1 == "K♠" || hand1 == "9♠" || hand1 == "10♠"){
                sK ++;}
            if (hand2 == "J♠" || hand2 == "Q♠" || hand2 == "K♠" || hand2 == "9♠" || hand2 == "10♠"){
                sK ++;}
            if (flop1 == "J♠" || flop1 == "Q♠" || flop1 == "K♠" || flop1 == "9♠" || flop1 == "10♠"){
                sK ++;}
            if (flop2 == "J♠" || flop2 == "Q♠" || flop2 == "K♠" || flop2 == "9♠" || flop2 == "10♠"){
                sK ++;}
            if (flop3 == "J♠" || flop3 =="Q♠" || flop3 == "K♠" || flop3 == "9♠" || flop3 == "10♠"){
                sK ++;}
            if (turn == "J♠" || turn == "Q♠" || turn == "K♠" || turn == "9♠" || turn == "10♠"){
                sK ++;}
            if (river == "J♠" || river == "Q♠" || river == "K♠" || river == "9♠" || river == "10♠"){
                sK ++;}

            ////Flush Counter
            //Hand 1
            if (hand1 == "A♣" || hand1 == "2♣" || hand1 == "3♣" || hand1 == "4♣" || hand1 == "5♣" || hand1 == "6♣" || hand1 == "7♣" || hand1 == "8♣" || hand1 == "9♣" || hand1 == "10♣" || hand1 == "J♣"
            || hand1 == "Q♣" || hand1 == "K♣"){
                flushclubs ++;}
            else if (hand1 == "A♦" || hand1 == "2♦" || hand1 == "3♦" || hand1 == "4♦" || hand1 == "5♦" || hand1 == "6♦" || hand1 == "7♦" || hand1 == "8♦" || hand1 == "9♦" || hand1 == "10♦" || hand1 == "J♦"
            || hand1 == "Q♦" || hand1 == "K♦"){
                flushdiamonds ++;}
            else if (hand1 == "A♥" || hand1 == "2♥" || hand1 == "3♥" || hand1 == "4♥" || hand1 == "5♥" || hand1 == "6♥" || hand1 == "7♥" || hand1 == "8♥" || hand1 == "9♥" || hand1 == "10♥" || hand1 == "J♥"
            || hand1 == "Q♥" || hand1 == "K♥"){
                flushhearts ++;}
            else if (hand1 == "A♠" || hand1 == "2♠" || hand1 == "3♠" || hand1 == "4♠" || hand1 == "5♠" || hand1 == "6♠" || hand1 == "7♠" || hand1 == "8♠" || hand1 == "9♠" || hand1 == "10♠" || hand1 == "J♠"
            || hand1 == "Q♠" || hand1 == "K♠"){
                flushspades ++;}
            //Hand 2
            if (hand2 == "A♣" || hand2 == "2♣" || hand2 == "3♣" || hand2 == "4♣" || hand2 == "5♣" || hand2 == "6♣" || hand2 == "7♣" || hand2 == "8♣" || hand2 == "9♣" || hand2 == "10♣" || hand2 == "J♣"
            || hand2 == "Q♣" || hand2 == "K♣"){
                flushclubs ++;}
            else if (hand2 == "A♦" || hand2 == "2♦" || hand2 == "3♦" || hand2 == "4♦" || hand2 == "5♦" || hand2 == "6♦" || hand2 == "7♦" || hand2 == "8♦" || hand2 == "9♦" || hand2 == "10♦" || hand2 == "J♦"
            || hand2 == "Q♦" || hand2 == "K♦"){
                flushdiamonds ++;}
            else if (hand2 == "A♥" || hand2 == "2♥" || hand2 == "3♥" || hand2 == "4♥" || hand2 == "5♥" || hand2 == "6♥" || hand2 == "7♥" || hand2 == "8♥" || hand2 == "9♥" || hand2 == "10♥" || hand2 == "J♥"
            || hand2 == "Q♥" || hand2 == "K♥"){
                flushhearts ++;}
            else if (hand2 == "A♠" || hand2 == "2♠" || hand2 == "3♠" || hand2 == "4♠" || hand2 == "5♠" || hand2 == "6♠" || hand2 == "7♠" || hand2 == "8♠" || hand2 == "9♠" || hand2 == "10♠" || hand2 == "J♠"
            || hand2 == "Q♠" || hand2 == "K♠"){
                flushspades ++;}
            //Flop 1
            if (flop1 == "A♣" || flop1 == "2♣" || flop1 == "3♣" || flop1 == "4♣" || flop1 == "5♣" || flop1 == "6♣" || flop1 == "7♣" || flop1 == "8♣" || flop1 == "9♣" || flop1 == "10♣" || flop1 == "J♣"
            || flop1 == "Q♣" || flop1 == "K♣"){
                flushclubs ++;}
            else if (flop1 == "A♦" || flop1 == "2♦" || flop1 == "3♦" || flop1 == "4♦" || flop1 == "5♦" || flop1 == "6♦" || flop1 == "7♦" || flop1 == "8♦" || flop1 == "9♦" || flop1 == "10♦" || flop1 == "J♦"
            || flop1 == "Q♦" || flop1 == "K♦"){
                flushdiamonds ++;}
            else if (flop1 == "A♥" || flop1 == "2♥" || flop1 == "3♥" || flop1 == "4♥" || flop1 == "5♥" || flop1 == "6♥" || flop1 == "7♥" || flop1 == "8♥" || flop1 == "9♥" || flop1 == "10♥" || flop1 == "J♥"
            || flop1 == "Q♥" || flop1 == "K♥"){
                flushhearts ++;}
            else if (flop1 == "A♠" || flop1 == "2♠" || flop1 == "3♠" || flop1 == "4♠" || flop1 == "5♠" || flop1 == "6♠" || flop1 == "7♠" || flop1 == "8♠" || flop1 == "9♠" || flop1 == "10♠" || flop1 == "J♠"
            || flop1 == "Q♠" || flop1 == "K♠"){
                flushspades ++;}
            //Flop2
            if (flop2 == "A♣" || flop2 == "2♣" || flop2 == "3♣" || flop2 == "4♣" || flop2 == "5♣" || flop2 == "6♣" || flop2 == "7♣" || flop2 == "8♣" || flop2 == "9♣" || flop2 == "10♣" || flop2 == "J♣"
            || flop2 == "Q♣" || flop2 == "K♣"){
                flushclubs ++;}
            else if (flop2 == "A♦" || flop2 == "2♦" || flop2 == "3♦" || flop2 == "4♦" || flop2 == "5♦" || flop2 == "6♦" || flop2 == "7♦" || flop2 == "8♦" || flop2 == "9♦" || flop2 == "10♦" || flop2 == "J♦"
            || flop2 == "Q♦" || flop2 == "K♦"){
                flushdiamonds ++;}
            else if (flop2 == "A♥" || flop2 == "2♥" || flop2 == "3♥" || flop2 == "4♥" || flop2 == "5♥" || flop2 == "6♥" || flop2 == "7♥" || flop2 == "8♥" || flop2 == "9♥" || flop2 == "10♥" || flop2 == "J♥"
            || flop2 == "Q♥" || flop2 == "K♥"){
                flushhearts ++;}
            else if (flop2 == "A♠" || flop2 == "2♠" || flop2 == "3♠" || flop2 == "4♠" || flop2 == "5♠" || flop2 == "6♠" || flop2 == "7♠" || flop2 == "8♠" || flop2 == "9♠" || flop2 == "10♠" || flop2 == "J♠"
            || flop2 == "Q♠" || flop2 == "K♠"){
                flushspades ++;}
            //Flop 3
            if (flop3 == "A♣" || flop3 == "2♣" || flop3 == "3♣" || flop3 == "4♣" || flop3 == "5♣" || flop3 == "6♣" || flop3 == "7♣" || flop3 == "8♣" || flop3 == "9♣" || flop3 == "10♣" || flop3 == "J♣"
            || flop3 == "Q♣" || flop3 == "K♣"){
                flushclubs ++;}
            else if (flop3 == "A♦" || flop3 == "2♦" || flop3 == "3♦" || flop3 == "4♦" || flop3 == "5♦" || flop3 == "6♦" || flop3 == "7♦" || flop3 == "8♦" || flop3 == "9♦" || flop3 == "10♦" || flop3 == "J♦"
            || flop3 == "Q♦" || flop3 == "K♦"){
                flushdiamonds ++;}
            else if (flop3 == "A♥" || flop3 == "2♥" || flop3 == "3♥" || flop3 == "4♥" || flop3 == "5♥" || flop3 == "6♥" || flop3 == "7♥" || flop3 == "8♥" || flop3 == "9♥" || flop3 == "10♥" || flop3 == "J♥"
            || flop3 == "Q♥" || flop3 == "K♥"){
                flushhearts ++;}
            else if (flop3 == "A♠" || flop3 == "2♠" || flop3 == "3♠" || flop3 == "4♠" || flop3 == "5♠" || flop3 == "6♠" || flop3 == "7♠" || flop3 == "8♠" || flop3 == "9♠" || flop3 == "10♠" || flop3 == "J♠"
            || flop3 == "Q♠" || flop3 == "K♠"){
                flushspades ++;}
            //Turn
            if (turn == "A♣" || turn == "2♣" || turn == "3♣" || turn == "4♣" || turn == "5♣" || turn == "6♣" || turn == "7♣" || turn == "8♣" || turn == "9♣" || turn == "10♣" || turn == "J♣"
            || turn == "Q♣" || turn == "K♣"){
                flushclubs ++;}
            else if (turn == "A♦" || turn == "2♦" || turn == "3♦" || turn == "4♦" || turn == "5♦" || turn == "6♦" || turn == "7♦" || turn == "8♦" || turn == "9♦" || turn == "10♦" || turn == "J♦"
            || turn == "Q♦" || turn == "K♦"){
                flushdiamonds ++;}
            else if (turn == "A♥" || turn == "2♥" || turn == "3♥" || turn == "4♥" || turn == "5♥" || turn == "6♥" || turn == "7♥" || turn == "8♥" || turn == "9♥" || turn == "10♥" || turn == "J♥"
            || turn == "Q♥" || turn == "K♥"){
                flushhearts ++;}
            else if (turn == "A♠" || turn == "2♠" || turn == "3♠" || turn == "4♠" || turn == "5♠" || turn == "6♠" || turn == "7♠" || turn == "8♠" || turn == "9♠" || turn == "10♠" || turn == "J♠"
            || turn == "Q♠" || turn == "K♠"){
                flushspades ++;}
            //River
            if (river == "A♣" || river == "2♣" || river == "3♣" || river == "4♣" || river == "5♣" || river == "6♣" || river == "7♣" || river == "8♣" || river == "9♣" || river == "10♣" || river == "J♣"
            || river == "Q♣" || river == "K♣"){
                flushclubs ++;}
            else if (river == "A♦" || river == "2♦" || river == "3♦" || river == "4♦" || river == "5♦" || river == "6♦" || river == "7♦" || river == "8♦" || river == "9♦" || river == "10♦" || river == "J♦"
            || river == "Q♦" || river == "K♦"){
                flushdiamonds ++;}
            else if (river == "A♥" || river == "2♥" || river == "3♥" || river == "4♥" || river == "5♥" || river == "6♥" || river == "7♥" || river == "8♥" || river == "9♥" || river == "10♥" || river == "J♥"
            || river == "Q♥" || river == "K♥"){
                flushhearts ++;}
            else if (river == "A♠" || river == "2♠" || river == "3♠" || river == "4♠" || river == "5♠" || river == "6♠" || river == "7♠" || river == "8♠" || river == "9♠" || river == "10♠" || river == "J♠"
            || river == "Q♠" || river == "K♠"){
                flushspades ++;}

            ////Four of a Kind + Full House + Straight + Three Of a Kind + Two Pair + Pocket Aces + Pair + High Card Counter
            //Aces
            if (hand1 == "A♣" || hand1 == "A♦" || hand1 == "A♥" || hand1 == "A♠"){
                ace_count ++;
                bullets ++;}
            if (hand2 == "A♣" || hand2 == "A♦" || hand2 == "A♥" || hand2 == "A♠"){
                ace_count ++;
                bullets ++;}
            if (flop1 == "A♣" || flop1 == "A♦" || flop1 == "A♥" || flop1 == "A♠"){
                ace_count ++;}
            if (flop2 == "A♣" || flop2 == "A♦" || flop2 == "A♥" || flop2 == "A♠"){
                ace_count ++;}
            if (flop3 == "A♣" || flop3 == "A♦" || flop3 == "A♥" || flop3 == "A♠"){
                ace_count ++;}
            if (turn == "A♣" || turn == "A♦" || turn == "A♥" || turn == "A♠"){
                ace_count ++;}
            if (river == "A♣" || river == "A♦" || river == "A♥" || river == "A♠"){
                ace_count ++;}
            //Twos
            if (hand1 == "2♣" || hand1 == "2♦" || hand1 == "2♥" || hand1 == "2♠"){
                two_count ++;}
            if (hand2 == "2♣" || hand2 == "2♦" || hand2 == "2♥" || hand2 == "2♠"){
                two_count ++;}
            if (flop1 == "2♣" || flop1 == "2♦" || flop1 == "2♥" || flop1 == "2♠"){
                two_count ++;}
            if (flop2 == "2♣" || flop2 == "2♦" || flop2 == "2♥" || flop2 == "2♠"){
                two_count ++;}
            if (flop3 == "2♣" || flop3 == "2♦" || flop3 == "2♥" || flop3 == "2♠"){
                two_count ++;}
            if (turn == "2♣" || turn == "2♦" || turn == "2♥" || turn == "2♠"){
                two_count ++;}
            if (river == "2♣" || river == "2♦" || river == "2♥" || river == "2♠"){
                two_count ++;}
            //Threes
            if (hand1 == "3♣" || hand1 == "3♦" || hand1 == "3♥" || hand1 == "3♠"){
                three_count ++;}
            if (hand2 == "3♣" || hand2 == "3♦" || hand2 == "3♥" || hand2 == "3♠"){
                three_count ++;}
            if (flop1 == "3♣" || flop1 == "3♦" || flop1 == "3♥" || flop1 == "3♠"){
                three_count ++;}
            if (flop2 == "3♣" || flop2 == "3♦" || flop2 == "3♥" || flop2 == "3♠"){
                three_count ++;}
            if (flop3 == "3♣" || flop3 == "3♦" || flop3 == "3♥" || flop3 == "3♠"){
                three_count ++;}
            if (turn == "3♣" || turn == "3♦" || turn == "3♥" || turn == "3♠"){
                three_count ++;}
            if (river == "3♣" || river == "3♦" || river == "3♥" || river == "3♠"){
                three_count ++;}
            //Fours
            if (hand1 == "4♣" || hand1 == "4♦" || hand1 == "4♥" || hand1 == "4♠"){
                four_count ++;}
            if (hand2 == "4♣" || hand2 == "4♦" || hand2 == "4♥" || hand2 == "4♠"){
                four_count ++;}
            if (flop1 == "4♣" || flop1 == "4♦" || flop1 == "4♥" || flop1 == "4♠"){
                four_count ++;}
            if (flop2 == "4♣" || flop2 == "4♦" || flop2 == "4♥" || flop2 == "4♠"){
                four_count ++;}
            if (flop3 == "4♣" || flop3 == "4♦" || flop3 == "4♥" || flop3 == "4♠"){
                four_count ++;}
            if (turn == "4♣" || turn == "4♦" || turn == "4♥" || turn == "4♠"){
                four_count ++;}
            if (river == "4♣" || river == "4♦" || river == "4♥" || river == "4♠"){
                four_count ++;}
            //Fives
            if (hand1 == "5♣" || hand1 == "5♦" || hand1 == "5♥" || hand1 == "5♠"){
                five_count ++;}
            if (hand2 == "5♣" || hand2 == "5♦" || hand2 == "5♥" || hand2 == "5♠"){
                five_count ++;}
            if (flop1 == "5♣" || flop1 == "5♦" || flop1 == "5♥" || flop1 == "5♠"){
                five_count ++;}
            if (flop2 == "5♣" || flop2 == "5♦" || flop2 == "5♥" || flop2 == "5♠"){
                five_count ++;}
            if (flop3 == "5♣" || flop3 == "5♦" || flop3 == "5♥" || flop3 == "5♠"){
                five_count ++;}
            if (turn == "5♣" || turn == "5♦" || turn == "5♥" || turn == "5♠"){
                five_count ++;}
            if (river == "5♣" || river == "5♦" || river == "5♥" || river == "5♠"){
                five_count ++;}
            //Sixe(r)s
            if (hand1 == "6♣" || hand1 == "6♦" || hand1 == "6♥" || hand1 == "6♠"){
                six_count ++;}
            if (hand2 == "6♣" || hand2 == "6♦" || hand2 == "6♥" || hand2 == "6♠"){
                six_count ++;}
            if (flop1 == "6♣" || flop1 == "6♦" || flop1 == "6♥" || flop1 == "6♠"){
                six_count ++;}
            if (flop2 == "6♣" || flop2 == "6♦" || flop2 == "6♥" || flop2 == "6♠"){
                six_count ++;}
            if (flop3 == "6♣" || flop3 == "6♦" || flop3 == "6♥" || flop3 == "6♠"){
                six_count ++;}
            if (turn == "6♣" || turn == "6♦" || turn == "6♥" || turn == "6♠"){
                six_count ++;}
            if (river == "6♣" || river == "6♦" || river == "6♥" || river == "6♠"){
                six_count ++;}
            //Sevens
            if (hand1 == "7♣" || hand1 == "7♦" || hand1 == "7♥" || hand1 == "7♠"){
                seven_count ++;}
            if (hand2 == "7♣" || hand2 == "7♦" || hand2 == "7♥" || hand2 == "7♠"){
                seven_count ++;}
            if (flop1 == "7♣" || flop1 == "7♦" || flop1 == "7♥" || flop1 == "7♠"){
                seven_count ++;}
            if (flop2 == "7♣" || flop2 == "7♦" || flop2 == "7♥" || flop2 == "7♠"){
                seven_count ++;}
            if (flop3 == "7♣" || flop3 == "7♦" || flop3 == "7♥" || flop3 == "7♠"){
                seven_count ++;}
            if (turn == "7♣" || turn == "7♦" || turn == "7♥" || turn == "7♠"){
                seven_count ++;}
            if (river == "7♣" || river == "7♦" || river == "7♥" || river == "7♠"){
                seven_count ++;}
            //Eights
            if (hand1 == "8♣" || hand1 == "8♦" || hand1 == "8♥" || hand1 == "8♠"){
                eight_count ++;}
            if (hand2 == "8♣" || hand2 == "8♦" || hand2 == "8♥" || hand2 == "8♠"){
                eight_count ++;}
            if (flop1 == "8♣" || flop1 == "8♦" || flop1 == "8♥" || flop1 == "8♠"){
                eight_count ++;}
            if (flop2 == "8♣" || flop2 == "8♦" || flop2 == "8♥" || flop2 == "8♠"){
                eight_count ++;}
            if (flop3 == "8♣" || flop3 == "8♦" || flop3 == "8♥" || flop3 == "8♠"){
                eight_count ++;}
            if (turn == "8♣" || turn == "8♦" || turn == "8♥" || turn == "8♠"){
                eight_count ++;}
            if (river == "8♣" || river == "8♦" || river == "8♥" || river == "8♠"){
                eight_count ++;}
            //Nines
            if (hand1 == "9♣" || hand1 == "9♦" || hand1 == "9♥" || hand1 == "9♠"){
                nine_count ++;}
            if (hand2 == "9♣" || hand2 == "9♦" || hand2 == "9♥" || hand2 == "9♠"){
                nine_count ++;}
            if (flop1 == "9♣" || flop1 == "9♦" || flop1 == "9♥" || flop1 == "9♠"){
                nine_count ++;}
            if (flop2 == "9♣" || flop2 == "9♦" || flop2 == "9♥" || flop2 == "9♠"){
                nine_count ++;}
            if (flop3 == "9♣" || flop3 == "9♦" || flop3 == "9♥" || flop3 == "9♠"){
                nine_count ++;}
            if (turn == "9♣" || turn == "9♦" || turn == "9♥" || turn == "9♠"){
                nine_count ++;}
            if (river == "9♣" || river == "9♦" || river == "9♥" || river == "9♠"){
                nine_count ++;}
            //Tens
            if (hand1 == "10♣" || hand1 == "10♦" || hand1 == "10♥" || hand1 == "10♠"){
                ten_count ++;}
            if (hand2 == "10♣" || hand2 == "10♦" || hand2 == "10♥" || hand2 == "10♠"){
                ten_count ++;}
            if (flop1 == "10♣" || flop1 == "10♦" || flop1 == "10♥" || flop1 == "10♠"){
                ten_count ++;}
            if (flop2 == "10♣" || flop2 == "10♦" || flop2 == "10♥" || flop2 == "10♠"){
                ten_count ++;}
            if (flop3 == "10♣" || flop3 == "10♦" || flop3 == "10♥" || flop3 == "10♠"){
                ten_count ++;}
            if (turn == "10♣" || turn == "10♦" || turn == "10♥" || turn == "10♠"){
                ten_count ++;}
            if (river == "10♣" || river == "10♦" || river == "10♥" || river == "10♠"){
                ten_count ++;}
            //Jacks
            if (hand1 == "J♣" || hand1 == "J♦" || hand1 == "J♥" || hand1 == "J♠"){
                jack_count ++;}
            if (hand2 == "J♣" || hand2 == "J♦" || hand2 == "J♥" || hand2 == "J♠"){
                jack_count ++;}
            if (flop1 == "J♣" || flop1 == "J♦" || flop1 == "J♥" || flop1 == "J♠"){
                jack_count ++;}
            if (flop2 == "J♣" || flop2 == "J♦" || flop2 == "J♥" || flop2 == "J♠"){
                jack_count ++;}
            if (flop3 == "J♣" || flop3 == "J♦" || flop3 == "J♥" || flop3 == "J♠"){
                jack_count ++;}
            if (turn == "J♣" || turn == "J♦" || turn == "J♥" || turn == "J♠"){
                jack_count ++;}
            if (river == "J♣" || river == "J♦" || river == "J♥" || river == "J♠"){
                jack_count ++;}
            //Queens
            if (hand1 == "Q♣" || hand1 == "Q♦" || hand1 == "Q♥" || hand1 == "Q♠"){
                queen_count ++;}
            if (hand2 == "Q♣" || hand2 == "Q♦" || hand2 == "Q♥" || hand2 == "Q♠"){
                queen_count ++;}
            if (flop1 == "Q♣" || flop1 == "Q♦" || flop1 == "Q♥" || flop1 == "Q♠"){
                queen_count ++;}
            if (flop2 == "Q♣" || flop2 == "Q♦" || flop2 == "Q♥" || flop2 == "Q♠"){
                queen_count ++;}
            if (flop3 == "Q♣" || flop3 == "Q♦" || flop3 == "Q♥" || flop3 == "Q♠"){
                queen_count ++;}
            if (turn == "Q♣" || turn == "Q♦" || turn == "Q♥" || turn == "Q♠"){
                queen_count ++;}
            if (river == "Q♣" || river == "Q♦" || river == "Q♥" || river == "Q♠"){
                queen_count ++;}
            //Kings
            if (hand1 == "K♣" || hand1 == "K♦" || hand1 == "K♥" || hand1 == "K♠"){
                king_count ++;}
            if (hand2 == "K♣" || hand2 == "K♦" || hand2 == "K♥" || hand2 == "K♠"){
                king_count ++;}
            if (flop1 == "K♣" || flop1 == "K♦" || flop1 == "K♥" || flop1 == "K♠"){
                king_count ++;}
            if (flop2 == "K♣" || flop2 == "K♦" || flop2 == "K♥" || flop2 == "K♠"){
                king_count ++;}
            if (flop3 == "K♣" || flop3 == "K♦" || flop3 == "K♥" || flop3 == "K♠"){
                king_count ++;}
            if (turn == "K♣" || turn == "K♦" || turn == "K♥" || turn == "K♠"){
                king_count ++;}
            if (river == "K♣" || river == "K♦" || river == "K♥" || river == "K♠"){
                king_count ++;}
            ////Full House + Three Of a Kind + Two Pair + Two Of a Kind
            if (ace_count == 3){
                three_of_a_kind_count ++;}
            if (two_count == 3){
                three_of_a_kind_count ++;}
            if (three_count == 3){
                three_of_a_kind_count ++;}
            if (four_count == 3){
                three_of_a_kind_count ++;}
            if (five_count == 3){
                three_of_a_kind_count ++;}
            if (six_count == 3){
                three_of_a_kind_count ++;}
            if (seven_count == 3){
                three_of_a_kind_count ++;}
            if (eight_count == 3){
                three_of_a_kind_count ++;}
            if (nine_count == 3){
                three_of_a_kind_count ++;}
            if (ten_count == 3){
                three_of_a_kind_count ++;}
            if (jack_count == 3){
                three_of_a_kind_count ++;}
            if (queen_count == 3){
                three_of_a_kind_count ++;}
            if (king_count == 3){
                three_of_a_kind_count ++;}
            if (ace_count == 2){
                two_of_a_kind_count ++;}
            if (two_count == 2){
                two_of_a_kind_count ++;}
            if (three_count == 2){
                two_of_a_kind_count ++;}
            if (four_count == 2){
                two_of_a_kind_count ++;}
            if (five_count == 2){
                two_of_a_kind_count ++;}
            if (six_count == 2){
                two_of_a_kind_count ++;}
            if (seven_count == 2){
                two_of_a_kind_count ++;}
            if (eight_count == 2){
                two_of_a_kind_count ++;}
            if (nine_count == 2){
                two_of_a_kind_count ++;}
            if (ten_count == 2){
                two_of_a_kind_count ++;}
            if (jack_count == 2){
                two_of_a_kind_count ++;}
            if (queen_count == 2){
                two_of_a_kind_count ++;}
            if (king_count == 2){
                two_of_a_kind_count ++;}

            ////Hand Counters
            //Royal Flush
            if (clubs == 5 || diamonds == 5 || hearts == 5 || spades == 5){
                royalcount++;
                royalflush++;
                hand = "Royal Flush";
                /*System.out.println(hand);
                System.out.println(hand1);
                System.out.println(hand2);
                System.out.println(flop1);
                System.out.println(flop2);
                System.out.println(flop3);
                System.out.println(turn);
                System.out.println(river);
                System.out.println(count + "\n");*/
                }
            //Straight Flush
            if ((c5 >= 5 || c6 >= 5 || c7 >= 5 || c8 >= 5 || c9 >= 5 || c10 >= 5 || cJ >= 5 || cQ >= 5 || cK >= 5
                || d5 >= 5 || d6 >= 5 || d7 >= 5 || d8 >= 5 || d9 >= 5 || d10 >= 5 || dJ >= 5 || dQ >= 5 || dK >= 5
                || h5 >= 5 || h6 >= 5 || h7 >= 5 || h8 >= 5 || h9 >= 5 || h10 >= 5 || hJ >= 5 || hQ >= 5 || hK >= 5
                || s5 >= 5 || s6 >= 5 || s7 >= 5 || s8 >= 5 || s9 >= 5 || s10 >= 5 || sJ >= 5 || sQ >= 5 || sK >= 5)
                && (royalflush == 0)){
                straight_flush_count ++;
                straightflush ++;
                hand = "Straight Flush";
                /*System.out.println (hand)
                System.out.println (hand1)
                System.out.println (hand2)
                System.out.println (flop1)
                System.out.println (flop2)
                System.out.println (flop3)
                System.out.println (turn)
                System.out.println (river)
                System.out.println ("") */
                }

            //Flush
            if (flushclubs >= 5 && (royalflush == 0) && (straightflush == 0)){
                flushcount ++;
                hand = "Flush";}
            if (flushdiamonds >= 5 && (royalflush == 0) && (straightflush == 0)){
                flushcount ++;
                hand = "Flush";}
            if (flushhearts >= 5 && (royalflush == 0) && (straightflush == 0)){
                flushcount ++;
                hand = "Flush";}
            if (flushspades >= 5 && (royalflush == 0) && (straightflush == 0)){
                flushcount ++;
                hand = "Flush";}

            //Straight
                //To the 5
            if ((ace_count >= 1 && two_count >= 1 && three_count >= 1 && four_count >= 1 && five_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && (straightflush == 0)){
                tothe5 ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the 6
            } else if ((six_count >= 1 && two_count >= 1 && three_count >= 1 && four_count >= 1 && five_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                tothe6 ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the 7
            } else if ((six_count >= 1 && seven_count >= 1 && three_count >= 1 && four_count >= 1 && five_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                tothe7 ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the 8
            } else if ((six_count >= 1 && seven_count >= 1 && eight_count >= 1 && four_count >= 1 && five_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                tothe8 ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the 9
            } else if ((six_count >= 1 && seven_count >= 1 && eight_count >= 1 && nine_count >= 1 && five_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                tothe9 ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the 10
            } else if ((six_count >= 1 && seven_count >= 1 && eight_count >= 1 && nine_count >= 1 && ten_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                tothe10 ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the J
            } else if ((jack_count >= 1 && seven_count >= 1 && eight_count >= 1 && nine_count >= 1 && ten_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                totheJ ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the Q
            } else if ((jack_count >= 1 && queen_count >= 1 && eight_count >= 1 && nine_count >= 1 && ten_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                totheQ ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the K
            } else if ((jack_count >= 1 && queen_count >= 1 && king_count >= 1 && nine_count >= 1 && ten_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                totheK ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
                //To the A
            } else if ((jack_count >= 1 && queen_count >= 1 && king_count >= 1 && ace_count >= 1 && ten_count >= 1)
                && (royalflush == 0) && (flushclubs < 5 && flushspades < 5
                && flushhearts < 5 && flushdiamonds < 5) && straightflush == 0){
                totheA ++;
                straightcount ++;
                straight ++;
                hand = "Straight";
            }

            //Four of a Kind
            if ((ace_count == 4 || two_count >= 4 || three_count == 4 || four_count == 4 || five_count == 4 || six_count == 4 || seven_count == 4
                || eight_count == 4 || nine_count == 4 || ten_count == 4 || jack_count == 4 || queen_count == 4 || king_count == 4)){
                four_of_a_kind_count ++;
                quad_count ++;
                hand = "Four of a Kind";
                    /*System.out.println (hand1);
                    System.out.println (hand2+"\n");
                    System.out.println (flop1);
                    System.out.println (flop2);
                    System.out.println (flop3);
                    System.out.println (turn);
                    System.out.println (river+"\n");
                    System.out.println ("");*/
                }
                

            //Full House
            if ((three_of_a_kind_count == 2) || (three_of_a_kind_count == 1 && two_of_a_kind_count >= 1) && (four_of_a_kind_count == 0)){
                    full_house_count ++;
                    hand = "Full House";
                    /*System.out.println (hand1)
                    System.out.println (hand2)
                    System.out.println (flop1)
                    System.out.println (flop2)
                    System.out.println (flop3)
                    System.out.println (turn)
                    System.out.println (river)
                    System.out.println (count)
                    System.out.println ("")*/}

            //Three Of a Kind
            if ((three_of_a_kind_count == 1 && two_of_a_kind_count == 0 && straight == 0 && flushclubs < 5 && flushdiamonds < 5 &&
                flushhearts < 5 && flushspades < 5) && (four_of_a_kind_count == 0)){
                trips_count ++;
                hand = "Three of a Kind";
                /*System.out.println (hand1)
                System.out.println (hand2)
                System.out.println (flop1)
                System.out.println (flop2)
                System.out.println (flop3)
                System.out.println (turn)
                System.out.println (river)
                System.out.println (count)
                System.out.println ("")*/}

            //Two Pair
            if ((two_of_a_kind_count >= 2 && three_of_a_kind_count == 0 && straight == 0 && flushclubs < 5 && flushdiamonds < 5 &&
                flushhearts < 5 && flushspades < 5) && (four_of_a_kind_count == 0)){
                two_pair_count ++;
                hand = "Two Pair";}

            //Pocket Aces
            if (bullets == 2){
                pocket_aces_count ++;
                pocketaces ++;
                /*System.out.println (hand)
                System.out.println (hand1)
                System.out.println (hand2)
                System.out.println (flop1)
                System.out.println (flop2)
                System.out.println (flop3)
                System.out.println (turn)
                System.out.println (river)
                System.out.println ("")'''*/}

            //One Pair
            if ((two_of_a_kind_count == 1 && three_of_a_kind_count == 0 && straight == 0 && flushclubs < 5 && flushdiamonds < 5 &&
                flushhearts < 5 && flushspades < 5) && (four_of_a_kind_count == 0)){
                pair_count ++;
                hand = "One Pair";}

            //High Card
            if ((two_of_a_kind_count == 0 && three_of_a_kind_count == 0 && straight == 0 && flushclubs < 5 && flushdiamonds < 5 &&
                flushhearts < 5 && flushspades < 5) && (four_of_a_kind_count == 0)){
                high_card_count ++;
                hand = "High Card";}

            //2-7 Offsuit
            if ((hand1 == "2♠") && (hand2 == "7♥" || hand2 == "7♦" || hand2 == "7♣") ||
                ((hand1 == "2♣") && (hand2 == "7♥" || hand2 == "7♦" || hand2 == "7♠")) ||
                ((hand1 == "2♦") && (hand2 == "7♥" || hand2 == "7♣" || hand2 == "7♠")) ||
                ((hand1 == "2♥") && (hand2 == "7♣" || hand2 == "7♦" || hand2 == "7♠")) ||
                ((hand1 == "7♠") && (hand2 == "2♥" || hand2 == "2♦" || hand2 == "2♣")) ||
                ((hand1 == "7♣") && (hand2 == "2♥" || hand2 == "2♦" || hand2 == "2♠")) ||
                ((hand1 == "7♦") && (hand2 == "2♥" || hand2 == "2♣" || hand2 == "2♠")) ||
                ((hand1 == "7♥") && (hand2 == "2♣" || hand2 == "2♦" || hand2 == "2♠"))){
                    two_seven_offs_count ++;}

            ////Resets counters after each trial
            //Royal Flush
            clubs = 0;
            diamonds = 0;
            hearts = 0;
            spades = 0;
            royalflush = 0;
            //Straight Flush
            c5 = 0;
            c6 = 0;
            c7 = 0;
            c8 = 0;
            c9 = 0;
            c10 = 0;
            cJ = 0;
            cQ = 0;
            cK = 0;
            d5 = 0;
            d6 = 0;
            d7 = 0;
            d8 = 0;
            d9 = 0;
            d10 = 0;
            dJ = 0;
            dQ = 0;
            dK = 0;
            h5 = 0;
            h6 = 0;
            h7 = 0;
            h8 = 0;
            h9 = 0;
            h10 = 0;
            hJ = 0;
            hQ = 0;
            hK = 0;
            s5 = 0;
            s6 = 0;
            s7 = 0;
            s8 = 0;
            s9 = 0;
            s10 = 0;
            sJ = 0;
            sQ = 0;
            sK = 0;
            straightflush = 0;
            //Flush
            flushclubs = 0;
            flushdiamonds = 0;
            flushhearts = 0;
            flushspades = 0;
            //Straight
            tothe5 = 0;
            tothe6 = 0;
            tothe7 = 0;
            tothe8 = 0;
            tothe9 = 0;
            tothe10 = 0;
            totheJ = 0;
            totheQ = 0;
            totheK = 0;
            totheA = 0;
            straight = 0;
            //4 Of a Kind + Full House + Straight + Three Of a Kind + Pocket Aces + Pair
            two_count = 0;
            three_count = 0;
            four_count = 0;
            five_count = 0;
            six_count = 0;
            seven_count = 0;
            eight_count = 0;
            nine_count = 0;
            ten_count = 0;
            jack_count = 0;
            queen_count = 0;
            king_count = 0;
            ace_count = 0;
            four_of_a_kind_count = 0;
            three_of_a_kind_count = 0;
            two_of_a_kind_count = 0;
            bullets = 0;
            pocketaces = 0;

            deck.add(hand1);
            deck.add(hand2);
            /*deck.add(hand1p2);
            deck.add(hand2p2);*/
            deck.add(flop1);
            deck.add(flop2);
            deck.add(flop3);
            deck.add(turn);
            deck.add(river);
            total = royalcount + straight_flush_count + quad_count + full_house_count + flushcount + straightcount + trips_count + two_pair_count + pair_count + high_card_count;
        }

        System.out.printf("Total Count %d \n\n", count, total);

        System.out.printf("Royal Flush Count %d\n", royalcount);
        System.out.printf("Royal Flush Percentage %.6f Percent\n\n", (float) royalcount * 100 / count);

        System.out.printf("Straight Flush Count %d\n" , straight_flush_count);
        System.out.printf("Straight Flush Percentage %.6f Percent\n\n" , (float) straight_flush_count * 100 / count);

        System.out.printf("Four of a Kind Count %d\n" , quad_count);
        System.out.printf("Four of a Kind Percentage %.6f percent\n\n" , (float) quad_count * 100 / count);

        System.out.printf("Full House Count %d\n" , full_house_count);
        System.out.printf("Full House Percentage %.6f percent\n\n" , (float) full_house_count * 100 /count);

        System.out.printf("Flush Count %d\n" , flushcount);
        System.out.printf("Flush Percentage %.4f Percent\n\n" , (float) flushcount * 100 / count);

        System.out.printf("Straight Count %d\n" , straightcount);
        System.out.printf("Stright %.4f Percent\n\n" , (float) straightcount * 100 / count);


        System.out.printf("Three of a Kind Count %d\n" , trips_count);
        System.out.printf("Three of a Kind Percentage %.2f Percent\n\n" , (float) trips_count * 100 / count);

        System.out.printf("Two Pair Count %d\n" , two_pair_count);
        System.out.printf("Two Pair Percentage %.2f Percent\n\n" , (float) two_pair_count * 100 / count);

        System.out.printf("Pair Count %d\n" , pair_count);
        System.out.printf("Pair Percentage %.2f Percent\n\n" , (float) pair_count * 100 / count);

        System.out.printf("High Card Count %d\n" , high_card_count);
        System.out.printf("High Card Percentage %.2f Percent\n\n" , (float) high_card_count * 100 / count);
    }
}
