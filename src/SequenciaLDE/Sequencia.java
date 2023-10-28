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
	public void swapElements(No node, No node2);
	public void insertBefore(No node, Object element);
	public void insertAfter(No node, Object element);
	public void insertFirst(Object element);
	public void insertLast(Object element);
	public void remove(No node);
	public No searchNode(Object element);
	//MÉTODOS PONTE:
	public No atRank(int rank);
	public int rankOf(No node);
}
