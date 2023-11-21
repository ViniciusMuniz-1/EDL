package ArvoreBinariaDePesquisa;

import java.util.Iterator;

public interface ArvoreBinariaInterface {
	void setComparator(Comparator c);

	Comparator getComparator();

	Node pesquisar(Node Node, Object key);

	Node incluir(Object key);

	Object remover(Object key);

	Node getRoot();

	void setRoot(Node p);

	void inOrder(Node Node);

	void preOrder(Node Node);

	void posOrder(Node Node);

	int height(Node Node);

	int depth(Node Node);

	void mostrar();

	Iterator<Node> nos();

	Iterator<Object> elements();

	int size();

	boolean isEmpty();
}
