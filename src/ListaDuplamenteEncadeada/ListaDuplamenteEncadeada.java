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
		return atual.data;
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
		for(int i = 0; i < index; i++) {
			element2 = element2.next;
		}
		
		Object temp = element1.data;
		element1.data = element2.data;
		element2.data = temp;
	}
	
	
}
