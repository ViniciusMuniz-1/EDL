package SequenciaLDE;

public class SequenciaLDE implements Sequencia {
	private int size;
	private No first;
	private No last;
	
	public SequenciaLDE() {
		this.setSize(0);
		this.first = new No(null);
		this.last = new No(null);
		this.first.setNext(last);
		this.last.setPrev(first);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int size() {
		return this.getSize();
	}
	
	public boolean isEmpty() {
		return this.getSize() == 0 ? true : false;
	}
	
	public void showSequencia(Sequencia ss) {
		No atual = this.first.getNext();
		System.out.print("[ ");
		for(int i = 0; i < ss.size(); i++) {
			System.out.print(atual.getData());
			atual = atual.getNext();
			if(atual.getData() == null) {
				break;
			}
			if(i+1 != ss.size()) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
		System.out.println();
	}
	
	//-------------------------------------------------------
	//MÉTODOS DO VETOR:
	
	public Object elemAtRank(int rank) {
		No atual = this.first.getNext();
		for(int i = 0; i < rank; i++) {
			atual = atual.getNext();
		}
		
		return atual.getData();
	}
	
	public Object replaceAtRank(int rank, Object element) {
		No atual = this.first.getNext();
		for(int i = 0; i < rank; i++) {
			atual = atual.getNext();
		}
		
		Object temp = atual.getData();
		atual.setData(element);
		
		return temp;
	}
	
	public void insertAtRank(int rank, Object element) {
		No novoNo = new No(element);
		No atual = this.first.getNext();
		for(int i = 0; i < rank; i++) {
			atual = atual.getNext();
		}
		
		novoNo.setNext(atual);
		novoNo.setPrev(atual.getPrev());
		atual.getPrev().setNext(novoNo);
		atual.setPrev(novoNo);
		
		size++;
	}
	
	public void removeAtRank(int rank) {
		No atual = this.first.getNext();
		for(int i = 0; i < rank; i++) {
			atual = atual.getNext();
		}
		
		atual.getPrev().setNext(atual.getNext());
		atual.getNext().setPrev(atual.getPrev());
		
		atual.setNext(null);
		atual.setPrev(null);
		size--;
	}
	//-------------------------------------------------------
	//-------------------------------------------------------
	//MÉTODOS DA LISTA:
	
	public Object first() {
		return first.getNext().getData();
	}
	
	public Object last() {
		return last.getPrev().getData();
	}
	
	public Object before(No node) {
		return node.getPrev().getData();
	}
	
	public Object after(No node) {
		return node.getNext().getData();
	}
	
	public Object replaceElement(No node, Object element) {
		Object temp = node.getData();
		node.setData(element);
		return temp;
	}
	
	public void swapElements(No node1, No node2) {
		Object temp = node1.getData();
		node1.setData(node2.getData());
		node2.setData(temp);
	}
	
	public void insertBefore(No node, Object element) {
		No novoNo = new No(element);
		
		node.getPrev().setNext(novoNo);
		novoNo.setPrev(node.getPrev());
		node.setPrev(novoNo);
		novoNo.setNext(node);
		
		size++;
	}
	
	public void insertAfter(No node, Object element) {
		No novoNo = new No(element);
		
		node.getNext().setPrev(novoNo);
		novoNo.setNext(node.getNext());
		node.setNext(novoNo);
		novoNo.setPrev(node);
		
		size++;
	}
	
	public void insertFirst(Object element) {
		No novoNo = new No(element);
		
		novoNo.setNext(first.getNext());
		first.getNext().setPrev(novoNo);
		novoNo.setPrev(first);
		first.setNext(novoNo);
		
		size++;
	}
	
	public void insertLast(Object element) {
		No novoNo = new No(element);
		
		novoNo.setPrev(last.getPrev());
		last.getPrev().setNext(novoNo);
		novoNo.setNext(last);
		last.setPrev(novoNo);
		
		size++;
	}
	
	public void remove(No node) {
		node.getPrev().setNext(node.getNext());
		node.getNext().setPrev(node.getPrev());
		
		node.setNext(null);
		node.setPrev(null);
	}
	
	public No searchNode(Object element) {
		No atual = first.getNext();
		while(atual.getData() != element) {
			atual = atual.getNext();
		}
		
		return atual;
	}
	//-------------------------------------------------------
	//-------------------------------------------------------
	//MÉTODOS PONTE:
	public No atRank(int rank) {
		No node;
		if(rank <= size()/2) {
			node = first.getNext();
			for(int i = 0; i < rank; i++) {
				node = node.getNext();
			}
		} else {
			node = last.getPrev();
			for(int i = 0; i < size()-rank-2; i++) {
				node = node.getPrev();
			}
		}
		
		return node;
	}
	
	public int rankOf(No node) {
		No nodeVer = first.getNext();
		int rank = 0;
		while(node != nodeVer && node != last) {
			nodeVer = nodeVer.getNext();
			rank++;
		}
		
		return rank;
	}
}
