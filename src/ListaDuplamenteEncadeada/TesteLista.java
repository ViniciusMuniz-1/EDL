package ListaDuplamenteEncadeada;

public class TesteLista {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada ll = new ListaDuplamenteEncadeada();
		System.out.println("Inserção: ");
		ll.insertFirst(1);
		ll.insertFirst(8);
		ll.insertLast(2);
		ll.insertLast(3);
		ll.insertAfter(ll.searchNode(8), 4);
		ll.insertAfter(ll.searchNode(2), 5);
		ll.insertBefore(ll.searchNode(8), 11);
		ll.insertBefore(ll.searchNode(3), 98);
		ll.showLista(ll);
		System.out.println();
		System.out.println("Remoção: ");
		ll.remove(ll.searchNode(8));
		ll.remove(ll.searchNode(2));
		ll.showLista(ll);
		System.out.println();
		System.out.println("Testes de validação: ");
		System.out.println("11 é o primeiro?: " + ll.isFirst(11));
		System.out.println("9 é o primeiro?: " + ll.isFirst(9));
		System.out.println("8 é o último?: " + ll.isLast(8));
		System.out.println("3 é o último?: " + ll.isLast(3));
		System.out.println("Último: " + ll.last());
		System.out.println("Tamanho: " + ll.size());
		System.out.println("Valor antes do node 3: " + ll.before(ll.searchNode(3)));
		System.out.println("Valor depois do node 4: " + ll.after(ll.searchNode(4)));
		ll.showLista(ll);
		System.out.println();
		System.out.println("Primeiro elemento: " + ll.first());
		System.out.println("Último elemento: " + ll.last());
		System.out.println("Mudando elementos: ");
		System.out.println("Mudando o que tem nó 4 para 12: ");
		ll.replaceElement(ll.searchNode(4), 12);
		ll.showLista(ll);
		System.out.println();
		System.out.println("Mudando a posição do nó 12 com o nó 98: ");
		ll.swapElements(ll.searchNode(12), ll.searchNode(98));
		ll.showLista(ll);
	}
}
