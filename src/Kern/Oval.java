package Kern;

import java.awt.Graphics;

/**
 * Oval erbt von Drawable und erstellt in der Methode "draw" ein Oval mit den Werten die im Konstruktor 
 * von Oval angegeben werden. Die Klasse clone erstellt eine Tiefe Kopie von diesem Oval.
 * @author Christoph
 *
 */
public class Oval extends Drawable{
	
	private int hoehe;
	private int breite;
	private int x;
	private int y;
	
	
	
	public Oval(int hoehe, int breite, int x, int y){
		this.hoehe = hoehe;
		this.breite = breite;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(x, y, breite, hoehe);
		
	}
	
	
	

	@Override
	public Oval clone() {
		
		return new Oval(hoehe, breite, x, y);
	}

	
}
