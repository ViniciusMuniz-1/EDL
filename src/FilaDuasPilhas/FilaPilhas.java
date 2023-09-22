package FilaDuasPilhas;

import FilaArrayCircular.EFilaVazia;

public class FilaPilhas {
	static PilhaArray pilhaPrincipal;
	int tam;
	
	public FilaPilhas(int tam) {
		this.tam = tam;
		pilhaPrincipal = new PilhaArray(tam);
	}
	
	public int size() {
		return pilhaPrincipal.size();
	}
	
	public boolean isEmpty() {
		return pilhaPrincipal.isEmpty();
	}
	
	public Object inicio() {
		PilhaArray pilhaAux = invertePilha(pilhaPrincipal);
		return pilhaAux.top();
	}
	
	public void enqueue(Object o) {
		if(pilhaPrincipal.size() == tam) {
			int novoTam = tam*2;
			PilhaArray newPilhaPrincipal = new PilhaArray(novoTam);
			PilhaArray pilhaAux = invertePilha(pilhaPrincipal);
			for(int i = 0; i < size(); i++) {
				newPilhaPrincipal.push(pilhaAux.top());
				pilhaAux.pop();
			}
			tam = novoTam;
			pilhaPrincipal = newPilhaPrincipal;
		}
		pilhaPrincipal.push(o);
	}
	
	public Object dequeue() {
		Object o;
		if(pilhaPrincipal.isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		}
		PilhaArray pilhaAux = invertePilha(pilhaPrincipal);
		o = pilhaAux.top();
		pilhaAux.pop();
		pilhaPrincipal = invertePilha(pilhaAux);
		return o;
	}
	
	public void showFila(FilaPilhas ff) {
		PilhaArray pilhaAux = invertePilha(pilhaPrincipal);
		System.out.print("[");
		for(int i = 0; i < size(); i++) {
			System.out.print(" " + pilhaAux.top());
			pilhaAux.pop();
		}
		System.out.println(" ]");
	}
	
	public PilhaArray invertePilha(PilhaArray pp) {
		PilhaArray pilhaAux = new PilhaArray(pp.size());
		
		while (!pp.isEmpty()) {
	        pilhaAux.push(pp.top());
	        pp.pop();
	    }
		
		return pilhaAux;
	}
}
