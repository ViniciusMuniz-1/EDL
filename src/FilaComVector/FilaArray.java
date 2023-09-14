package FilaComVector;

import java.util.Vector;

public class FilaArray implements Fila{
	private Vector<Object> data;
	
	public FilaArray(int tam) {
		data = new Vector<>(tam);
	}

	public int size() {
		return data.size();
	}
	
	public boolean isEmpty() {
		if(data.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Object inicio() {
		if(isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		}
		return data.elementAt(0);
	}
	
	public void enqueue(Object o) {
		data.add(o);
	}
	
	public Object dequeue() {
		Object o;
		if(isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		} else {
			o = data.elementAt(0);
			data.remove(0);
		}
		return o;
	}
	
	public void showFila(FilaArray ff) {
		System.out.print("[");
		for(int i = 0; i < ff.size(); i++) {
			System.out.print(" " + ff.data.get(i));
		}
		System.out.println(" ]");
	}
}
