package FilaListaLigada;

public class No {
	Object data;
    No next;

    public No(Object elemento) {
        this.data = elemento;
        this.next = null;
    }

    public String toString() {
        return " "+ this.data;
    }
}
