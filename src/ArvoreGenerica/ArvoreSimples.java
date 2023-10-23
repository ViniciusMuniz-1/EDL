package ArvoreGenerica;

import java.util.Iterator;

public class ArvoreSimples {
	private No raiz;
	private int size;
	
	public ArvoreSimples(Object elem) {
		No raiz = new No(elem);
	}
	
	//-------------------------------------------------------------
	//MÉTODOS GENÉRICOS:
	
	public int size() {
		return this.getSize();
	}
	
	public int height(No no) {
		if(isExternal(no)) {
			return 0;
		} else {
			int h = 0;
			for(No item : no.getFilhos()) {
				h = Math.max(h, height(item));
			}
			return 1+h;
		}
	}
	
	public boolean isEmpty() {
		return this.getSize() == 0 ? true : false;
	}
	
	public Iterator elements() {
		
	}
	
	public Iterator nos() {
		
	}
	
	//-------------------------------------------------------------
	
	//-------------------------------------------------------------
	//MÉTODOS DE ACESSO:
	
	public No root() {
		return this.getRaiz();
	}
	
	public No parent(No no) {
		return no.getPai();
	}
	
	public Iterator<No> children(No no) {
		Iterator<No> it = no.getFilhos().iterator();
		return it;
	}
	
	//-------------------------------------------------------------
	
	//-------------------------------------------------------------
	//MÉTODOS DE CONSULTA:
	
	public boolean isInternal(No no) {
		return no.getFilhos().isEmpty() == false ? true : false;
	}
	
	public boolean isExternal(No no) {
		return no.getFilhos().isEmpty() == true ? true : false;
	}
	
	public boolean isRoot(No no) {
		return no.getPai() == null ? true : false;
	}
	
	public int depth(No no) {
		if(isRoot(no)) {
			return 0;
		} else {
			return 1+depth(no.getPai());
		}
	}
	//-------------------------------------------------------------
	
	
	//-------------------------------------------------------------
	//MÉTODOS DE ATUALIZAÇÃO:
	
	public Object replace(No no) {
		
	}
	
	//-------------------------------------------------------------
	//MÉTODOS ADICIONAIS:
	
	public void addNo(No no) {
		
	}
	
	public Object removeNo(No no) {
		
	}
	
	//-------------------------------------------------------------
	//Getter and Setters:
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	//-------------------------------------------------------------
	
}
