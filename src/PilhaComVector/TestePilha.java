package PilhaComVector;

public class TestePilha {
	public static void main(String[] args) {
		PilhaArray pp = new PilhaArray(5);
		System.out.println("Inserção: ");
		pp.push(1);
		pp.push(10);
		pp.showPilha(pp);
		pp.push(9);
		pp.push(2);
		pp.showPilha(pp);
		System.out.println(pp.top());
		pp.push(8);
		pp.showPilha(pp);
		System.out.println(pp.top());
		System.out.println("Tamanho: " + pp.size());
		pp.push(3);
		pp.showPilha(pp);
		System.out.println(pp.top());
		System.out.println("Tamanho: " + pp.size());
		pp.push(7);
		pp.showPilha(pp);
		System.out.println(pp.top());
		pp.push(4);
		pp.showPilha(pp);
		pp.push(6);
		pp.push(5);
		pp.showPilha(pp);
		System.out.println(pp.top());
		pp.pop();
		pp.pop();
		pp.showPilha(pp);
		System.out.println("Tamanho: " + pp.size());
		System.out.println(pp.top());
	}
}
