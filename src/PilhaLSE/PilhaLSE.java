package PilhaLSE;

public class PilhaLSE implements Pilha{
	private int size;
	private No first;
	private No last;
	
	public PilhaLSE(int value) {
		this.setSize(0);
		this.first = new No(null);
		this.last = new No(value);
		this.first.setNext(last);
	}
	
	public int size() {
		return getSize();
	}
	
	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}
	
	public Object top() {
		return first.getNext().getData();
	}
	
	public void push(Object element) {
		No newNode = new No(element);
		getLast().setNext(newNode);
		setLast(newNode);
		size++;
	}
	
	public Object pop() {
		No temp = first.getNext();
		first = first.getNext();
		
		size--;		
		return temp.getData();
	}
	
	public void showPilha(PilhaLSE pp) {
		No current = first.getNext();
		System.out.print("[ ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println("]");
    }
	
	//------------------------------------------------------------
	//GETTERS AND SETTERS:
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public No getFirst() {
		return first;
	}

	public void setFirst(No first) {
		this.first = first;
	}

	public No getLast() {
		return last;
	}

	public void setLast(No last) {
		this.last = last;
	}
	//------------------------------------------------------------
}
