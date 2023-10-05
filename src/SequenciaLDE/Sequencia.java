package SequenciaLDE;

public interface Sequencia {
	public int size();
	public boolean isEmpty();
	public void showSequencia(Sequencia ss);
	//MÉTODOS VETOR:
	public Object elemAtRank(int rank);
	public Object replaceAtRank(int rank, Object element);
	public void insertAtRank(int rank, Object element);
	public void removeAtRank(int rank);
	//MÉTODOS LISTA:
	public Object first();
	public Object last();
	public Object before(No node); 
	public Object after(No node);
	public Object replaceElement(No node, Object element);
	public void swapElements(No node, Object element);
	public void insertBefore();
	public void insertAfter();
	public void insertFirst();
	public void insertLast();
	public void remove();
	//MÉTODOS PONTE:
	public Object atRanK(int rank);
	public Object rankOf(No node);
}
