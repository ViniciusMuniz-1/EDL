package FilaDuasPilhas;

import FilaArrayCircular.EFilaVazia;

public class FilaPilhas {
	PilhaArray pilhaPrincipal;
	PilhaArray pilhaAux;
	int tam;
	
	public FilaPilhas(int tam) {
		this.tam = tam;
		pilhaPrincipal = new PilhaArray(tam);
		pilhaAux = new PilhaArray(tam);
		pilhaAux.setT(tam);
	}
	
	public int size() {
		return pilhaPrincipal.size();
	}
	
	public boolean isEmpty() {
		return pilhaPrincipal.isEmpty();
	}
	
	public Object inicio() {
		return pilhaPrincipal);
	}
	
	public void enqueue(Object o) {
		if(pilhaPrincipal.size() == tam) {
			int novoTam = tam*2;
			PilhaArray newPilhaPrincipal = new PilhaArray(novoTam);
			PilhaArray newPilhaAux = new PilhaArray(novoTam);
			for(int i = 0; i < size(); i++) {
				newPilhaPrincipal.setDataEspecific(pilhaPrincipal.getDataEspecific(i), i);
			}
			
			for(int i = size()-1; i >= 0; i++) {
				newPilhaAux.setDataEspecific(pilhaPrincipal.getDataEspecific(i), i);
			}
			
			tam = novoTam;
			pilhaPrincipal = newPilhaPrincipal;
			pilhaAux = newPilhaAux;
		}
		pilhaPrincipal.push(o);
		pilhaAux.push(o);
	}
	
	public Object dequeue() {
		Object o;
		if(pilhaPrincipal.isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		}
		o = pilhaAux.top();
		pilhaAux.pop();
		pilhaPrincipal.setDataEspecific(null, tam-1);
		return o;
	}
	
	public void showFila(FilaPilhas ff) {
		System.out.print("[");
		for(int i = 0; i < size(); i++) {
			System.out.print(" " + pilhaAux.getDataEspecific(i));
		}
		System.out.println(" ]");
	}
}
