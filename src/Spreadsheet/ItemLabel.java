package Spreadsheet;

import java.util.HashMap;

public class ItemLabel<T>{
	
	public String name;
	private T content;
	
	public ItemLabel(String name, T content) {
		this.name = name;
		this.content = content;
	}
	
	public ItemLabel(T content) {
		name = "";
		this.content = content;
	}
	
	public T get() {
		return content;
	}
	
}
