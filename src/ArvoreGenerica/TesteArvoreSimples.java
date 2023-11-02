package ArvoreGenerica;

import java.util.Iterator;
import java.util.Scanner;

public class TesteArvoreSimples {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Teste árvore simples:");
		System.out.println("Insira o nó raiz da árvore:");
		Object raiz = leia.nextInt();
		ArvoreSimples arvere = new ArvoreSimples(raiz);
		System.out.println("Insira a quantidade de elementos que quiser na árvore deixando claro seu pai e seu elemento.");
		int op = 0;
		while(op != -1) {
			System.out.println("Quem é o pai desse nó? (0 se for a raiz)");
			op = leia.nextInt();
			if(op == 0) {
				System.out.println("Qual o valor do nó?");
				Object value = leia.nextInt();
				arvere.addNo(value, arvere.getRaiz());
			}
			else {
				No pai = arvere.searchNode(arvere.getRaiz(), op);
				System.out.println("Qual o valor do nó?");
				Object value = leia.nextInt();
				arvere.addNo(value, pai);
			}
			
			System.out.println("Parar? (0 para não e -1 para parar)");
			op = leia.nextInt();
		}
		
		arvere.preOrder(arvere.getRaiz());
		System.out.println("Tamanho da árvore a partir da raiz: " + arvere.height(arvere.getRaiz()));
		
		System.out.println("Elementos da árvore com o método elements():");
		Iterator<Object> it = arvere.elements();
		while(it.hasNext()) {
			Object element = it.next();
	        System.out.print(element + " ");
		}
		
		System.out.println();
		System.out.println("Mudando o elemento 3 para 10:");
		arvere.replace(arvere.searchNode(arvere.getRaiz(), 3), 10);
		
		arvere.preOrder(arvere.getRaiz());
		
		System.out.println();
		System.out.println("Fazendo a troca entre o 7 e o 8 para mudança de posição na árvore!");
		arvere.swapElements(arvere.searchNode(arvere.getRaiz(), 7), arvere.searchNode(arvere.getRaiz(), 8));
		
		arvere.preOrder(arvere.getRaiz());
		
		System.out.println("Tamanho da árvore (Quant de nós): " + arvere.size());
	}
}
