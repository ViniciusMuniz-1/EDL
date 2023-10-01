package VetorComArray;

public class VetorArray implements Vetor{
	private Object data[];
	private int size = 0;
	private int capacity;
	
	public VetorArray(int tam) {
		data = new Object[tam];
		capacity = tam;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public Object elemAtRank(int r) {
		return data[r];
	}
	
	public Object replaceAtRank(int r, Object o) {
		Object temp = data[r];
		data[r] = o;
		return temp;
	}
	
	public void insertAtRank(int r, Object o) {
		if(capacity == size) {
			Object newData[] = new Object[size*2];
			for(int i = 0; i < size; i++) {
				newData[i] = data[i];
			}
			data = newData;
			capacity = newData.length;
		}
		
		for(int i = size-1; i > r; i++) {
			data[i] = data[i-1];
		}
		
		data[r] = o;
		size++;
	}
	
	public Object removeAtRank(int r) {
		Object temp = data[r];
		for(int i = r; i < size; i++) {
			data[i] = data[i+1];
		}
		return temp;
	}
	
	public void showVetor(VetorArray vv) {
		System.out.print("[ ");
		for(int i = 0; i < vv.size(); i++) {
			System.out.print(data[i]);
			if(i+1 != vv.size()) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
	}
}
