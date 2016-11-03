package interfaces;

import java.awt.Dimension;

import javax.swing.JFrame;

import interfaces.menu.MenuBar;
import interfaces.model.Model;
import miscellaneous.Constantes;
import interfaces.Controller;

public class Window extends JFrame{
	private final WindowPanel windowPanel;
	private final Model model;
	
	public Window(Controller controller) {
		super();
		model = controller.getModel();
		setTitle("TPLabyr");
	    setPreferredSize(new Dimension(Constantes.defaultScreenWidth, Constantes.defaultScreenHeight));
	    setResizable(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    windowPanel = new WindowPanel(model);
	    setContentPane(windowPanel);
	    setJMenuBar(menuBar = new MenuBar(Controller));
	    setVisible(true);
	}
	
}
