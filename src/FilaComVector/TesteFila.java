package FilaComVector;

public class TesteFila {
		public static void main(String[] args) {
			FilaArray ff = new FilaArray(5);
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Inserção: ");
			ff.enqueue(5);
			ff.enqueue(6);
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.showFila(ff);
			ff.enqueue(7);
			ff.enqueue(8);
			ff.enqueue(9);
			ff.enqueue(10);
			ff.dequeue();
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.showFila(ff);
			ff.enqueue(8);
			ff.enqueue(10);
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.showFila(ff);
			ff.dequeue();
			System.out.println("Tamanho: " + ff.size());
			System.out.println("Início: " + ff.inicio());
			ff.showFila(ff);
			}
}
