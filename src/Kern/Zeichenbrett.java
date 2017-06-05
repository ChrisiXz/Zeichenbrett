package Kern;

public class Zeichenbrett {

	public static void main(String[] args){
		 
		Model.instance().add(new Linie(100,10,200,20));
		Model.instance().add(new Oval(50,100,150,200));
		
		View.instance();
	}
}
