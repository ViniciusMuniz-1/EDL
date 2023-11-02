package ArvoreGenerica;

import java.util.ArrayList;
import java.util.Iterator;

public class ArvoreSimples {
	private No raiz;
	private int tamanho;
	
	public ArvoreSimples(Object elem) {
		raiz = new No(null, elem);
		tamanho = 1;
	}
	
	//-------------------------------------------------------------
	//MÉTODOS GENÉRICOS:
	
	public int tamanho() {
		return this.getTamanho();
	}
	
	public int height(No no) {
		if(isExternal(no)) {
			return 0;
		} else {
			int h = 1;
			Iterator<No> it = no.children();
			while(it.hasNext()) {
				h = Math.max(h, height(it.next()));
			}
			return 1+h;
		}
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public Iterator<Object> elements() {
	    ArrayList<Object> elems = new ArrayList<Object>();
	    preOrderElements(raiz, elems);
	    return elems.iterator();
	}

	private void preOrderElements(No node, ArrayList<Object> elems) {
	    elems.add(node.getElement());

	    Iterator<No> it = node.children();
	    while (it.hasNext()) {
	        preOrderElements(it.next(), elems);
	    }
	}
	
	public Iterator<No> nos() {
	    ArrayList<No> nodes = new ArrayList<No>();
	    preOrderNodes(raiz, nodes);
	    return nodes.iterator();
	}

	private void preOrderNodes(No node, ArrayList<No> nodes) {
	    nodes.add(node);

	    Iterator<No> it = node.children();
	    while (it.hasNext()) {
	        preOrderNodes(it.next(), nodes);
	    }
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
		tamanho++;
	}
	
	public Object remove(No no){
		No pai = no.getFather();
		if (pai != null || isExternal(no))
			pai.removeChild(no);
		else
			System.out.println("Erro ao remover!");
		Object o = no.getElement();
		tamanho--;
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
	
	public void addNo(Object element, No father) {
		No newNode = new No(father, element);
		newNode.getFather().addChild(newNode);
	}
	
	public Object removeNo(No no) {
		return null;
	}
	
	public void preOrder(No node) {
		System.out.println(node.getElement());
		Iterator<No> it = node.children();
		while(it.hasNext()) {
			preOrder(it.next());
		}
	}
	
	public No searchNode(No node, Object elem) {
		if(node.getElement().equals(elem)) {
			return node;
		}
		
		Iterator<No> it = node.children();
		while(it.hasNext()) {
			No result = searchNode(it.next(), elem);
			if(result != null) {
				return result;
			}
		}
		
		return null;
	}
	
	//-------------------------------------------------------------
	//Getter and Setters:
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public No getRaiz() {
		return this.raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	//-------------------------------------------------------------
	
}
