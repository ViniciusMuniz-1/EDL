package PilhaPretaVermelha;

public class TestePilhaPv {
	public static void main(String[] args) {
		PilhaPV pp = new PilhaPV(5);
		System.out.println("Inserção: ");
		pp.pushVermelho(8);
		pp.pushPreto(1);
		pp.showPilha(pp);
		pp.pushPreto(2);
		pp.pushVermelho(5);
		pp.showPilha(pp);
		pp.pushPreto(4);
		pp.showPilha(pp);
		pp.pushVermelho(5);
		pp.showPilha(pp);
	}
}
