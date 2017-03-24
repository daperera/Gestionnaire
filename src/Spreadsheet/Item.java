package Spreadsheet;

import java.util.ArrayList;


public class Item {
	private final ArrayList<ItemLabel> itemLabels;
	
	public Item(ArrayList<ItemLabel> itemLabels) {
		this.itemLabels = itemLabels;
	}
	
	public Item() {
		this.itemLabels = new ArrayList<ItemLabel>();
	}
	
	public void AddLabel(ItemLabel label) {
		itemLabels.add(label);
	}
}
