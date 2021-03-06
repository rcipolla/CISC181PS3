package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test (expected = DeckException.class)
	public void TestEmptyDeck() throws DeckException {
		Deck d1 = new Deck();
		for (int i = 0;i < 54; i++) {
			d1.Draw();
		}
	}
	
	@Test
	public void TestDrawSuit() {
		Deck d2 = new Deck();
		Card c = d2.Draw(eSuit.HEARTS);
		assertTrue(c.geteSuit() == eSuit.HEARTS);
	}
	
	@Test
	public void TestDrawRank() {
		Deck d3 = new Deck();
		Card d = d3.Draw(eRank.ACE);
		assertTrue(d.geteRank() == eRank.ACE);
	}
	
	@Test
	public void TestDeckRankCount() {
		Deck d4 = new Deck();
		assertTrue(d4.DeckRankCount(eRank.ACE) == 4);
	}
	
	@Test
	public void TestDeckSuitCount() {
		Deck d5 = new Deck();
		assertTrue(d5.DeckSuitCount(eSuit.CLUBS) == 13);
	}

}
