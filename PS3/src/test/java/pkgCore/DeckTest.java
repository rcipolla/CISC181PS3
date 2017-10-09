package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test
	public void TestEmptyDeck() throws DeckException {
		//Build a deck, draw until you get a DeckException
		Deck d1 = new Deck();
		for (int i = 0;i == 53; i++) {
			d1.Draw();
		}
	}
	
	@Test
	public void TestDrawSuit() {
		//Build a deck, test the Draw(eSuit) method
		Deck d2 = new Deck();
		Card c = d2.Draw(eSuit.HEARTS);
		assertTrue(c.geteSuit() == eSuit.HEARTS);
	}
	
	@Test
	public void TestDrawRank() {
		//Build a deck, test the Draw(eRank) method
		Deck d3 = new Deck();
		Card d = d3.Draw(eRank.ACE);
		assertTrue(d.geteRank() == eRank.ACE);
	}
	
	public void TestDeckRankCount() {
		//Build a deck, test the DeckRankCount method
		Deck d4 = new Deck();
		assertTrue(d4.DeckRankCount(eRank.ACE) == 4);
	}
	
	public void TestDeckSuitCount() {
		//Build a deck, test the DeckSuitCount method
		Deck d5 = new Deck();
		assertTrue(d5.DeckSuitCount(eSuit.CLUBS) == 12);
	}

}
