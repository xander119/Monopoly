package edu.ncsu.monopoly;

public class GameBoardRailRoad extends GameBoard {
	RailRoadCell rr1, rr2, rr3, rr4;
	PropertyCell  green1, green2;

	public GameBoardRailRoad() {
		super();
		initRailRoadCells();
		initPropertyCell();
		GoToJailCell goToJail = new GoToJailCell();
		IOwnable freeParking = new FreeParkingCell();

		addCell(rr1);
		addCell(blue1);
		addCell(jail);
		addCell(rr2);
		addCell(blue2);
		addCell(freeParking);
		addCell(green1);
		addCell(rr3);
		addCell(goToJail);
		addCell(green2);
		addCell(rr4);
	}

	private void initPropertyCell() {
		green1 = new PropertyCell();
		green2 = new PropertyCell();

		blue1.setName("Blue 1");
		blue2.setName("Blue 2");
		green1.setName("Green 1");
		green2.setName("Green 2");

		blue1.setColorGroup("blue");
		blue2.setColorGroup("blue");
		green1.setColorGroup("green");
		green2.setColorGroup("green");

		blue1.setPrice(100);
		blue2.setPrice(100);
		green1.setPrice(200);
		green2.setPrice(240);

		blue1.setRent(10);
		blue2.setRent(10);
		green1.setRent(20);
		green2.setRent(20);

		blue1.setHousePrice(50);
		blue2.setHousePrice(50);
		green1.setHousePrice(70);
		green2.setHousePrice(70);
	}

	private void initRailRoadCells() {
		rr1 = new RailRoadCell();
		rr2 = new RailRoadCell();
		rr3 = new RailRoadCell();
		rr4 = new RailRoadCell();
		rr1.setName("Railroad A");
		rr2.setName("Railroad B");
		rr3.setName("Railroad C");
		rr4.setName("Railroad D");
		RailRoadCell.setPrice(200);
		RailRoadCell.setBaseRent(25);
	}
}
