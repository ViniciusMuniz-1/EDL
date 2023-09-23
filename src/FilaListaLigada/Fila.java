package FilaListaLigada;

public interface Fila {
	public int size();
	public boolean isEmpty();
	public Object inicio() throws EFilaVazia;
	public void enqueue(Object o);
	public Object dequeue() throws EFilaVazia;
}
