package SequenciaLDE;

public class SequenciaLDE {
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
	
	//-------------------------------------------------------
}
