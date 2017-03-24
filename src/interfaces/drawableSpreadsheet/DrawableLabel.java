package interfaces.drawableSpreadsheet;

import java.awt.Graphics;

import Spreadsheet.ItemLabel;

public class DrawableLabel<T> extends ItemLabel<T> implements Drawable {

	public DrawableLabel(T content) {
		super(content);
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
