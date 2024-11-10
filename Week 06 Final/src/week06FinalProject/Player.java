package week06FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand; //Cards that each player has?
	private int score; // this would be each players score
	private String name; // and this is each players name
	
	// set the above to private since the individual elements will all need to be accessed through
	//the Player class anyway
	
	public Player (String name) {
		this.name = name; // sets the value of name to whatever name is declared later
		this.score = 0; // sets score to 0 as instructed in my constructer
		this.hand = new ArrayList<>(); // sets a new arrayList for each players hand
	}
// generated getters and setters from Source > generate getters and setters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// the describe method
	public void describe() {
		for (Card card : hand) { // chose to use an advanced for loop to describe each card
			card.describe();
			
		}
	}
	// flip and draw methods
	public Card flip() {
		if (hand.isEmpty()){
			return null;
		}
	return hand.remove(0);
	// this states that if the player has gone through all 26 cards in their hand
	// it returns nothing, but if they have cards to play it returns the top card
	// of their hand. (otherwise meaning it removes the first card in the ArrayList)
	}
	
	public void draw(Deck deck) { //this method is going to help us draw from each deck stored in Deck
		Card card = deck.draw(); // for each Card called card in the deck, it draws one card
		if (card != null) {
			hand.add(card); //if card does not equal null this adds the card to the player hand
		}
		
	}
// i know that the score needs to be tallied, this will accomplish that
public void addScore() {
	this.score++;
}





}
