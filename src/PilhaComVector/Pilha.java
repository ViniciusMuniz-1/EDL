package PilhaComVector;


public interface Pilha {
	public int size();
	public boolean isEmpty();
	public Object top() throws EPilhaVazia;
	public void push(Object o);
	public Object pop() throws EPilhaVazia;
	public void showPilha(PilhaArray pp);
}
