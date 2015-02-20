package edu.ncsu.monopoly;

public class GameBoardUtility extends GameBoard {
	UtilityCell u1, u2;
public GameBoardUtility() {
		super();
		iniCells();
		

		addCell(rr1);
		addCell(blue1);
		addCell(jail);
		addCell(u1);
		addCell(blue2);
		addCell(freeParking);
		addCell(green1);
		addCell(rr3);
		addCell(goToJail);
		addCell(green2);
		addCell(u2);
	}

	private void iniCells() {
		u1 = new UtilityCell();
		u2 = new UtilityCell();


		u1.setName("Utility 1");
		u2.setName("Utility 2");
		UtilityCell.setPrice(150);

	}
}
