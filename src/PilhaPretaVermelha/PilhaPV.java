package PilhaPretaVermelha;

public class PilhaPV implements PilhaTrab{
	private Object data[];
	private int tv = -1;
	private int tp;

	public PilhaPV(int tam){
		data = new Object[tam];
		tp = tam;
	}
	
	public int size() {
		return data.length;
	}

	public boolean isEmpty() {
		if(tv == -1) {
			return true;
		}else {
			return false;
		}
	}

	public Object topVermelho() throws EPilhaError {
		return data[tv];
	}
	
	public Object topPreto() throws EPilhaError {
		return data[tp];
	}

	public void pushVermelho(Object o) {
		if(tv+tp == data.length) {
			Object a[] = new Object[data.length*2];
			for(int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			data = a;
		}
		tv++;
		data[tv] = o;
	}
	
	public void pushPreto(Object o) {
		if(tp+tv == data.length) {
			Object a[] = new Object[data.length*2];
			for(int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			data = a;
		}
		tp--;
		data[tp] = o;
	}

	public Object popVermelho() throws EPilhaError {
		if(isEmpty()) {
			throw new EPilhaError("Pilha Vazia");
		}
		Object temp = data[tv];
		data[tv] = null;
		tv--;
		return temp;
	}
	
	public Object popPreto() throws EPilhaError {
		if(isEmpty()) {
			throw new EPilhaError("Pilha Vaza");
		}
		Object temp = data[tp];
		data[tp] = null;
		tp++;
		return temp;
	}
	
	public void showPilha(PilhaPV pp) {
		System.out.print("[");
		for(int i = 0; i < (pp.tv + pp.tp + 1); i++) {
			System.out.print(" " + pp.data[i]);
		}
		System.out.println(" ]");
	}
}
