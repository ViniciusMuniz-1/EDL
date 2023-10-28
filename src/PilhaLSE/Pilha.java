package PilhaLSE;

public interface Pilha {
	public int size();
	public boolean isEmpty();
	public Object top();
	public void push(Object o);
	public Object pop();
	public void showPilha(PilhaLSE pp);
}
