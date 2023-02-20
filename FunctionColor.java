import java.awt.Color;

public class FunctionColor {

	GUI gui;
	
	public FunctionColor(GUI gui)
	{
		this.gui=gui;
	} 
	public void Changecolor(String color) 
	{
		switch(color) {
		case "white":
			gui.window.getContentPane().setBackground(Color.WHITE);
			gui.textArea.setBackground(Color.white);
			gui.textArea.setForeground(Color.black);
		    break;
		    
		case "red":
			gui.window.getContentPane().setBackground(Color.red);
			gui.textArea.setBackground(Color.red);
			gui.textArea.setForeground(Color.white);
		    break;  
		    
		case "green":
			gui.window.getContentPane().setBackground(Color.green);
			gui.textArea.setBackground(Color.green);
			gui.textArea.setForeground(Color.black);
		    break; 
		    
	}
	}
}
