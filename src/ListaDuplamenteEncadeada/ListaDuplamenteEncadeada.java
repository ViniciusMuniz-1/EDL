package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
	private int size;
	private No first;
	private No last;
	
	public ListaDuplamenteEncadeada() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		 return size == 0 ? true : false;
	}
	
	public boolean isFirst(Object element) {
		return first.next.data == element ? true : false;
	}
	
	public boolean isLast(Object element) {
		return last.prev.data == element ? true : false;
	}
	
	public Object first() {
		return first.next.data;
	}
	
	public Object last() {
		return last.prev.data;
	}
	
	public Object before(int index) {
		No atual = first.next;
		for(int i = 0; i < index; i++) {
			atual = atual.next;
		}
		return atual.prev.data;
	}
	
	public Object after(int index) {
		No atual = first.next;
		for(int i = 0; i < index; i++) {
			atual = atual.next;
		}
		return atual.next.data;
	}
	
	public Object replaceElement(int index, Object element) {
		No atual = first.next;
		for(int i = 0; i < index; i++) {
			atual = atual.next;
		}
		
		Object temp = atual.data;
		atual.data = element;
		return temp;
	}
	
	public void swapElements(int index, int index2) {
		No element1 = first.next;
		for(int i = 0; i < index; i++) {
			element1 = element1.next;
		}
		
		No element2 = first.next;
		for(int i = 0; i < index2; i++) {
			element2 = element2.next;
		}
		
		Object temp = element1.data;
		element1.data = element2.data;
		element2.data = temp;
	}
	
	public void insertBefore(int index, Object element) {
		No novoNo = new No(element);
		if(first == null) {
			first =  new No(null);
			last =  new No(null);
			first.next = novoNo;
			last.prev = novoNo;
			novoNo.prev = first;
			novoNo.next = last;
		}else {
			No atual = first.next;
			for(int i = 0; i < index; i++) {
				atual = atual.next;
			}
			
			atual.prev.next = novoNo;
			novoNo.prev = atual.prev;
			atual.prev = novoNo;
			novoNo.next = atual;
		}
		size++;
	}
	
	public void insertAfter(int index, Object element) {
		No novoNo = new No(element);
		if(first == null) {
			first =  new No(null);
			last =  new No(null);
			first.next = novoNo;
			last.prev = novoNo;
			novoNo.prev = first;
			novoNo.next = last;
		} else {
			No atual = first.next;
			for(int i = 0; i < index; i++) {
				atual = atual.next;
			}
			
			atual.next.prev = novoNo;
			novoNo.next = atual.next;
			atual.next = novoNo;
			novoNo.prev = atual;
		}
		size++;
	}
	
	public void insertFirst(Object element) {
		No novoNo = new No(element);
		if(first == null) {
			first =  new No(null);
			last =  new No(null);
			first.next = novoNo;
			last.prev = novoNo;
			novoNo.prev = first;
			novoNo.next = last;
		} else {
			novoNo.next = first.next;
			novoNo.prev = first;
			first.next = novoNo;
		}
		size++;
	}
	
	public void insertLast(Object element) {
		No novoNo = new No(element);
		if(first == null) {
			first =  new No(null);
			last =  new No(null);
			first.next = novoNo;
			last.prev = novoNo;
			novoNo.prev = first;
			novoNo.next = last;
		}
		else {
			novoNo.prev = last.prev;
			last.prev.next = novoNo;
			novoNo.next = last;
			last.prev = novoNo;
		}		
		size++;
	}
		
	public void remove(int index) {
		No atual = first.next;
		for(int i = 0; i < index; i++) {
			atual = atual.next;
		}
		
		atual.prev.next = atual.next;
		atual.next.prev = atual.prev;
		
		size--;
	}
	
	public void showLista(ListaDuplamenteEncadeada ll) {
		No atual = first.next;
		System.out.print("[ ");
		for(int i = 0; i < ll.size(); i++) {
			System.out.print(atual.data);
			atual = atual.next;
			if(atual.data == null) {
				break;
			}
			if(i+1 != ll.size()) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
	}
}
