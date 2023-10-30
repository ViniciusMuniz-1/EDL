package ArvoreGenerica;

import java.util.Iterator;

public class ArvoreSimples {
	private No raiz;
	private int size;
	
	public ArvoreSimples(Object elem) {
		No raiz = new No(null, elem);
		size = 1;
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
			for(No item : no.children()) {
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
		return no.getFather();
	}
	
	public Iterator<No> children(No v)
	{
		return v.children();
	}
	
	//-------------------------------------------------------------
	
	//-------------------------------------------------------------
	//MÉTODOS DE CONSULTA:
	
	public boolean isInternal(No no) {
		return no.childrenNumber() > 0;
	}
	
	public boolean isExternal(No no) {
		return no.childrenNumber() == 0;
	}
	
	public boolean isRoot(No no) {
		return no == raiz;
	}
	
	public void addChild(No no, Object element){
		No novo = new No(no, element);
		no.addChild(novo);
		size++;
	}
	
	public Object remove(No no){
		No pai = no.getFather();
		if (pai != null || isExternal(no))
			pai.removeChild(no);
		else
			System.out.println("Erro ao remover!");
		Object o = no.getElement();
		size--;
		return o;
	}
	
	public void swapElements(No v, No w)
	{
		/*Método que serve de exercício
		 * Este método deverá fazer com que o objeto
		 * que estava na posição v fique na posição w
		 * e fazer com que o objeto que estava na posição w
		 * fique na posição v
		 */  
		
	}
	
	public int profundidade(No node)
	{
		int profundidade = depth(node);
		return profundidade;
	}
	
	public int depth(No no) {
		if(isRoot(no)) {
			return 0;
		} else {
			return 1+depth(no.getFather());
		}
	}
	//-------------------------------------------------------------
	
	
	//-------------------------------------------------------------
	//MÉTODOS DE ATUALIZAÇÃO:
	
	public Object replace(No no, Object o) {
		Object temp = no.getElement();
		no.setElement(o);
		return temp;
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
