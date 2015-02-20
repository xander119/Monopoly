package edu.ncsu.monopoly;

public class GameBoardCCGainMoney extends GameBoard {
	public GameBoardCCGainMoney() {
		super();

		Card ccCard1 = new MoneyCard("Win $50", 50, Card.TYPE_CC);
		Card chanceCard1 = new MoneyCard("Win $30", 30, Card.TYPE_CHANCE);

		addCard(ccCard1);
		addCard(chanceCard1);

		addCell(cc1);
		addCell(blue1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);

	}
}
