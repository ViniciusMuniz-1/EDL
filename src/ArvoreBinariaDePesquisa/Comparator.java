package ArvoreBinariaDePesquisa;

public class Comparator {
	public int compare(Object x, Object y) {
        try {  
            int num1 = (int) x; int num2 = (int) y;
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            } else {
                return 0;
            }
        } catch(Exception exception) {
            System.out.println("Vish...");
        }
        return 0;
    }
}
