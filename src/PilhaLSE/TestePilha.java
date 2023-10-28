package PilhaLSE;

public class TestePilha {
	public static void main(String[] args) {
		PilhaLSE pp = new PilhaLSE();
		pp.push(1);
		pp.push(2);
		pp.push(3);
		pp.push(3);
		pp.push(3);
		pp.push(3);
		pp.push(3);
		pp.push(3);
		pp.showPilha(pp);
		pp.pop();
		pp.showPilha(pp);
		pp.pop();
		pp.pop();
		pp.pop();
		pp.pop();
		pp.pop();
		pp.showPilha(pp);
	}
}
