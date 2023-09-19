package FilaDuasPilhas;

public class FilaPilhas {
	PilhaArray p1;
	PilhaArray p2;
	int tam;
	int init;
	int last;
	
	public FilaPilhas(int tam) {
		this.tam = tam;
		p1 = new PilhaArray(tam);
		p2 = new PilhaArray(tam);
	}
	
	public int size() {
		
	}
}
