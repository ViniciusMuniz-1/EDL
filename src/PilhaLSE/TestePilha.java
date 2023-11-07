package PilhaLSE;

public class TestePilha {
	public static void main(String[] args) {
		System.out.println("Criando a pilha com o topo sendo 1:");
		PilhaLSE pp = new PilhaLSE(1);
		pp.showPilha(pp);
		System.out.println("Topo: " + pp.top());
		System.out.println("Tamanho: " + pp.size());
		System.out.println("Inserindo vários elementos: ");
		pp.push(2);
		pp.push(3);
		pp.push(4);
		pp.push(5);
		pp.push(6);
		pp.push(7);
		pp.push(8);
		pp.showPilha(pp);
		System.out.println("Topo: " + pp.top());
		System.out.println("Tamanho: " + pp.size());
		System.out.println("Removendo o topo: ");
		pp.showPilha(pp);
		pp.pop();
		pp.showPilha(pp);
		System.out.println("Topo: " + pp.top());
		System.out.println("Tamanho: " + pp.size());
		System.out.println("Removendo vários elementos: ");
		pp.pop();
		pp.pop();
		pp.pop();
		pp.pop();
		pp.pop();
		pp.showPilha(pp);
		System.out.println("Topo: " + pp.top());
		System.out.println("Tamanho: " + pp.size());
	}
}
