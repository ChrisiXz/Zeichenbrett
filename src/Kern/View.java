package Kern;

/**
 * @author Christoph Kern
 * @verison 2016-09-15
 * Inizialisierung der Eingabe und des Sliders, erstellen des Frames und getNummer Methode
 */

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
	
	private static View viewInstance = null;
	
	
	//Konstruktor
	private View(){
		
		
		//Werte Setzen
		
		//JFrame erstellt
		this.setTitle("Anzeige-Fenster");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		//Hinzufügen und Platzieren des Eingabefelds und des Sliders
		this.add(Panel.instance());
		
		//Change und Key Listener für den Controller
		this.setVisible(true);
		
	}
	
	
	//Get Set Methoden
	
	
	
	public void istDasTextField(Object c){
		
	}
	//Macht das Textfeld zu einer Integer eingabe
	
	
	public static View instance() {
		
		if(viewInstance == null) {
			viewInstance = new View();
		}
		
		return viewInstance;
	}
	
}
