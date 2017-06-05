package Kern;

import java.util.Collection;
import java.util.Stack;

public class Model {
	
	private static Model modelInstance = null;
	
	private Stack<Drawable> elements;
	private Stack<Drawable> redo;
	
	private Model(){
		this.elements = new Stack<>();
		this.redo = new Stack<>();
	}
	
	public void add(Drawable d){
		elements.push(d);
		redo.clear();
	}
	
	
	public void undo(){
		if(!elements.isEmpty()){
			redo.push(elements.pop());	
		}
	}
	
	public void redo(){
		if(!redo.isEmpty()){
			elements.push(redo.pop());	
		}
	}
	
	public Collection<Drawable> getElements(){
		return this.elements;
	}
	
	public static Model instance() {
		
		if(modelInstance == null) {
			modelInstance = new Model();
		}
		
		return modelInstance;
	}
}
