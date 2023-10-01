package VetorListaDuplamenteEncadeada;

public class No {
	Object data;
	No next;
	No prev;
	
	public No(Object elemento) {
	   this.data = elemento;
	   this.next = null;
	   this.prev = null;
	}
}
