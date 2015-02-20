
package edu.ncsu.monopoly;

public class GameBoardFreeParking extends GameBoard {
	public GameBoardFreeParking() {
		super();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
