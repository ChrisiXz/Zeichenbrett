package Kern;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class Panel extends JPanel{

	private static Panel panelInstance = null;
	private Drawable temp = null;
	
	
	private Panel(){

	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
		for(Drawable d: Controller.instance().getDrawables()){
			d.draw(g);
			repaint();
		}
		
		if(temp != null){
			temp.draw(g);
			temp = null;
		}
		
	}
	
	public static Panel instance() {
		
		if(panelInstance == null) {
			panelInstance = new Panel();
		}
		
		return panelInstance;
	}
}
