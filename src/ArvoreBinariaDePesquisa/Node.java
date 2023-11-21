package ArvoreBinariaDePesquisa;

public class Node {
	private Object element;
	private Node father;
	private Node leftSon, rightSon;
	
	//CONSTRUCTOR:
	
	public Node(Object element, Node father) {
		this.setElement(element);
		this.setFather(father);
	}
	
	//GETTER AND SETTERS:

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	public Node getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(Node leftSon) {
		this.leftSon = leftSon;
	}

	public Node getRightSon() {
		return rightSon;
	}

	public void setRightSon(Node rightSon) {
		this.rightSon = rightSon;
	}
	
	
	
}
