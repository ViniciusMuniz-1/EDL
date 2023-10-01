package VetorComArray;

public class TesteVetor {
	public static void main(String[] args) {
		VetorArray vv = new VetorArray(5);
		System.out.println("Inserção: ");
		vv.insertAtRank(0, 1);
		vv.insertAtRank(1, 2);
		vv.insertAtRank(2, 3);
		vv.insertAtRank(3, 4);
		System.out.println("Tamanho: " + vv.size());
		System.out.println("Impressão do vetor: ");
		vv.showVetor(vv);
		vv.insertAtRank(4, 5);
		System.out.println();
		System.out.println("Tamanho: " + vv.size());
		System.out.println("Impressão do vetor: ");
		vv.showVetor(vv);
		vv.insertAtRank(5, 6);
		System.out.println();
		System.out.println("Tamanho: " + vv.size());
		System.out.println("Impressão do vetor: ");
		vv.showVetor(vv);
		vv.insertAtRank(6, 7);
		vv.insertAtRank(7, 8);
		vv.insertAtRank(8, 9);
		vv.insertAtRank(9, 10);
		vv.insertAtRank(10, 11);
		vv.insertAtRank(11, 12);
		System.out.println();
		System.out.println("Tamanho: " + vv.size());
		System.out.println("Impressão do vetor: ");
		vv.showVetor(vv);
		System.out.println();
		System.out.println("Remoção: ");
		vv.removeAtRank(0);
		System.out.println("Tamanho: " + vv.size());
		System.out.println("Impressão do vetor: ");
		vv.showVetor(vv);
		vv.removeAtRank(0);
		vv.removeAtRank(1);
		vv.removeAtRank(2);
		System.out.println();
		System.out.println("Tamanho: " + vv.size());
		System.out.println("Impressão do vetor: ");
		vv.showVetor(vv);
		System.out.println();
		System.out.println("Elemento na posição 0: " + vv.elemAtRank(0));
		System.out.println("Elemento na posição 1: " + vv.elemAtRank(1));
		System.out.println("Repondo elemento 4 na posição 0: ");
		vv.replaceAtRank(0, 4);
		System.out.println("Elemento na posição 0: " + vv.elemAtRank(0));
		vv.showVetor(vv);
	}
}
