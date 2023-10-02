package ListaArray;

public class ListaArray implements Lista{
	private Object data[];
	private int size;
	
	public ListaArray(int tam) {
		data = new Object[tam];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		 return size == 0 ? true : false;
	}
	
	public boolean isFirst(Object element) {
		return data[0] == element ? true : false;
	}
	
	public boolean isLast(Object element) {
		return data[size-1] == element ? true : false;
	}
	
	public Object first() {
		return data[0];
	}
	
	public Object last() {
		return data[size-1];
	}
	
	public Object before(int index) {
		return data[index-1];
	}
	
	public Object after(int index) {
		return data[index+1];
	}
	
	public Object replaceElement(int index, Object element) {
		Object temp = data[index];
		data[index] = element;
		return temp;
	}
	
	public void swapElements(int index, int index2) {
		Object temp = data[index];
		data[index] = data[index2];
		data[index2] = temp;
	}
	
	public void insertBefore(int index, Object element) {
		if(size+1 == data.length) {
			Object newData[] = new Object[data.length*2];
			for(int i = 0; i < size(); i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		for(int i = data.length-1; i > index; i--) {
			data[i] = data[i-1];
		}
		data[index] = element;
		size++;
	}
	
	public void insertAfter(int index, Object element) {
		if(size+1 == data.length) {
			Object newData[] = new Object[data.length*2];
			for(int i = 0; i < size(); i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		for(int i = data.length-1; i > index+1; i--) {
			data[i] = data[i-1];
		}
		data[index+1] = element;
		size++;
	}
	
	public void insertFirst(Object element) {
		if(size+1 == data.length) {
			Object newData[] = new Object[data.length*2];
			for(int i = 0; i < size(); i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		for(int i = data.length-1; i > 0; i--) {
			data[i] = data[i-1];
		}
		data[0] = element;
		size++;
	}
	
	public void insertLast(Object element) {
		if(size+1 == data.length) {
			Object newData[] = new Object[data.length*2];
			for(int i = 0; i < size(); i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		data[size] = element;
		size++;
	}
	
	public void remove(int index) {
		for(int i = index; i < data.length-1; i++) {
			data[i] = data[i+1];
		}
		size--;
	}
	
	public void showLista(ListaArray ll) {
		System.out.print("[ ");
		for(int i = 0; i < ll.size(); i++) {
			System.out.print(data[i]);
			if(i+1 != ll.size()) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
	}
	
}
