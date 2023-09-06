package Fila;

public class FilaArray {
	private int init;
	private int last;
	private Object data[];
	
	public int size() {
		return (data.length-init+last)%data.length;
	}
	
	public boolean isEmpty() {
		if(init == last) {
			return true;
		}else {
			return false;
		}
	}
	
	public Object first() {
		return data[last-1];
	}
	
	public void enqueue(Object o) {
		data[init-1] = o;
		init--;
	}
	
	public Object dequeue() {
		Object temp = data[last-1];
		data[last-1] = null;
		last--;
		return temp;
	}
	
	public void enfileirar(Object o) throws EFilaCheia {
		if(size() == data.length-1) {
			throw new EFilaCheia("Fila cheia");
		} else {
			
		}
	}
}
