package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
	private int size;
	private No first;
	private No last;
	
	public ListaDuplamenteEncadeada() {
		this.first = new No(null);
		this.last = new No(null);
		first.next = last;
		last.prev = first;
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
	
	public Object before(No node) {
		return node.prev.data;
	}
	
	public Object after(No node) {
		return node.next.data;
	}
	
	public Object replaceElement(No node, Object element) {
		Object temp = node.data;
		node.data = element;
		return temp;
	}
	
	public void swapElements(No node1, No node2) {
		Object temp = node1.data;
		node1.data = node2.data;
		node2.data = temp;
	}
	
	public void insertBefore(No node, Object element) {
		No novoNo = new No(element);
			
		node.prev.next = novoNo;
		novoNo.prev = node.prev;
		node.prev = novoNo;
		novoNo.next = node;
		
		size++;
	}
	
	public void insertAfter(No node, Object element) {
		No novoNo = new No(element);
		
		node.next.prev = novoNo;
		novoNo.next = node.next;
		node.next = novoNo;
		novoNo.prev = node;

		size++;
	}
	
	public void insertFirst(Object element) {
		No novoNo = new No(element);
		novoNo.next = first.next;
		first.next.prev = novoNo;
		novoNo.prev = first;
		first.next = novoNo;
		
		size++;
	}
	
	public void insertLast(Object element) {
		No novoNo = new No(element);
		novoNo.prev = last.prev;
		last.prev.next = novoNo;
		novoNo.next = last;
		last.prev = novoNo;
		
		size++;
	}
		
	public void remove(No node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
		
		node.prev = null;
		node.next = null;
		
		size--;
	}
	
	public No searchNode(Object element) {
		No atual = first.next;
		while(atual.data != element) {
			atual = atual.next;
		}
		
		return atual;
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
