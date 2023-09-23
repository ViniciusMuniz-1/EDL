package PilhaDuasFilas;

public class PilhaArray implements Pilha{
	static FilaArray filaPrincipal;
	private int t = -1;
	
	
	public PilhaArray(int tam){
		filaPrincipal = new FilaArray(tam);
	}
	
	public int size() {
		return filaPrincipal.size();
	}

	public boolean isEmpty() {
		return filaPrincipal.isEmpty();
	}

	public Object top() throws EPilhaVazia {
		FilaArray filaAux = inverteFila(filaPrincipal);
		return filaAux.inicio();
	}

	public void push(Object o) {
		if(t+1 == filaPrincipal.size()) {
			FilaArray newFila = new FilaArray(filaPrincipal.size()*2);
			FilaArray filaAux = inverteFila(filaPrincipal);
			for(int i = 0; i < filaPrincipal.size(); i++) {
				newFila.enqueue(filaAux.inicio());
				filaAux.dequeue();
			}
			filaPrincipal = newFila;
		}
		t++;
		filaPrincipal.enqueue(o);
	}

	public Object pop() throws EPilhaVazia {
		if(isEmpty()) {
			throw new EPilhaVazia("Pilha Vazia");
		}
		FilaArray filaAux = inverteFila(filaPrincipal);
		Object o = filaAux.inicio();
		filaAux.dequeue();
		filaPrincipal = inverteFila(filaAux);
		return o;
	}
	
	public void showPilha(PilhaArray pp) {
		FilaArray filaAux = inverteFila(filaPrincipal);
		System.out.print("[");
		for(int i = 0; i < pp.t+1; i++) {
			System.out.print(" " + filaAux.inicio());
			filaAux.dequeue();
		}
		System.out.println(" ]");
	}
	
	public void empty(PilhaArray pp) {
		if(isEmpty()) {
			throw new EPilhaVazia("Pilha vazia");
		}
		t = -1;
	}
	
	public FilaArray inverteFila(FilaArray ff) {
		FilaArray filaAux = new FilaArray(ff.size());
	    FilaArray ffCopy = new FilaArray(ff.size());
	    int size = ff.size();
		Object elementos[] = new Object[size];
	    int cont = 0;
	    while(!ff.isEmpty()) {
	    	elementos[cont] = ff.inicio();
	    	ffCopy.enqueue(ff.inicio());
	    	ff.dequeue();
	    	cont++;
	    }
	    
	    for(int i = cont-1; i>=0; i--) {
	    	filaAux.enqueue(elementos[i]);
	    }
	    
	    while (!ffCopy.isEmpty()) {
	        Object elemento = ffCopy.inicio();
	        ff.enqueue(elemento);
	        ffCopy.dequeue();
	    }

	    return filaAux;
	}
}
