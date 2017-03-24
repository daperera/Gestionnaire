package Spreadsheet;

import java.util.ArrayList;

public class Template {
	private final static ArrayList<String> labelNames = new ArrayList<String>();
	private final static  ArrayList<Object> defaultContent = new ArrayList<Object>();
	
	public Template() {
		loadFromFile();
	}
	
	public static Item loadDefaultItem() {
		Item temp = new Item();
		for(int n=0; n<labelNames.size(); n++) {
			temp.AddLabel(new ItemLabel(labelNames.get(n),defaultContent.get(n)));
		}
		return temp;
	}
	
	private void loadFromFile() {
		
	}
}
