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
		ss.removeAtRank(1);
		ss.removeAtRank(0);	
		ss.showSequencia(ss);
		System.out.println("Sequência está vazia: " + ss.isEmpty());
		
		System.out.println("Teste dos métodos da lista:");
		ss.insertFirst(1);
		ss.insertLast(4);
		ss.insertAfter(ss.searchNode(1), 2);
		ss.insertBefore(ss.searchNode(4), 3);
		ss.showSequencia(ss);
		System.out.println("Primeiro da sequência: " + ss.first());
		System.out.println("Último da sequência: " + ss.last());
		System.out.println("Valor antes do nó 4: " + ss.before(ss.searchNode(4)));
		System.out.println("Valor após o nó 1: " + ss.after(ss.searchNode(1)));
		System.out.println("Repondo o elemento do nó com elemento 2 por 8:");
		ss.replaceElement(ss.searchNode(2), 8);
		ss.showSequencia(ss);
		System.out.println("Trocando de posição o nó com elemento 8 pelo nó de elemento 4:");
		ss.swapElements(ss.searchNode(8), ss.searchNode(4));
		ss.showSequencia(ss);
		System.out.println("Removendo o nó com elemento 4:");
		ss.remove(ss.searchNode(4));
		ss.showSequencia(ss);
		
		System.out.println("Testes dos métodos ponte:");
		ss.insertAtRank(1, 2);
		ss.insertAfter(ss.searchNode(1), 12);
		ss.insertBefore(ss.searchNode(12), 7);
		ss.insertLast(76);
		ss.insertFirst(90);
		ss.insertAfter(ss.searchNode(90), 5);
		ss.insertBefore(ss.searchNode(7), 6);
		ss.showSequencia(ss);
		System.out.println("Elemento no rank 4: " + ss.atRank(4).getData());
		System.out.println("Elemento no rank 7: " + ss.atRank(7).getData());
		System.out.println("Elemento no rank 9: " + ss.atRank(9).getData());
		
		System.out.println("Rank do elemento 76: " + ss.rankOf(ss.searchNode(76)));
		System.out.println("Rank do elemento 12: " + ss.rankOf(ss.searchNode(12)));
	}
}
