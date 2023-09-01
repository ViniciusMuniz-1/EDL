package Pilha;

public class PilhaArray implements Pilha{
	private int t = -1;
	private Object data[];
	
	public PilhaArray(int tam){
		data = new Object[tam];
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
		return data[t];
	}

	public void push(Object o) {
		if(t == data.length) {
			Object a[] = new Object[data.length*2];
			for(int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			data = a;
		}
		t++;
		data[t] = o;
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
	
}
