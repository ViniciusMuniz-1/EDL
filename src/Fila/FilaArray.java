package Fila;

import Pilha.PilhaArray;

public class FilaArray implements Fila{
	private int size;
	private int init;
	private int last;
	private Object data[];
	
	public FilaArray(int tam) {
		size = tam;
		data = new Object[tam];
	}

	public int size() {
		return (size-init+last)%size;
	}
	
	public boolean isEmpty() {
		if(init == last) {
			return true;
		}else {
			return false;
		}
	}
	
	public Object inicio() {
		if(isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		}
		return data[init];
	}
	
	public void enqueue(Object o) {
		if(size() == size-1) {
			throw new EFilaCheia("Fila cheia");
		} else {
			data[last] = o;
			last = (last+1)%size;
		}
	}
	
	public Object dequeue() {
		Object o;
		if(isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		} else {
			o = data[init];
			data[init] = null;
			init = (init+1)%size;
		}
		return o;
	}
	
	public void showFila(FilaArray ff) {
		System.out.print("[");
		for(int i = 0; i < ff.size; i++) {
			System.out.print(" " + ff.data[i]);
		}
		System.out.println(" ]");
	}
}
