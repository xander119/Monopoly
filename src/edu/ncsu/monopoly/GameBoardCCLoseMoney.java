package edu.ncsu.monopoly;


public class GameBoardCCLoseMoney extends GameBoard {
    public GameBoardCCLoseMoney() {
		super();
        
        Card ccCard1 = new MoneyCard("Pay $20", -20, Card.TYPE_CC);
		
		blue1.setName("Blue 1");
		blue2.setName("Blue 2");
		
		blue1.setColorGroup("blue");
		blue2.setColorGroup("blue");
		
		blue1.setPrice(100);
		blue2.setPrice(100);
		
		blue1.setRent(10);
		blue2.setRent(10);
		
		blue1.setHousePrice(50);
		blue2.setHousePrice(50);
		
		addCard(ccCard1);
		
		addCell(cc1);
		addCell(blue1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);
		
    }
}
