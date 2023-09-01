package PilhaPretaVermelha;

public interface PilhaTrab {
	public int size();
	public boolean isEmpty();
	public Object topVermelho() throws EPilhaError;
	public Object topPreto() throws EPilhaError;
	public void pushPreto(Object o);
	public void pushVermelho(Object o);
	public Object popPreto() throws EPilhaError;
	public Object popVermelho() throws EPilhaError;
	public void showPilha(PilhaPV pp);
}
