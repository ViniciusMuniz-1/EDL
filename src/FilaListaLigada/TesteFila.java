package FilaListaLigada;

import FilaDuasPilhas.FilaPilhas;

public class TesteFila {
		public static void main(String[] args) {
			FilaPilhas ff = new FilaPilhas(5);
			System.out.println("Inserção: ");
			ff.enqueue(5);
			ff.enqueue(6);
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.enqueue(7);
			ff.dequeue();
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.showFila(ff);
			ff.enqueue(8);
			ff.enqueue(9);
			ff.enqueue(10);
			ff.enqueue(11);
			ff.enqueue(12);
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.dequeue();
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.showFila(ff);
			}
}
