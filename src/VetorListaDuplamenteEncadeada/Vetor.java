package VetorListaDuplamenteEncadeada;

public interface Vetor {
	public int size();
	public boolean isEmpty();
	public Object elemAtRank(int r);
	public Object replaceAtRank(int r, Object o);
	public void insertAtRank(int r, Object o);
	public Object removeAtRank(int r);
	public void showVetor(VetorListaDuplamenteE vv);
}
