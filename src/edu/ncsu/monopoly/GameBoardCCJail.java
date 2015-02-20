package edu.ncsu.monopoly;

public class GameBoardCCJail extends GameBoard {

	public GameBoardCCJail() {
		super();

		Card ccCard1 = new JailCard(Card.TYPE_CC);

		addCard(ccCard1);

		addCell(cc1);
		addCell(blue1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);

	}
}
