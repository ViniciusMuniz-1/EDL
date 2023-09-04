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
		if(tv+1 == tp) {
			data = increaseCapacity(data, tv, tp);
		}
		tv++;
		data[tv] = o;
	}
	
	public void pushPreto(Object o) {
		if(tv+1 == tp) {
			data = increaseCapacity(data, tv, tp);
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
	
	public Object[] increaseCapacity(Object data[], int tv, int tp) {
		Object a[] = new Object[data.length*2];
		int cont = a.length-1;
		for(int i = 0; i <= tv; i++) {
			a[i] = data[i];
		}
		for(int k = data.length-1; k >= tp; k--) {
			a[cont] = data[k];
			cont--;
		}
		data = a;
		return data;
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
		for(int i = 0; i < (pp.data.length); i++) {
			System.out.print(" " + pp.data[i]);
		}
		System.out.println(" ]");
	}
}
