package edu.ncsu.monopoly;

import java.util.ArrayList;
import java.util.Hashtable;

public class GameBoard {

	private ArrayList cells = new ArrayList();
	private ArrayList chanceCards = new ArrayList();
	// the key of colorGroups is the name of the color group.
	private Hashtable colorGroups = new Hashtable();
	private ArrayList communityChestCards = new ArrayList();
	private GameMaster gameMaster;
	protected PropertyCell blue1 = new PropertyCell();
	protected PropertyCell blue2 = new PropertyCell();
	protected PropertyCell blue3 = new PropertyCell();
	protected PropertyCell green1 = new PropertyCell();
	protected PropertyCell green2 = new PropertyCell();

	protected CardCell cc1 = new CardCell(Card.TYPE_CC, "Community Chest 1");
	protected JailCell jail = new JailCell();
	protected CardCell chance1 = new CardCell(Card.TYPE_CHANCE, "Chance 1");

	protected RailRoadCell rr1 = new RailRoadCell();
	protected RailRoadCell rr2 = new RailRoadCell();
	protected RailRoadCell rr3 = new RailRoadCell();
	protected RailRoadCell rr4 = new RailRoadCell();

	protected GoToJailCell goToJail = new GoToJailCell();
	protected IOwnable freeParking = new FreeParkingCell();

	public GameBoard() {
		IOwnable go = new GoCell();

		initPropertyCells();
		initRailRoadCells();
		addCell(go);
	}

	protected void initRailRoadCells() {

		rr1.setName("Railroad A");
		rr2.setName("Railroad B");
		rr3.setName("Railroad C");
		rr4.setName("Railroad D");
		RailRoadCell.setPrice(200);
		RailRoadCell.setBaseRent(25);
	}

	private void initPropertyCells() {
		blue1.setName("Blue 1");
		blue2.setName("Blue 2");
		blue3.setName("Blue 3");
		blue1.setColorGroup("blue");
		blue2.setColorGroup("blue");
		blue3.setColorGroup("blue");
		blue1.setPrice(100);
		blue2.setPrice(100);
		blue3.setPrice(120);
		blue1.setRent(10);
		blue2.setRent(10);
		blue3.setRent(10);
		blue1.setHousePrice(50);
		blue2.setHousePrice(50);
		blue3.setHousePrice(50);
		green1.setName("Green 1");
		green2.setName("Green 2");
		green1.setColorGroup("green");
		green2.setColorGroup("green");
		green1.setPrice(200);
		green2.setPrice(240);
		green1.setRent(20);
		green2.setRent(20);
		green1.setHousePrice(70);
		green2.setHousePrice(70);
	}

	public void addCard(Card card) {
		if (card.getCardType() == Card.TYPE_CC) {
			communityChestCards.add(card);
		} else {
			chanceCards.add(card);
		}
	}

	public void addCell(IOwnable cell) {
		cells.add(cell);
	}

	public void addCell(PropertyCell cell) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup);
		colorGroups.put(colorGroup, new Integer(propertyNumber + 1));
		cells.add(cell);
	}

	public Card drawCCCard() {
		Card card = (Card) communityChestCards.get(0);
		communityChestCards.remove(0);
		addCard(card);
		return card;
	}

	public Card drawChanceCard() {
		Card card = (Card) chanceCards.get(0);
		chanceCards.remove(0);
		addCard(card);
		return card;
	}

	public Cell getCell(int newIndex) {
		return (Cell) cells.get(newIndex);
	}

	public int getCellNumber() {
		return cells.size();
	}

	public PropertyCell[] getPropertiesInMonopoly(String color) {
		PropertyCell[] monopolyCells = new PropertyCell[getPropertyNumberForColor(color)];
		int counter = 0;
		for (int i = 0; i < getCellNumber(); i++) {
			IOwnable c = getCell(i);
			if (c instanceof PropertyCell) {
				PropertyCell pc = (PropertyCell) c;
				if (pc.getColorGroup().equals(color)) {
					monopolyCells[counter] = pc;
					counter++;
				}
			}
		}
		return monopolyCells;
	}

	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer) colorGroups.get(name);
		if (number != null) {
			return number.intValue();
		}
		return 0;
	}

	public Cell queryCell(String string) {
		for (int i = 0; i < cells.size(); i++) {
			Cell temp = (Cell) cells.get(i);
			if (temp.getName().equals(string)) {
				return temp;
			}
		}
		return null;
	}

	public int queryCellIndex(String string) {
		for (int i = 0; i < cells.size(); i++) {
			Cell temp = (Cell) cells.get(i);
			if (temp.getName().equals(string)) {
				return i;
			}
		}
		return -1;
	}

	public void removeCards() {
		communityChestCards.clear();
	}

}
