package ListaDuplamenteEncadeada;

public interface Lista {
	public int size();
	public boolean isEmpty();
	public boolean isFirst(Object element);
	public boolean isLast(Object element);
	public Object first();
	public Object last();
	public Object before(int index);
	public Object after(int index);
	public Object replaceElement(int index, Object element);
	public void swapElements(int index, int index2);
	public void insertBefore(int index, Object element);
	public void insertAfter(int index, Object element);
	public void insertFirst(Object element);
	public void insertLast(Object element);
	public void remove(int index);
}
