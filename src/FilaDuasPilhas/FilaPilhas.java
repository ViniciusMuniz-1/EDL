package FilaDuasPilhas;

public class FilaPilhas {
	PilhaArray pp;
	PilhaArray paux;
	int tam;
	
	public FilaPilhas(int tam) {
		this.tam = tam;
		pp = new PilhaArray(tam);
		paux = new PilhaArray(tam);
	}
	
	public int size() {
		return pp.size();
	}
	
	public boolean isEmpty() {
		return pp.isEmpty();
	}
	
	public Object inicio() {
		return paux.top();
	}
	
	public void enqueue() {
		if(pp.size() == tam) {
			int novoTam = tam*2;
			Object newData[] = new Object[novoTam];
			int ii = 
		}
	}
}
