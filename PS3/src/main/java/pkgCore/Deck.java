package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	//Fixed Draw method so it throws an exception if the deck is empty
	
	public Card Draw() throws DeckException {
		
		if (this.cardsInDeck.size() == 0) {
			throw new DeckException(this);
		}
		
		return cardsInDeck.remove(0);
	}
	
	//overloaded Draw method to Draw a card of a given eSuit
	
	public Card Draw(eSuit eSuit) {
		for (Card c : this.cardsInDeck) {
			if(c.geteSuit() == eSuit) {
				cardsInDeck.remove(c);
				return c;
			}
		}
		
		return null;
	}
	
	//overloaded Draw method to Draw a card of a given eRank
	
	public Card Draw(eRank eRank) {
		for (Card c : this.cardsInDeck) {
			if(c.geteRank() == eRank) {
				cardsInDeck.remove(c);
				return c;
			}
		}
		
		return null;
	}

	//method that will return the number of a given eSuit left in the deck.
	
	public int DeckSuitCount(eSuit eSuit) {
		int suitcount = 0;
		for (Card c : this.cardsInDeck) {
			if(c.geteSuit() == eSuit) {
				suitcount++;
			}
		}
		return suitcount;
	}
	
	//method that will return the number of a given eRank left in the deck.
	
	public int DeckRankCount(eRank eRank) {
		int rankcount = 0;
		for (Card c : this.cardsInDeck) {
			if(c.geteRank() == eRank) {
				rankcount++;
			}
		}
		return rankcount;
	}
	
	//method that will return 0 or 1 if a given card is left in the deck.
	
	public int FindCard(Card c) {
		for (Card crds: cardsInDeck) {
			if(crds == c) {
				return 1;
			}
		}
		return 0;
	}
	
}
