package week06FinalProject;

public class App {

	public static void main(String[] args) {
		   // instructions stated that the App class needed the main method
        System.out.println("-------------------------------------");
        System.out.println("||| WELCOME TO WAR: THE JAVA GAME |||");
        System.out.println("-------------------------------------");
        
        Deck deck = new Deck(); // Instantiate a new deck
        Player player1 = new Player("Gandalf"); // Instantiate player one
        Player player2 = new Player("The Witch King"); // Instantiate player two
        
        deck.shuffle();
        // Each player needs to have 26 cards
        for (int i = 0; i < 26; i++) {
            player1.draw(deck); // Draw card for player 1
            player2.draw(deck); // Draw card for player 2
        }

        // Now the game needs to run for each player's card
        for (int turn = 1; turn <= 26; turn++) {
            System.out.println("\nTurn " + turn + ":");

            // Now each player flips their card
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            
            // Describe the cards to show the player what they flipped
            card1.describe();
            card2.describe();
        
            // Now I need to see who wins each turn
            if (card1.getValue() > card2.getValue()) {
                player1.addScore();
                System.out.println("Gandalf wins the round and gets a point!");
            } else if (card1.getValue() < card2.getValue()) {
                player2.addScore();
                System.out.println("The Witch King wins the round and gets a point!");
            } else {
                System.out.println("It's a tie! No winner!");
            }
        
            // Print the score after each turn
            System.out.println("Gandalf's Score: " + player1.getScore() + " || " + "The Witch King's Score: " + player2.getScore());
        }
        
        // After the game ends, print the final scores and declare the winner
        System.out.println("\nFinal Score: " + "Gandalf: " + player1.getScore() + " The Witch King: " + player2.getScore());
        
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Gandalf Wins!!!!!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("The Witch King Wins!!!!");
        } else {
            System.out.println("No one Wins :(");
        }
    }
}
