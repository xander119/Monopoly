package edu.ncsu.monopoly;

public class SimpleGameBoard extends GameBoard {
	public SimpleGameBoard() {
		super();
		green1.setRent(1600);
		addCell(blue1);
		addCell(blue2);
		addCell(blue3);
		addCell(green1);
		addCell(green2);
	}

}
