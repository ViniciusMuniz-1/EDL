package SequenciaLDE;

public class No {
	private Object data;
	private No next;
	private No prev;
	
	public No(Object elemento) {
	   this.setData(elemento);
	   this.setNext(null);
	   this.setPrev(null);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public No getNext() {
		return next;
	}

	public void setNext(No next) {
		this.next = next;
	}

	public No getPrev() {
		return prev;
	}

	public void setPrev(No prev) {
		this.prev = prev;
	}
}
