package interfaces;


import java.awt.Component;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDesktopPane;

import interfaces.model.Model;

public class WindowPanel extends JDesktopPane{
	
	private Model model;
	private final Map<String, Component> components;
	
	public WindowPanel(Model model) {
		super();
		this.model = model;
		components = new HashMap<String, Component>();
	}
	
	public void paintComponent(Graphics g) {
		if (model != null) {
			model.paintComponent(g);
		}
		else {
			super.paintComponent(g);
		}
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Component add(Component component, String componentName) {
		components.put(componentName, component);
		return add(component);
	}
	public Component get(String componentName) {
		return components.get(componentName);
	}
	public void remove(String componentName) {
		Component component = components.remove(componentName);
		if (component != null) {
			super.remove(component);
			System.out.println(componentName + " removed");
		}
		System.out.println("component not found");
	}
}
