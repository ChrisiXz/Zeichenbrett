
package Kern;

import java.awt.Graphics;

/**
 * Drawable ist die Abstrakte Überklasse für die Klassen Linie, Oval und Polygon 
 * mit den abstrakten Methoden draw und clone
 * @author Christoph
 *
 */

public abstract class Drawable {
	

	
	
	public abstract void draw(Graphics g);
	
	public abstract Drawable clone();
}
