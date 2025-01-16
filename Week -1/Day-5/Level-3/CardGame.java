import java.util.Random;
public class CardGame {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numPlayers = 4; 
        int cardsPerPlayer = 5; 

        String[] deck = initializeDeck(suits, ranks);
        String[] shuffledDeck = shuffleDeck(deck);

        String[][] playerCards = distributeCards(shuffledDeck, numPlayers, cardsPerPlayer);

        printPlayerCards(playerCards, numPlayers);
    }

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomIndex = i + rand.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Error: Not enough cards to distribute.");
            return null;
        }

        String[][] playerCards = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return playerCards;
    }

    public static void printPlayerCards(String[][] playerCards, int numPlayers) {
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
            System.out.println();
        }
    }
}