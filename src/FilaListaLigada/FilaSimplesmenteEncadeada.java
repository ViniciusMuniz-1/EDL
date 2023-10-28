package FilaListaLigada;

public class FilaSimplesmenteEncadeada implements Fila{
	private int size;
	private No first;
	private No last;
	
	public FilaSimplesmenteEncadeada(int tam) {
		this.first = null;
		this.size = tam;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public Object inicio() {
		if(isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		}
		return first.data;
	}
	
	public void enqueue(Object o) {
		No newNo = new No(o);
		if(first == null) {
			first = newNo;
			last = newNo;
		} else {
			last.next = newNo;
			last = newNo;
		}
		size++;
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			throw new EFilaVazia("Fila vazia");
		}
		
		No aux = first;
		first = first.next;
		size--;
		
		return aux;
	}
	
	public void showFila(FilaSimplesmenteEncadeada ff) {
		No current = first;
		System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }
}
