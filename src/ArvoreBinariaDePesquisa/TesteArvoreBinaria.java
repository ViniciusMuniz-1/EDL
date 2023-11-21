package ArvoreBinariaDePesquisa;

import java.util.Scanner;

public class TesteArvoreBinaria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArvoreBinaria arvere = new ArvoreBinaria(30);
		
		System.out.println("Teste árvore binária:");
	
		System.out.println("Árvore com os elementos: (40, 20, 25, 19, 35, 32, 41)");
		arvere.incluir(40);
		arvere.incluir(20);
		arvere.incluir(25);
		arvere.incluir(19);
		arvere.incluir(35);
		arvere.incluir(32);
		arvere.incluir(41);
		arvere.mostrar();
		System.out.println("Altura da árvore: " + arvere.height(arvere.getRoot()));
		System.out.println("Profundidade da raiz da árvore: " + arvere.depth(arvere.getRoot()));
		System.out.println("Profundidade do último nó (32): " + arvere.depth(arvere.pesquisar(arvere.getRoot(), 32)));
		arvere.remover(32);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Tendo removido um nó folha (o 32)");
		arvere.mostrar();
		arvere.incluir(32);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Tendo removido um nó com um filho (o 35)");
		arvere.remover(35);
		arvere.mostrar();
		arvere.incluir(35);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Tendo removido um nó com 2 filhos(o 40)");
		arvere.remover(40);
		arvere.mostrar();
		arvere.incluir(40);
		
	}
}
