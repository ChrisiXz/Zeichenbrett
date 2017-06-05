package Kern;

import java.awt.Graphics;
/**
 * Linie erbt von Drawable und erstellt in der Methode "draw" eine Linie mit den Werten die im Konstruktor 
 * von Linie angegeben werden. Die Methode clone erstellt eine tiefe Kopie von der Linie.
 * @author Christoph
 *
 */
public class Linie extends Drawable{

	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	
	
	public Linie(int x1, int x2, int y1, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}

	@Override
	public Linie clone() {
		return new Linie(x1, x2, y1, y2);
	}

}
