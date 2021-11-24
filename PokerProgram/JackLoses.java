import java.util.*;
import java.io.*;

public class JackLoses {
    public static void main(String[] args) {
        // Variables
        Random rand = new Random();
        String[] cards = { "A of Spades", "2 of Spades", "3 of Spades", "4 of Spades", "5 of Spades", "6 of Spades",
                "7 of Spades", "8 of Spades", "9 of Spades", "10 of Spades", "J of Spades", "Q of Spades",
                "K of Spades", "A of Diamonds", "2 of Diamonds", "3 of Diamonds", "4 of Diamonds", "5 of Diamonds",
                "6 of Diamonds", "7 of Diamonds", "8 of Diamonds", "9 of Diamonds", "10 of Diamonds", "J of Diamonds",
                "Q of Diamonds", "K of Diamonds", "A of Hearts", "2 of Hearts", "3 of Hearts", "4 of Hearts",
                "5 of Hearts", "6 of Hearts", "7 of Hearts", "8 of Hearts", "9 of Hearts", "10 of Hearts",
                "J of Hearts", "Q of Hearts", "K of Hearts", "A of Clubs", "2 of Clubs", "3 of Clubs", "4 of Clubs",
                "5 of Clubs", "6 of Clubs", "7 of Clubs", "8 of Clubs", "9 of Clubs", "10 of Clubs", "J of Clubs",
                "Q of Clubs", "K of Clubs" };
        ArrayList<String> deck = new ArrayList<String>(Arrays.asList(cards));
        long count = 0;
        int royalflush = 0;
        int royalcount = 0;
        int toTheJack = 0;
        int toTheJackCount = 0;
        int toTheQueen = 0;
        int toTheQueenCount = 0;
        int toTheKing = 0;
        int toTheKingCount = 0;
        int clubsp1 = 0;
        int diamondsp1 = 0;
        int heartsp1 = 0;
        int spadesp1 = 0;
        int clubsp2 = 0;
        int diamondsp2 = 0;
        int heartsp2 = 0;
        int spadesp2 = 0;
        int straightFlushJackOrBetterL = 0;
        int cJp1, cQp1, cKp1, dJp1, dQp1, dKp1, hJp1, hQp1, hKp1, sJp1, sQp1, sKp1;
        cJp1 = cQp1 = cKp1 = dJp1 = dQp1 = dKp1 = hJp1 = hQp1 = hKp1 = sJp1 = sQp1 = sKp1 = 0;
        int cJp2, cQp2, cKp2, dJp2, dQp2, dKp2, hJp2, hQp2, hKp2, sJp2, sQp2, sKp2;
        cJp2 = cQp2 = cKp2 = dJp2 = dQp2 = dKp2 = hJp2 = hQp2 = hKp2 = sJp2 = sQp2 = sKp2 = 0;


        while(straightFlushJackOrBetterL < 1){
            count++;
            //Player 1's deck
            String card1p1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card1p1);
            String card2p1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card2p1);
            String card3p1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card3p1);
            String card4p1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card4p1);
            String card5p1 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card5p1);

            //Player 2's deck
            String card1p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card1p2);
            String card2p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card2p2);
            String card3p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card3p2);
            String card4p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card4p2);
            String card5p2 = deck.get(rand.nextInt(deck.size()));
            deck.remove(card5p2);

            ////Royal Flush
            ///Player 1
            // Card 1
            if (card1p1 == "A of Spades" || card1p1 == "10 of Spades" || card1p1 == "J of Spades"
                    || card1p1 == "Q of Spades" || card1p1 == "K of Spades") {
                spadesp1++;
            } else if (card1p1 == "A of Diamonds" || card1p1 == "10 of Diamonds" || card1p1 == "J of Diamonds"
                    || card1p1 == "Q of Diamonds" || card1p1 == "K of Diamonds") {
                diamondsp1++;
            } else if (card1p1 == "A of Hearts" || card1p1 == "10 of Hearts" || card1p1 == "J of Hearts"
                    || card1p1 == "Q of Hearts" || card1p1 == "K of Hearts") {
                heartsp1++;
            } else if (card1p1 == "A of Clubs" || card1p1 == "10 of Clubs" || card1p1 == "J of Clubs"
                    || card1p1 == "Q of Clubs" || card1p1 == "K of Clubs") {
                clubsp1++;
            }
            // Card 2
            if (card2p1 == "A of Spades" || card2p1 == "10 of Spades" || card2p1 == "J of Spades"
                    || card2p1 == "Q of Spades" || card2p1 == "K of Spades") {
                spadesp1++;
            } else if (card2p1 == "A of Diamonds" || card2p1 == "10 of Diamonds" || card2p1 == "J of Diamonds"
                    || card2p1 == "Q of Diamonds" || card2p1 == "K of Diamonds") {
                diamondsp1++;
            } else if (card2p1 == "A of Hearts" || card2p1 == "10 of Hearts" || card2p1 == "J of Hearts"
                    || card2p1 == "Q of Hearts" || card2p1 == "K of Hearts") {
                heartsp1++;
            } else if (card2p1 == "A of Clubs" || card2p1 == "10 of Clubs" || card2p1 == "J of Clubs"
                    || card2p1 == "Q of Clubs" || card2p1 == "K of Clubs") {
                clubsp1++;
            }
            // Card 3
            if (card3p1 == "A of Spades" || card3p1 == "10 of Spades" || card3p1 == "J of Spades"
                    || card3p1 == "Q of Spades" || card3p1 == "K of Spades") {
                spadesp1++;
            } else if (card3p1 == "A of Diamonds" || card3p1 == "10 of Diamonds" || card3p1 == "J of Diamonds"
                    || card3p1 == "Q of Diamonds" || card3p1 == "K of Diamonds") {
                diamondsp1++;
            } else if (card3p1 == "A of Hearts" || card3p1 == "10 of Hearts" || card3p1 == "J of Hearts"
                    || card3p1 == "Q of Hearts" || card3p1 == "K of Hearts") {
                heartsp1++;
            } else if (card3p1 == "A of Clubs" || card3p1 == "10 of Clubs" || card3p1 == "J of Clubs"
                    || card3p1 == "Q of Clubs" || card3p1 == "K of Clubs") {
                clubsp1++;
            }
            // Card 4
            if (card4p1 == "A of Spades" || card4p1 == "10 of Spades" || card4p1 == "J of Spades"
                    || card4p1 == "Q of Spades" || card4p1 == "K of Spades") {
                spadesp1++;
            } else if (card4p1 == "A of Diamonds" || card4p1 == "10 of Diamonds" || card4p1 == "J of Diamonds"
                    || card4p1 == "Q of Diamonds" || card4p1 == "K of Diamonds") {
                diamondsp1++;
            } else if (card4p1 == "A of Hearts" || card4p1 == "10 of Hearts" || card4p1 == "J of Hearts"
                    || card4p1 == "Q of Hearts" || card4p1 == "K of Hearts") {
                heartsp1++;
            } else if (card4p1 == "A of Clubs" || card4p1 == "10 of Clubs" || card4p1 == "J of Clubs"
                    || card4p1 == "Q of Clubs" || card4p1 == "K of Clubs") {
                clubsp1++;
            }
            // Card 5
            if (card5p1 == "A of Spades" || card5p1 == "10 of Spades" || card5p1 == "J of Spades"
                    || card5p1 == "Q of Spades" || card5p1 == "K of Spades") {
                spadesp1++;
            } else if (card5p1 == "A of Diamonds" || card5p1 == "10 of Diamonds" || card5p1 == "J of Diamonds"
                    || card5p1 == "Q of Diamonds" || card5p1 == "K of Diamonds") {
                diamondsp1++;
            } else if (card5p1 == "A of Hearts" || card5p1 == "10 of Hearts" || card5p1 == "J of Hearts"
                    || card5p1 == "Q of Hearts" || card5p1 == "K of Hearts") {
                heartsp1++;
            } else if (card5p1 == "A of Clubs" || card5p1 == "10 of Clubs" || card5p1 == "J of Clubs"
                    || card5p1 == "Q of Clubs" || card5p1 == "K of Clubs") {
                clubsp1++;
            }
            ///Player 2
            // Card 1
            if (card1p2 == "A of Spades" || card1p2 == "10 of Spades" || card1p2 == "J of Spades"
                    || card1p2 == "Q of Spades" || card1p2 == "K of Spades") {
                spadesp2++;
            } else if (card1p2 == "A of Diamonds" || card1p2 == "10 of Diamonds" || card1p2 == "J of Diamonds"
                    || card1p2 == "Q of Diamonds" || card1p2 == "K of Diamonds") {
                diamondsp2++;
            } else if (card1p2 == "A of Hearts" || card1p2 == "10 of Hearts" || card1p2 == "J of Hearts"
                    || card1p2 == "Q of Hearts" || card1p2 == "K of Hearts") {
                heartsp2++;
            } else if (card1p2 == "A of Clubs" || card1p2 == "10 of Clubs" || card1p2 == "J of Clubs"
                    || card1p2 == "Q of Clubs" || card1p2 == "K of Clubs") {
                clubsp2++;
            }
            // Card 2
            if (card2p2 == "A of Spades" || card2p2 == "10 of Spades" || card2p2 == "J of Spades"
                    || card2p2 == "Q of Spades" || card2p2 == "K of Spades") {
                spadesp2++;
            } else if (card2p2 == "A of Diamonds" || card2p2 == "10 of Diamonds" || card2p2 == "J of Diamonds"
                    || card2p2 == "Q of Diamonds" || card2p2 == "K of Diamonds") {
                diamondsp2++;
            } else if (card2p2 == "A of Hearts" || card2p2 == "10 of Hearts" || card2p2 == "J of Hearts"
                    || card2p2 == "Q of Hearts" || card2p2 == "K of Hearts") {
                heartsp2++;
            } else if (card2p2 == "A of Clubs" || card2p2 == "10 of Clubs" || card2p2 == "J of Clubs"
                    || card2p2 == "Q of Clubs" || card2p2 == "K of Clubs") {
                clubsp2++;
            }
            // Card 3
            if (card3p2 == "A of Spades" || card3p2 == "10 of Spades" || card3p2 == "J of Spades"
                    || card3p2 == "Q of Spades" || card3p2 == "K of Spades") {
                spadesp2++;
            } else if (card3p2 == "A of Diamonds" || card3p2 == "10 of Diamonds" || card3p2 == "J of Diamonds"
                    || card3p2 == "Q of Diamonds" || card3p2 == "K of Diamonds") {
                diamondsp2++;
            } else if (card3p2 == "A of Hearts" || card3p2 == "10 of Hearts" || card3p2 == "J of Hearts"
                    || card3p2 == "Q of Hearts" || card3p2 == "K of Hearts") {
                heartsp2++;
            } else if (card3p2 == "A of Clubs" || card3p2 == "10 of Clubs" || card3p2 == "J of Clubs"
                    || card3p2 == "Q of Clubs" || card3p2 == "K of Clubs") {
                clubsp2++;
            }
            // Card 4
            if (card4p2 == "A of Spades" || card4p2 == "10 of Spades" || card4p2 == "J of Spades"
                    || card4p2 == "Q of Spades" || card4p2 == "K of Spades") {
                spadesp2++;
            } else if (card4p2 == "A of Diamonds" || card4p2 == "10 of Diamonds" || card4p2 == "J of Diamonds"
                    || card4p2 == "Q of Diamonds" || card4p2 == "K of Diamonds") {
                diamondsp2++;
            } else if (card4p2 == "A of Hearts" || card4p2 == "10 of Hearts" || card4p2 == "J of Hearts"
                    || card4p2 == "Q of Hearts" || card4p2 == "K of Hearts") {
                heartsp2++;
            } else if (card4p2 == "A of Clubs" || card4p2 == "10 of Clubs" || card4p2 == "J of Clubs"
                    || card4p2 == "Q of Clubs" || card4p2 == "K of Clubs") {
                clubsp2++;
            }
            // Card 5
            if (card5p2 == "A of Spades" || card5p2 == "10 of Spades" || card5p2 == "J of Spades"
                    || card5p2 == "Q of Spades" || card5p2 == "K of Spades") {
                spadesp2++;
            } else if (card5p2 == "A of Diamonds" || card5p2 == "10 of Diamonds" || card5p2 == "J of Diamonds"
                    || card5p2 == "Q of Diamonds" || card5p2 == "K of Diamonds") {
                diamondsp2++;
            } else if (card5p2 == "A of Hearts" || card5p2 == "10 of Hearts" || card5p2 == "J of Hearts"
                    || card5p2 == "Q of Hearts" || card5p2 == "K of Hearts") {
                heartsp2++;
            } else if (card5p2 == "A of Clubs" || card5p2 == "10 of Clubs" || card5p2 == "J of Clubs"
                    || card5p2 == "Q of Clubs" || card5p2 == "K of Clubs") {
                clubsp2++;
            }


            ////Straight Flush (Jack or higher)
            ///Player 1
            // Clubs to the J
            if (card1p1 == "J of Clubs" || card1p1 == "7 of Clubs" || card1p1 == "8 of Clubs" || card1p1 == "9 of Clubs"
                    || card1p1 == "10 of Clubs") {
                cJp1++;
            }
            if (card2p1 == "J of Clubs" || card2p1 == "7 of Clubs" || card2p1 == "8 of Clubs" || card2p1 == "9 of Clubs"
                    || card2p1 == "10 of Clubs") {
                cJp1++;
            }
            if (card3p1 == "J of Clubs" || card3p1 == "7 of Clubs" || card3p1 == "8 of Clubs" || card3p1 == "9 of Clubs"
                    || card3p1 == "10 of Clubs") {
                cJp1++;
            }
            if (card4p1 == "J of Clubs" || card4p1 == "7 of Clubs" || card4p1 == "8 of Clubs" || card4p1 == "9 of Clubs"
                    || card4p1 == "10 of Clubs") {
                cJp1++;
            }
            if (card5p1 == "J of Clubs" || card5p1 == "7 of Clubs" || card5p1 == "8 of Clubs" || card5p1 == "9 of Clubs"
                    || card5p1 == "10 of Clubs") {
                cJp1++;
            }
            // Clubs to the Q
            if (card1p1 == "J of Clubs" || card1p1 == "Q of Clubs" || card1p1 == "8 of Clubs" || card1p1 == "9 of Clubs"
                    || card1p1 == "10 of Clubs") {
                cQp1++;
            }
            if (card2p1 == "J of Clubs" || card2p1 == "Q of Clubs" || card2p1 == "8 of Clubs" || card2p1 == "9 of Clubs"
                    || card2p1 == "10 of Clubs") {
                cQp1++;
            }
            if (card3p1 == "J of Clubs" || card3p1 == "Q of Clubs" || card3p1 == "8 of Clubs" || card3p1 == "9 of Clubs"
                    || card3p1 == "10 of Clubs") {
                cQp1++;
            }
            if (card4p1 == "J of Clubs" || card4p1 == "Q of Clubs" || card4p1 == "8 of Clubs" || card4p1 == "9 of Clubs"
                    || card4p1 == "10 of Clubs") {
                cQp1++;
            }
            if (card5p1 == "J of Clubs" || card5p1 == "Q of Clubs" || card5p1 == "8 of Clubs" || card5p1 == "9 of Clubs"
                    || card5p1 == "10 of Clubs") {
                cQp1++;
            }
            // Clubs to the K
            if (card1p1 == "J of Clubs" || card1p1 == "Q of Clubs" || card1p1 == "K of Clubs" || card1p1 == "9 of Clubs"
                    || card1p1 == "10 of Clubs") {
                cKp1++;
            }
            if (card2p1 == "J of Clubs" || card2p1 == "Q of Clubs" || card2p1 == "K of Clubs" || card2p1 == "9 of Clubs"
                    || card2p1 == "10 of Clubs") {
                cKp1++;
            }
            if (card3p1 == "J of Clubs" || card3p1 == "Q of Clubs" || card3p1 == "K of Clubs" || card3p1 == "9 of Clubs"
                    || card3p1 == "10 of Clubs") {
                cKp1++;
            }
            if (card4p1 == "J of Clubs" || card4p1 == "Q of Clubs" || card4p1 == "K of Clubs" || card4p1 == "9 of Clubs"
                    || card4p1 == "10 of Clubs") {
                cKp1++;
            }
            if (card5p1 == "J of Clubs" || card5p1 == "Q of Clubs" || card5p1 == "K of Clubs" || card5p1 == "9 of Clubs"
                    || card5p1 == "10 of Clubs") {
                cKp1++;
            }
            // Diamonds to the J
            if (card1p1 == "J of Diamonds" || card1p1 == "7 of Diamonds" || card1p1 == "8 of Diamonds"
                    || card1p1 == "9 of Diamonds" || card1p1 == "10 of Diamonds") {
                dJp1++;
            }
            if (card2p1 == "J of Diamonds" || card2p1 == "7 of Diamonds" || card2p1 == "8 of Diamonds"
                    || card2p1 == "9 of Diamonds" || card2p1 == "10 of Diamonds") {
                dJp1++;
            }
            if (card3p1 == "J of Diamonds" || card3p1 == "7 of Diamonds" || card3p1 == "8 of Diamonds"
                    || card3p1 == "9 of Diamonds" || card3p1 == "10 of Diamonds") {
                dJp1++;
            }
            if (card4p1 == "J of Diamonds" || card4p1 == "7 of Diamonds" || card4p1 == "8 of Diamonds"
                    || card4p1 == "9 of Diamonds" || card4p1 == "10 of Diamonds") {
                dJp1++;
            }
            if (card5p1 == "J of Diamonds" || card5p1 == "7 of Diamonds" || card5p1 == "8 of Diamonds"
                    || card5p1 == "9 of Diamonds" || card5p1 == "10 of Diamonds") {
                dJp1++;
            }
            // Diamonds to the Q
            if (card1p1 == "J of Diamonds" || card1p1 == "Q of Diamonds" || card1p1 == "8 of Diamonds"
                    || card1p1 == "9 of Diamonds" || card1p1 == "10 of Diamonds") {
                dQp1++;
            }
            if (card2p1 == "J of Diamonds" || card2p1 == "Q of Diamonds" || card2p1 == "8 of Diamonds"
                    || card2p1 == "9 of Diamonds" || card2p1 == "10 of Diamonds") {
                dQp1++;
            }
            if (card3p1 == "J of Diamonds" || card3p1 == "Q of Diamonds" || card3p1 == "8 of Diamonds"
                    || card3p1 == "9 of Diamonds" || card3p1 == "10 of Diamonds") {
                dQp1++;
            }
            if (card4p1 == "J of Diamonds" || card4p1 == "Q of Diamonds" || card4p1 == "8 of Diamonds"
                    || card4p1 == "9 of Diamonds" || card4p1 == "10 of Diamonds") {
                dQp1++;
            }
            if (card5p1 == "J of Diamonds" || card5p1 == "Q of Diamonds" || card5p1 == "8 of Diamonds"
                    || card5p1 == "9 of Diamonds" || card5p1 == "10 of Diamonds") {
                dQp1++;
            }
            // Diamonds to the K
            if (card1p1 == "J of Diamonds" || card1p1 == "Q of Diamonds" || card1p1 == "K of Diamonds"
                    || card1p1 == "9 of Diamonds" || card1p1 == "10 of Diamonds") {
                dKp1++;
            }
            if (card2p1 == "J of Diamonds" || card2p1 == "Q of Diamonds" || card2p1 == "K of Diamonds"
                    || card2p1 == "9 of Diamonds" || card2p1 == "10 of Diamonds") {
                dKp1++;
            }
            if (card3p1 == "J of Diamonds" || card3p1 == "Q of Diamonds" || card3p1 == "K of Diamonds"
                    || card3p1 == "9 of Diamonds" || card3p1 == "10 of Diamonds") {
                dKp1++;
            }
            if (card4p1 == "J of Diamonds" || card4p1 == "Q of Diamonds" || card4p1 == "K of Diamonds"
                    || card4p1 == "9 of Diamonds" || card4p1 == "10 of Diamonds") {
                dKp1++;
            }
            if (card5p1 == "J of Diamonds" || card5p1 == "Q of Diamonds" || card5p1 == "K of Diamonds"
                    || card5p1 == "9 of Diamonds" || card5p1 == "10 of Diamonds") {
                dKp1++;
            }
            // Hearts to the J
            if (card1p1 == "J of Hearts" || card1p1 == "7 of Hearts" || card1p1 == "8 of Hearts"
                    || card1p1 == "9 of Hearts" || card1p1 == "10 of Hearts") {
                hJp1++;
            }
            if (card2p1 == "J of Hearts" || card2p1 == "7 of Hearts" || card2p1 == "8 of Hearts"
                    || card2p1 == "9 of Hearts" || card2p1 == "10 of Hearts") {
                hJp1++;
            }
            if (card3p1 == "J of Hearts" || card3p1 == "7 of Hearts" || card3p1 == "8 of Hearts"
                    || card3p1 == "9 of Hearts" || card3p1 == "10 of Hearts") {
                hJp1++;
            }
            if (card4p1 == "J of Hearts" || card4p1 == "7 of Hearts" || card4p1 == "8 of Hearts"
                    || card4p1 == "9 of Hearts" || card4p1 == "10 of Hearts") {
                hJp1++;
            }
            if (card5p1 == "J of Hearts" || card5p1 == "7 of Hearts" || card5p1 == "8 of Hearts"
                    || card5p1 == "9 of Hearts" || card5p1 == "10 of Hearts") {
                hJp1++;
            }
            // Hearts to the Q
            if (card1p1 == "J of Hearts" || card1p1 == "Q of Hearts" || card1p1 == "8 of Hearts"
                    || card1p1 == "9 of Hearts" || card1p1 == "10 of Hearts") {
                hQp1++;
            }
            if (card2p1 == "J of Hearts" || card2p1 == "Q of Hearts" || card2p1 == "8 of Hearts"
                    || card2p1 == "9 of Hearts" || card2p1 == "10 of Hearts") {
                hQp1++;
            }
            if (card3p1 == "J of Hearts" || card3p1 == "Q of Hearts" || card3p1 == "8 of Hearts"
                    || card3p1 == "9 of Hearts" || card3p1 == "10 of Hearts") {
                hQp1++;
            }
            if (card4p1 == "J of Hearts" || card4p1 == "Q of Hearts" || card4p1 == "8 of Hearts"
                    || card4p1 == "9 of Hearts" || card4p1 == "10 of Hearts") {
                hQp1++;
            }
            if (card5p1 == "J of Hearts" || card5p1 == "Q of Hearts" || card5p1 == "8 of Hearts"
                    || card5p1 == "9 of Hearts" || card5p1 == "10 of Hearts") {
                hQp1++;
            }
            // Hearts to the K
            if (card1p1 == "J of Hearts" || card1p1 == "Q of Hearts" || card1p1 == "K of Hearts"
                    || card1p1 == "9 of Hearts" || card1p1 == "10 of Hearts") {
                hKp1++;
            }
            if (card2p1 == "J of Hearts" || card2p1 == "Q of Hearts" || card2p1 == "K of Hearts"
                    || card2p1 == "9 of Hearts" || card2p1 == "10 of Hearts") {
                hKp1++;
            }
            if (card3p1 == "J of Hearts" || card3p1 == "Q of Hearts" || card3p1 == "K of Hearts"
                    || card3p1 == "9 of Hearts" || card3p1 == "10 of Hearts") {
                hKp1++;
            }
            if (card4p1 == "J of Hearts" || card4p1 == "Q of Hearts" || card4p1 == "K of Hearts"
                    || card4p1 == "9 of Hearts" || card4p1 == "10 of Hearts") {
                hKp1++;
            }
            if (card5p1 == "J of Hearts" || card5p1 == "Q of Hearts" || card5p1 == "K of Hearts"
                    || card5p1 == "9 of Hearts" || card5p1 == "10 of Hearts") {
                hKp1++;
            }
            // Spades to the J
            if (card1p1 == "J of Spades" || card1p1 == "7 of Spades" || card1p1 == "8 of Spades"
                    || card1p1 == "9 of Spades" || card1p1 == "10 of Spades") {
                sJp1++;
            }
            if (card2p1 == "J of Spades" || card2p1 == "7 of Spades" || card2p1 == "8 of Spades"
                    || card2p1 == "9 of Spades" || card2p1 == "10 of Spades") {
                sJp1++;
            }
            if (card3p1 == "J of Spades" || card3p1 == "7 of Spades" || card3p1 == "8 of Spades"
                    || card3p1 == "9 of Spades" || card3p1 == "10 of Spades") {
                sJp1++;
            }
            if (card4p1 == "J of Spades" || card4p1 == "7 of Spades" || card4p1 == "8 of Spades"
                    || card4p1 == "9 of Spades" || card4p1 == "10 of Spades") {
                sJp1++;
            }
            if (card5p1 == "J of Spades" || card5p1 == "7 of Spades" || card5p1 == "8 of Spades"
                    || card5p1 == "9 of Spades" || card5p1 == "10 of Spades") {
                sJp1++;
            }
            // Spades to the Q
            if (card1p1 == "J of Spades" || card1p1 == "Q of Spades" || card1p1 == "8 of Spades"
                    || card1p1 == "9 of Spades" || card1p1 == "10 of Spades") {
                sQp1++;
            }
            if (card2p1 == "J of Spades" || card2p1 == "Q of Spades" || card2p1 == "8 of Spades"
                    || card2p1 == "9 of Spades" || card2p1 == "10 of Spades") {
                sQp1++;
            }
            if (card3p1 == "J of Spades" || card3p1 == "Q of Spades" || card3p1 == "8 of Spades"
                    || card3p1 == "9 of Spades" || card3p1 == "10 of Spades") {
                sQp1++;
            }
            if (card4p1 == "J of Spades" || card4p1 == "Q of Spades" || card4p1 == "8 of Spades"
                    || card4p1 == "9 of Spades" || card4p1 == "10 of Spades") {
                sQp1++;
            }
            if (card5p1 == "J of Spades" || card5p1 == "Q of Spades" || card5p1 == "8 of Spades"
                    || card5p1 == "9 of Spades" || card5p1 == "10 of Spades") {
                sQp1++;
            }
            // Spades to the K
            if (card1p1 == "J of Spades" || card1p1 == "Q of Spades" || card1p1 == "K of Spades"
                    || card1p1 == "9 of Spades" || card1p1 == "10 of Spades") {
                sKp1++;
            }
            if (card2p1 == "J of Spades" || card2p1 == "Q of Spades" || card2p1 == "K of Spades"
                    || card2p1 == "9 of Spades" || card2p1 == "10 of Spades") {
                sKp1++;
            }
            if (card3p1 == "J of Spades" || card3p1 == "Q of Spades" || card3p1 == "K of Spades"
                    || card3p1 == "9 of Spades" || card3p1 == "10 of Spades") {
                sKp1++;
            }
            if (card4p1 == "J of Spades" || card4p1 == "Q of Spades" || card4p1 == "K of Spades"
                    || card4p1 == "9 of Spades" || card4p1 == "10 of Spades") {
                sKp1++;
            }
            if (card5p1 == "J of Spades" || card5p1 == "Q of Spades" || card5p1 == "K of Spades"
                    || card5p1 == "9 of Spades" || card5p1 == "10 of Spades") {
                sKp1++;
            }
            ///Player 2
            // Clubs to the J
            if (card1p2 == "J of Clubs" || card1p2 == "7 of Clubs" || card1p2 == "8 of Clubs" || card1p2 == "9 of Clubs"
                    || card1p2 == "10 of Clubs") {
                cJp2++;
            }
            if (card2p2 == "J of Clubs" || card2p2 == "7 of Clubs" || card2p2 == "8 of Clubs" || card2p2 == "9 of Clubs"
                    || card2p2 == "10 of Clubs") {
                cJp2++;
            }
            if (card3p2 == "J of Clubs" || card3p2 == "7 of Clubs" || card3p2 == "8 of Clubs" || card3p2 == "9 of Clubs"
                    || card3p2 == "10 of Clubs") {
                cJp2++;
            }
            if (card4p2 == "J of Clubs" || card4p2 == "7 of Clubs" || card4p2 == "8 of Clubs" || card4p2 == "9 of Clubs"
                    || card4p2 == "10 of Clubs") {
                cJp2++;
            }
            if (card5p2 == "J of Clubs" || card5p2 == "7 of Clubs" || card5p2 == "8 of Clubs" || card5p2 == "9 of Clubs"
                    || card5p2 == "10 of Clubs") {
                cJp2++;
            }
            // Clubs to the Q
            if (card1p2 == "J of Clubs" || card1p2 == "Q of Clubs" || card1p2 == "8 of Clubs" || card1p2 == "9 of Clubs"
                    || card1p2 == "10 of Clubs") {
                cQp2++;
            }
            if (card2p2 == "J of Clubs" || card2p2 == "Q of Clubs" || card2p2 == "8 of Clubs" || card2p2 == "9 of Clubs"
                    || card2p2 == "10 of Clubs") {
                cQp2++;
            }
            if (card3p2 == "J of Clubs" || card3p2 == "Q of Clubs" || card3p2 == "8 of Clubs" || card3p2 == "9 of Clubs"
                    || card3p2 == "10 of Clubs") {
                cQp2++;
            }
            if (card4p2 == "J of Clubs" || card4p2 == "Q of Clubs" || card4p2 == "8 of Clubs" || card4p2 == "9 of Clubs"
                    || card4p2 == "10 of Clubs") {
                cQp2++;
            }
            if (card5p2 == "J of Clubs" || card5p2 == "Q of Clubs" || card5p2 == "8 of Clubs" || card5p2 == "9 of Clubs"
                    || card5p2 == "10 of Clubs") {
                cQp2++;
            }
            // Clubs to the K
            if (card1p2 == "J of Clubs" || card1p2 == "Q of Clubs" || card1p2 == "K of Clubs" || card1p2 == "9 of Clubs"
                    || card1p2 == "10 of Clubs") {
                cKp2++;
            }
            if (card2p2 == "J of Clubs" || card2p2 == "Q of Clubs" || card2p2 == "K of Clubs" || card2p2 == "9 of Clubs"
                    || card2p2 == "10 of Clubs") {
                cKp2++;
            }
            if (card3p2 == "J of Clubs" || card3p2 == "Q of Clubs" || card3p2 == "K of Clubs" || card3p2 == "9 of Clubs"
                    || card3p2 == "10 of Clubs") {
                cKp2++;
            }
            if (card4p2 == "J of Clubs" || card4p2 == "Q of Clubs" || card4p2 == "K of Clubs" || card4p2 == "9 of Clubs"
                    || card4p2 == "10 of Clubs") {
                cKp2++;
            }
            if (card5p2 == "J of Clubs" || card5p2 == "Q of Clubs" || card5p2 == "K of Clubs" || card5p2 == "9 of Clubs"
                    || card5p2 == "10 of Clubs") {
                cKp2++;
            }
            // Diamonds to the J
            if (card1p2 == "J of Diamonds" || card1p2 == "7 of Diamonds" || card1p2 == "8 of Diamonds"
                    || card1p2 == "9 of Diamonds" || card1p2 == "10 of Diamonds") {
                dJp2++;
            }
            if (card2p2 == "J of Diamonds" || card2p2 == "7 of Diamonds" || card2p2 == "8 of Diamonds"
                    || card2p2 == "9 of Diamonds" || card2p2 == "10 of Diamonds") {
                dJp2++;
            }
            if (card3p2 == "J of Diamonds" || card3p2 == "7 of Diamonds" || card3p2 == "8 of Diamonds"
                    || card3p2 == "9 of Diamonds" || card3p2 == "10 of Diamonds") {
                dJp2++;
            }
            if (card4p2 == "J of Diamonds" || card4p2 == "7 of Diamonds" || card4p2 == "8 of Diamonds"
                    || card4p2 == "9 of Diamonds" || card4p2 == "10 of Diamonds") {
                dJp2++;
            }
            if (card5p2 == "J of Diamonds" || card5p2 == "7 of Diamonds" || card5p2 == "8 of Diamonds"
                    || card5p2 == "9 of Diamonds" || card5p2 == "10 of Diamonds") {
                dJp2++;
            }
            // Diamonds to the Q
            if (card1p2 == "J of Diamonds" || card1p2 == "Q of Diamonds" || card1p2 == "8 of Diamonds"
                    || card1p2 == "9 of Diamonds" || card1p2 == "10 of Diamonds") {
                dQp2++;
            }
            if (card2p2 == "J of Diamonds" || card2p2 == "Q of Diamonds" || card2p2 == "8 of Diamonds"
                    || card2p2 == "9 of Diamonds" || card2p2 == "10 of Diamonds") {
                dQp2++;
            }
            if (card3p2 == "J of Diamonds" || card3p2 == "Q of Diamonds" || card3p2 == "8 of Diamonds"
                    || card3p2 == "9 of Diamonds" || card3p2 == "10 of Diamonds") {
                dQp2++;
            }
            if (card4p2 == "J of Diamonds" || card4p2 == "Q of Diamonds" || card4p2 == "8 of Diamonds"
                    || card4p2 == "9 of Diamonds" || card4p2 == "10 of Diamonds") {
                dQp2++;
            }
            if (card5p2 == "J of Diamonds" || card5p2 == "Q of Diamonds" || card5p2 == "8 of Diamonds"
                    || card5p2 == "9 of Diamonds" || card5p2 == "10 of Diamonds") {
                dQp2++;
            }
            // Diamonds to the K
            if (card1p2 == "J of Diamonds" || card1p2 == "Q of Diamonds" || card1p2 == "K of Diamonds"
                    || card1p2 == "9 of Diamonds" || card1p2 == "10 of Diamonds") {
                dKp2++;
            }
            if (card2p2 == "J of Diamonds" || card2p2 == "Q of Diamonds" || card2p2 == "K of Diamonds"
                    || card2p2 == "9 of Diamonds" || card2p2 == "10 of Diamonds") {
                dKp2++;
            }
            if (card3p2 == "J of Diamonds" || card3p2 == "Q of Diamonds" || card3p2 == "K of Diamonds"
                    || card3p2 == "9 of Diamonds" || card3p2 == "10 of Diamonds") {
                dKp2++;
            }
            if (card4p2 == "J of Diamonds" || card4p2 == "Q of Diamonds" || card4p2 == "K of Diamonds"
                    || card4p2 == "9 of Diamonds" || card4p2 == "10 of Diamonds") {
                dKp2++;
            }
            if (card5p2 == "J of Diamonds" || card5p2 == "Q of Diamonds" || card5p2 == "K of Diamonds"
                    || card5p2 == "9 of Diamonds" || card5p2 == "10 of Diamonds") {
                dKp2++;
            }
            // Hearts to the J
            if (card1p2 == "J of Hearts" || card1p2 == "7 of Hearts" || card1p2 == "8 of Hearts"
                    || card1p2 == "9 of Hearts" || card1p2 == "10 of Hearts") {
                hJp2++;
            }
            if (card2p2 == "J of Hearts" || card2p2 == "7 of Hearts" || card2p2 == "8 of Hearts"
                    || card2p2 == "9 of Hearts" || card2p2 == "10 of Hearts") {
                hJp2++;
            }
            if (card3p2 == "J of Hearts" || card3p2 == "7 of Hearts" || card3p2 == "8 of Hearts"
                    || card3p2 == "9 of Hearts" || card3p2 == "10 of Hearts") {
                hJp2++;
            }
            if (card4p2 == "J of Hearts" || card4p2 == "7 of Hearts" || card4p2 == "8 of Hearts"
                    || card4p2 == "9 of Hearts" || card4p2 == "10 of Hearts") {
                hJp2++;
            }
            if (card5p2 == "J of Hearts" || card5p2 == "7 of Hearts" || card5p2 == "8 of Hearts"
                    || card5p2 == "9 of Hearts" || card5p2 == "10 of Hearts") {
                hJp2++;
            }
            // Hearts to the Q
            if (card1p2 == "J of Hearts" || card1p2 == "Q of Hearts" || card1p2 == "8 of Hearts"
                    || card1p2 == "9 of Hearts" || card1p2 == "10 of Hearts") {
                hQp2++;
            }
            if (card2p2 == "J of Hearts" || card2p2 == "Q of Hearts" || card2p2 == "8 of Hearts"
                    || card2p2 == "9 of Hearts" || card2p2 == "10 of Hearts") {
                hQp2++;
            }
            if (card3p2 == "J of Hearts" || card3p2 == "Q of Hearts" || card3p2 == "8 of Hearts"
                    || card3p2 == "9 of Hearts" || card3p2 == "10 of Hearts") {
                hQp2++;
            }
            if (card4p2 == "J of Hearts" || card4p2 == "Q of Hearts" || card4p2 == "8 of Hearts"
                    || card4p2 == "9 of Hearts" || card4p2 == "10 of Hearts") {
                hQp2++;
            }
            if (card5p2 == "J of Hearts" || card5p2 == "Q of Hearts" || card5p2 == "8 of Hearts"
                    || card5p2 == "9 of Hearts" || card5p2 == "10 of Hearts") {
                hQp2++;
            }
            // Hearts to the K
            if (card1p2 == "J of Hearts" || card1p2 == "Q of Hearts" || card1p2 == "K of Hearts"
                    || card1p2 == "9 of Hearts" || card1p2 == "10 of Hearts") {
                hKp2++;
            }
            if (card2p2 == "J of Hearts" || card2p2 == "Q of Hearts" || card2p2 == "K of Hearts"
                    || card2p2 == "9 of Hearts" || card2p2 == "10 of Hearts") {
                hKp2++;
            }
            if (card3p2 == "J of Hearts" || card3p2 == "Q of Hearts" || card3p2 == "K of Hearts"
                    || card3p2 == "9 of Hearts" || card3p2 == "10 of Hearts") {
                hKp2++;
            }
            if (card4p2 == "J of Hearts" || card4p2 == "Q of Hearts" || card4p2 == "K of Hearts"
                    || card4p2 == "9 of Hearts" || card4p2 == "10 of Hearts") {
                hKp2++;
            }
            if (card5p2 == "J of Hearts" || card5p2 == "Q of Hearts" || card5p2 == "K of Hearts"
                    || card5p2 == "9 of Hearts" || card5p2 == "10 of Hearts") {
                hKp2++;
            }
            // Spades to the J
            if (card1p2 == "J of Spades" || card1p2 == "7 of Spades" || card1p2 == "8 of Spades"
                    || card1p2 == "9 of Spades" || card1p2 == "10 of Spades") {
                sJp2++;
            }
            if (card2p2 == "J of Spades" || card2p2 == "7 of Spades" || card2p2 == "8 of Spades"
                    || card2p2 == "9 of Spades" || card2p2 == "10 of Spades") {
                sJp2++;
            }
            if (card3p2 == "J of Spades" || card3p2 == "7 of Spades" || card3p2 == "8 of Spades"
                    || card3p2 == "9 of Spades" || card3p2 == "10 of Spades") {
                sJp2++;
            }
            if (card4p2 == "J of Spades" || card4p2 == "7 of Spades" || card4p2 == "8 of Spades"
                    || card4p2 == "9 of Spades" || card4p2 == "10 of Spades") {
                sJp2++;
            }
            if (card5p2 == "J of Spades" || card5p2 == "7 of Spades" || card5p2 == "8 of Spades"
                    || card5p2 == "9 of Spades" || card5p2 == "10 of Spades") {
                sJp2++;
            }
            // Spades to the Q
            if (card1p2 == "J of Spades" || card1p2 == "Q of Spades" || card1p2 == "8 of Spades"
                    || card1p2 == "9 of Spades" || card1p2 == "10 of Spades") {
                sQp2++;
            }
            if (card2p2 == "J of Spades" || card2p2 == "Q of Spades" || card2p2 == "8 of Spades"
                    || card2p2 == "9 of Spades" || card2p2 == "10 of Spades") {
                sQp2++;
            }
            if (card3p2 == "J of Spades" || card3p2 == "Q of Spades" || card3p2 == "8 of Spades"
                    || card3p2 == "9 of Spades" || card3p2 == "10 of Spades") {
                sQp2++;
            }
            if (card4p2 == "J of Spades" || card4p2 == "Q of Spades" || card4p2 == "8 of Spades"
                    || card4p2 == "9 of Spades" || card4p2 == "10 of Spades") {
                sQp2++;
            }
            if (card5p2 == "J of Spades" || card5p2 == "Q of Spades" || card5p2 == "8 of Spades"
                    || card5p2 == "9 of Spades" || card5p2 == "10 of Spades") {
                sQp2++;
            }
            // Spades to the K
            if (card1p2 == "J of Spades" || card1p2 == "Q of Spades" || card1p2 == "K of Spades"
                    || card1p2 == "9 of Spades" || card1p2 == "10 of Spades") {
                sKp2++;
            }
            if (card2p2 == "J of Spades" || card2p2 == "Q of Spades" || card2p2 == "K of Spades"
                    || card2p2 == "9 of Spades" || card2p2 == "10 of Spades") {
                sKp2++;
            }
            if (card3p2 == "J of Spades" || card3p2 == "Q of Spades" || card3p2 == "K of Spades"
                    || card3p2 == "9 of Spades" || card3p2 == "10 of Spades") {
                sKp2++;
            }
            if (card4p2 == "J of Spades" || card4p2 == "Q of Spades" || card4p2 == "K of Spades"
                    || card4p2 == "9 of Spades" || card4p2 == "10 of Spades") {
                sKp2++;
            }
            if (card5p2 == "J of Spades" || card5p2 == "Q of Spades" || card5p2 == "K of Spades"
                    || card5p2 == "9 of Spades" || card5p2 == "10 of Spades") {
                sKp2++;
            }

            //// Hand Counters(?)
            // Royal Flush
            if ((clubsp1 == 5 || diamondsp1 == 5 || heartsp1 == 5 || spadesp1 == 5) || 
            (clubsp2 == 5 || diamondsp2 == 5 || heartsp2 == 5 || spadesp2 == 5)){
                royalflush++;
                royalcount++;
                /*System.out.println(card1p1);
                System.out.println(card2p1);
                System.out.println(card3p1);
                System.out.println(card4p1);
                System.out.println(card5p1 + "\n");

                System.out.println(card1p2);
                System.out.println(card2p2);
                System.out.println(card3p2);
                System.out.println(card4p2);
                System.out.println(card5p2 + "\n\n");*/

            }
            // Straight Flush
            if ((cJp1 == 5 || dJp1 == 5 || hJp1 == 5 || sJp1 == 5) || 
                (cJp2 == 5 || dJp2 == 5 || hJp2 == 5 || sJp2 == 5) && (royalflush == 0)){
                toTheJack++;
                toTheJackCount++;
                /*System.out.println(card1p1);
                System.out.println(card2p1);
                System.out.println(card3p1);
                System.out.println(card4p1);
                System.out.println(card5p1 + "\n");

                System.out.println(card1p2);
                System.out.println(card2p2);
                System.out.println(card3p2);
                System.out.println(card4p2);
                System.out.println(card5p2 + "\n\n");*/
            }
            if ((cQp1 == 5 || dQp1 == 5 || hQp1 == 5 || sQp1 == 5)
                    || (cQp2 == 5 || dQp2 == 5 || hQp2 == 5 || sQp2 == 5) && (royalflush == 0)){
                toTheQueen++;
                toTheQueenCount++;
                /*System.out.println(card1p1);
                System.out.println(card2p1);
                System.out.println(card3p1);
                System.out.println(card4p1);
                System.out.println(card5p1 + "\n");

                System.out.println(card1p2);
                System.out.println(card2p2);
                System.out.println(card3p2);
                System.out.println(card4p2);
                System.out.println(card5p2 + "\n\n");*/
            }
            if ((cKp1 == 5 || dKp1 == 5 || hKp1 == 5 || sKp1 == 5)
                    || (cKp2 == 5 || dKp2 == 5 || hKp2 == 5 || sKp2 == 5) && (royalflush == 0)){
                toTheKing++;
                toTheKingCount++;
                /*System.out.println(card1p1);
                System.out.println(card2p1);
                System.out.println(card3p1);
                System.out.println(card4p1);
                System.out.println(card5p1 + "\n");

                System.out.println(card1p2);
                System.out.println(card2p2);
                System.out.println(card3p2);
                System.out.println(card4p2);
                System.out.println(card5p2 + "\n\n");*/
                }

            if((toTheJack == 1 && (toTheQueen == 1 || toTheKing == 1 || royalflush == 1)) || (toTheQueen == 1
                    && (toTheKing == 1 || royalflush == 1)) || (toTheKing == 1 && royalflush == 1)){
                        straightFlushJackOrBetterL++;
                        System.out.println("Count: " + count);
                        System.out.println("Royal Flush Count: " + royalcount);
                        System.out.println("Straight Flush to The King Count: " + toTheKingCount);
                        System.out.println("Straight Flush to The Queen Count: " + toTheQueenCount);
                        System.out.println("Straight Flush to The Jack Count: " + toTheJackCount + "\n");

                        System.out.println(card1p1);
                        System.out.println(card2p1);
                        System.out.println(card3p1);
                        System.out.println(card4p1);
                        System.out.println(card5p1 + "\n");

                        System.out.println(card1p2);
                        System.out.println(card2p2);
                        System.out.println(card3p2);
                        System.out.println(card4p2);
                        System.out.println(card5p2 + "\n\n");
            }
            




            //// Resets counters after each trial
            royalflush = toTheJack = toTheQueen = toTheKing = 0;
            clubsp1 = diamondsp1 = heartsp1 = spadesp1 = 0;
            clubsp2 = diamondsp2 = heartsp2 = spadesp2 = 0;
            cJp1 = cQp1 = cKp1 = dJp1 = dQp1 = dKp1 = hJp1 = hQp1 = hKp1 = sJp1 = sQp1 = sKp1 = 0;
            cJp2 = cQp2 = cKp2 = dJp2 = dQp2 = dKp2 = hJp2 = hQp2 = hKp2 = sJp2 = sQp2 = sKp2 = 0;


            

            /*System.out.println(card1p1);
            System.out.println(card2p1);
            System.out.println(card3p1);
            System.out.println(card4p1);
            System.out.println(card5p1 + "\n");

            System.out.println(card1p2);
            System.out.println(card2p2);
            System.out.println(card3p2);
            System.out.println(card4p2);
            System.out.println(card5p2 + "\n\n");*/
            

            deck.add(card1p1);
            deck.add(card2p1);
            deck.add(card3p1);
            deck.add(card4p1);
            deck.add(card5p1);

            deck.add(card1p2);
            deck.add(card2p2);
            deck.add(card3p2);
            deck.add(card4p2);
            deck.add(card5p2);


        }
        
    }
}
