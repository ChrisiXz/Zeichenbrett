package Kern;

import java.awt.Graphics;

/**
 * Polygon erbt von Drawable und erstellt in der Methode "draw" ein Polygon mit den Werten die im Konstruktor 
 * von Polygon angegeben werden. Die Methode clone erstellt enine tiefe Kopie von dem Polygon.
 * @author Christoph
 *
 */

public class Polygon extends Drawable{
	
	private int[] xPoints;
	private int[] yPoints;
	private int nPoints;
	
	
	public Polygon(int[] x, int[] y, int n){
		
		this.xPoints = x;
		this.yPoints = y;
		this.nPoints = n;
	}
	
	
	@Override
	public void draw(Graphics g) {
		g.drawPolygon(xPoints, yPoints, nPoints);
	}

	@Override
	public Polygon clone() {
		return new Polygon(xPoints, yPoints, nPoints);
	}

}
