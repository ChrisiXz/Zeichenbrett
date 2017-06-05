package Kern;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collection;

public class Controller implements MouseListener{

	private static Controller controllerInstance = null;
	
	private Controller(){
		
	}
	
	public void refresh(){
		Panel.instance().repaint();
	}
	
	public Collection<Drawable> getDrawables(){
		return Model.instance().getElements();
	}
	
	
	public static Controller instance(){
		if(controllerInstance == null){
			controllerInstance = new Controller();
		}
		return controllerInstance;
	}

	public void draw(int x1, int y1, int x2, int y2){
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
