package FilaArrayCircular;

public class FilaArray implements Fila{
	private int tam;
	private int init;
	private int last;
	private Object data[];
	
	public FilaArray(int tam) {
		this.tam = tam;
		data = new Object[tam];
	}

	public int size() {
		return (tam-init+last)%tam;
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
		if(size() == tam-1) {
			int novoTam = tam*2;
			Object[] newData = new Object[novoTam];
			int ii = init;
			for(int ff = 0; ff < size(); ff++) {
				newData[ff] = data[ii];
				ii=(ii+1)%tam;
			}
			last = size();
			init = 0;
			tam = novoTam;
		}
		data[last] = o;
		last = (last+1)%tam;
	}
	
	public Object dequeue() {
		Object o;
		if(isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		}
		o = data[init];
		data[init] = null;
		init = (init+1)%tam;
		return o;
	}
	
	public void showFila(FilaArray ff) {
		System.out.print("[");
		for(int i = 0; i < ff.tam; i++) {
			System.out.print(" " + ff.data[i]);
		}
		System.out.println(" ]");
	}
}
