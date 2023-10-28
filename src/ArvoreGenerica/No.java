package ArvoreGenerica;

import java.util.ArrayList;


public class No {
	private Object element;
	private No pai;
	private ArrayList<No> filhos = new ArrayList<>();
	
	public No(Object elem) {
		this.setElement(elem);
	}
	
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	
	public No getPai() {
		return pai;
	}
	public void setPai(No pai) {
		this.pai = pai;
	}
	
	public ArrayList<No> getFilhos() {
		return filhos;
	}
	public void setFilhos(ArrayList<No> filhos) {
		this.filhos = filhos;
	}
	
}
