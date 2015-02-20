
package edu.ncsu.monopoly;

public class GameBoardFreeParking extends GameBoard {
	public GameBoardFreeParking() {
		super();
		IOwnable freeParking = new FreeParkingCell();
		GoToJailCell goToJail = new GoToJailCell();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
