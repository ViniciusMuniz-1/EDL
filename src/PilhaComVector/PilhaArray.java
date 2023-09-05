package PilhaComVector;

import java.util.Vector;
import java.util.List;


public class PilhaArray implements Pilha{
	private int t = -1;
	private List<Object> data = new Vector<>();
	
	public PilhaArray(int tam){
		data = new Vector<>(tam);
	}
	
	public int size() {
		return t+1;
	}

	public boolean isEmpty() {
		if(t == -1) {
			return true;
		}else {
			return false;
		}
	}

	public Object top() throws EPilhaVazia {
		return data.lastElement();
	}

	public void push(Object o) {
		data.add(o);
	}

	public Object pop() throws EPilhaVazia {
		if(isEmpty()) {
			throw new EPilhaVazia("Pilha Vazia");
		}
		Object temp = data[t];
		data[t] = null;
		t--;
		return temp;
	}
	
	public void showPilha(PilhaArray pp) {
		System.out.print("[");
		for(int i = 0; i < pp.t+1; i++) {
			System.out.print(" " + pp.data[i]);
		}
		System.out.println(" ]");
	}
	
	public void empty(PilhaArray pp) {
		if(isEmpty()) {
			throw new EPilhaVazia("Pilha vazia");
		}
		t = -1;
	}
}
