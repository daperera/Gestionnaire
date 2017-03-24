package Spreadsheet;

import java.util.ArrayList;

public class Table {
	private ArrayList<Item> items;
	
	public void add() {
		items.add(Template.loadDefaultItem());
	}
	
	
}
