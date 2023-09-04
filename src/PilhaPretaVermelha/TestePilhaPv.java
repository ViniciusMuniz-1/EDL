package PilhaPretaVermelha;

public class TestePilhaPv {
	public static void main(String[] args) {
		PilhaPV pp = new PilhaPV(5);
		System.out.println("Inserção: ");
		pp.pushVermelho(1);
		pp.pushPreto(10);
		pp.showPilha(pp);
		pp.pushPreto(9);
		pp.pushVermelho(2);
		pp.showPilha(pp);
		System.out.println(pp.topPreto());
		System.out.println(pp.topVermelho());
		pp.pushPreto(8);
		pp.showPilha(pp);
		System.out.println(pp.topPreto());
		System.out.println(pp.topVermelho());
		System.out.println("Tamanho: " + pp.size());
		pp.pushVermelho(3);
		pp.showPilha(pp);
		System.out.println(pp.topPreto());
		System.out.println(pp.topVermelho());
		System.out.println("Tamanho: " + pp.size());
		pp.pushPreto(7);
		pp.showPilha(pp);
		System.out.println(pp.topPreto());
		System.out.println(pp.topVermelho());
		pp.pushVermelho(4);
		pp.showPilha(pp);
		pp.pushPreto(6);
		pp.pushVermelho(5);
		pp.showPilha(pp);
		System.out.println(pp.topPreto());
		System.out.println(pp.topVermelho());
		
	}
}
