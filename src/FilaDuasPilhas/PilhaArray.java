package FilaDuasPilhas;

import Pilha.EPilhaVazia;

public class PilhaArray implements Pilha{
	private int t = -1;
	private Object data[];
	
	public PilhaArray(int tam){
		data = new Object[tam];
	}
	
	public int size() {
		return getT()+1;
	}

	public boolean isEmpty() {
		if(getT() == -1) {
			return true;
		}else {
			return false;
		}
	}

	public Object top() throws EPilhaVazia {
		return data[getT()];
	}

	public void push(Object o) {
		if(getT()+1 == data.length) {
			Object a[] = new Object[data.length*2];
			for(int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			data = a;
		}
		setT(getT() + 1);
		data[getT()] = o;
	}

	public Object pop() throws EPilhaVazia {
		if(isEmpty()) {
			throw new EPilhaVazia("Pilha Vazia");
		}
		Object temp = data[getT()];
		data[getT()] = null;
		setT(getT() - 1);
		return temp;
	}
	
	public void showPilha(PilhaArray pp) {
		System.out.print("[");
		for(int i = 0; i < pp.getT()+1; i++) {
			System.out.print(" " + pp.data[i]);
		}
		System.out.println(" ]");
	}
	
	public void empty(PilhaArray pp) {
		if(isEmpty()) {
			throw new EPilhaVazia("Pilha vazia");
		}
		setT(-1);
	}

	public Object getDataEspecific(int i) {
		return data[i];
	}

	public void setDataEspecific(Object o, int index) {
		this.data[index] = o;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}
}
