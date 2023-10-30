package ArvoreGenerica;

import java.util.ArrayList;
import java.util.Iterator;


public class No {
	private Object element;
	private No father;
	private ArrayList<No> children = new ArrayList<No>();
	
	public No(No father, Object element){
		this.father = father;
		this.element = element;
	}
	
	//-------------------------------------------------
	//GETTERS AND SETTERS:
	
	public Object getElement(){
		return this.element;
	}
	
	public No getFather() {
		return this.father;
	}
	
	public void setElement(Object element){
		this.element = element;
	}
	
	public void setFather(No father) {
		this.father = father;
	}
	
	//-------------------------------------------------
	
	public void addChild(No o){
		children.add(o);
	}
	
	public void removeChild(No o){
		children.remove(o);
	}
	
	public int childrenNumber(){
		return children.size();
	}
	
	public Iterator<No> children(){
		return children.iterator();
	}
}
