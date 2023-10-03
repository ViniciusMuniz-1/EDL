package ListaDuplamenteEncadeada;

public class TesteLista {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada ll = new ListaDuplamenteEncadeada();
		System.out.println("Inserção: ");
		ll.insertFirst(1);
		ll.insertFirst(8);
		ll.insertLast(2);
		ll.insertLast(3);
		ll.insertAfter(0, 4);
		ll.insertAfter(1, 5);
		ll.insertBefore(0, 3);
		ll.insertBefore(2, 5);
		ll.showLista(ll);
		System.out.println();
		System.out.println("Remoção: ");
		ll.remove(0);
		ll.remove(2);
		ll.showLista(ll);
		System.out.println();
		System.out.println("Testes de validação: ");
		System.out.println("8 é o primeiro?: " + ll.isFirst(8));
		System.out.println("9 é o primeiro?: " + ll.isFirst(9));
		System.out.println("8 é o último?: " + ll.isLast(8));
		System.out.println("3 é o último?: " + ll.isLast(3));
		System.out.println("Último: " + ll.last());
		System.out.println("Tamanho: " + ll.size());
		System.out.println("Valor depois do índice 3: " + ll.after(3));
		System.out.println("Valor antes do índice 4: " + ll.before(4));
		ll.showLista(ll);
		System.out.println();
		System.out.println("Primeiro elemento: " + ll.first());
		System.out.println("Último elemento: " + ll.last());
		System.out.println("Mudando elementos: ");
		System.out.println("Mudando o que tem no índice 2 para 12: ");
		ll.replaceElement(2, 12);
		ll.showLista(ll);
		System.out.println();
		System.out.println("Mudando o que tem no índice 2 com o índice 4: ");
		ll.swapElements(2, 4);
		ll.showLista(ll);
	}
}
