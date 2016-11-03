package interfaces;

import interfaces.model.AddModel;
import interfaces.model.Model;

public class Controller {
	private final Model model;
	private final Window window;
	
	Controller() {
		window = new Window(this);
		model = new AddModel(this);
	}

	public Model getModel() {
		return model;
	}
}
