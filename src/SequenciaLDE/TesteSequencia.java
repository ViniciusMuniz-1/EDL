package SequenciaLDE;

public class TesteSequencia {
	public static void main(String[] args) {
		Sequencia ss = new SequenciaLDE();
		System.out.println("Teste dos métodos do vetor: ");
		System.out.println("Sequência está vazia: " + ss.isEmpty());
		System.out.println("Inserção: ");
		System.out.println("Inserindo os valores 1(0), 5(1) e 7(2) usando os métodos do vetor:");
		ss.insertAtRank(0, 1);
		ss.insertAtRank(1, 5);
		ss.insertAtRank(2, 7);
		ss.showSequencia(ss);
		System.out.println("Elemento na posição 0: " + ss.elemAtRank(0));
		System.out.println("Elemento na posição 0: " + ss.elemAtRank(1));
		System.out.println("Elemento na posição 0: " + ss.elemAtRank(2));
		System.out.println("Tamanho da sequência: " + ss.size());
		System.out.println("Sequência está vazia: " + ss.isEmpty());
		System.out.println("Repondo o que existe no índice 1(5) para 2:");
		ss.replaceAtRank(1, 2);
		ss.showSequencia(ss);
		System.out.println("Removendo o que existe no índice 2(7):");
		ss.removeAtRank(2);
		ss.showSequencia(ss);
		System.out.println("Tamanho da sequência: " + ss.size());
	}
}
