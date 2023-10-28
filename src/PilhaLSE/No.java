package PilhaLSE;

public class No {
	private Object data;
	private No next;

    public No(Object elemento) {
        this.data = elemento;
        this.setNext(null);
    }

    public String toString() {
        return " "+ this.data;
    }

	public No getNext() {
		return next;
	}

	public void setNext(No next) {
		this.next = next;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data= data;
	}
}
