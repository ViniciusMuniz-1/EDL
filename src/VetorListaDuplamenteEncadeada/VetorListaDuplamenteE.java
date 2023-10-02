package VetorListaDuplamenteEncadeada;

public class VetorListaDuplamenteE {
	private int size;
	private No first;
	private No last;
	
	public VetorListaDuplamenteE(int tam) {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public Object elemAtRank(int r) {
		No atual = first.next;
		for(int i = 0; i < r; i++) {
			atual = atual.next;
		}
		return atual.data;
	}
	
	public Object replaceAtRank(int r, Object o) {
		No atual = first.next;
		for(int i = 0; i < r; i++) {
			atual = atual.next;
		}
		Object temp = atual.data;
		atual.data = o;
		return temp;
	}
	
	public void insertAtRank(int r, Object o) {
		No novoNo = new No(o);
		if(first == null) {
			first =  new No(null);
			last =  new No(null);
			first.next = novoNo;
			last.prev = novoNo;
			novoNo.prev = first;
			novoNo.next = last;
		}
		else if(r == 0) {
			novoNo.next = first.next;
			first.next = novoNo;
		} else {
			No atual = first.next;
			for(int i = 0; i < r; i++) {	
				atual = atual.next;
			}
			novoNo.prev = atual.prev; //o anterior do a ser inserido é o atual encontrado no laço
			novoNo.next = atual; 	  //o próximo do a ser inserido é o atual
			atual.prev.next = novoNo; //o novo próximo do anterior do atual é o elemento a ser inserido
			atual.prev = novoNo;	  //e o anterior do atual é o valor a ser inserido
			//loucura
		}	
		size++;
	}
	
	public Object removeAtRank(int r){
		No atual = first.next;
		for(int i = 0; i < r; i++) {
			atual = atual.next;
		}
		
		atual.prev.next = atual.next;
		atual.next.prev = atual.prev;
		size--;
		
		return atual.data;
	}
	
	public void showVetor(VetorListaDuplamenteE vv) {
		No atual = first.next;
		System.out.print("[ ");
		for(int i = 0; i < vv.size(); i++) {
			System.out.print(atual.data);
			atual = atual.next;
			if(atual.data == null) {
				break;
			}
			if(i+1 != vv.size()) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
	}
	
}
