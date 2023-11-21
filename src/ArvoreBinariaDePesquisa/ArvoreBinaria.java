package ArvoreBinariaDePesquisa;

import java.util.ArrayList;
import java.util.Iterator;

public class ArvoreBinaria implements ArvoreBinariaInterface{
	private Node root;
	private int size;
	private Comparator comp = new Comparator();
	private ArrayList<Node> listNode;
	
	public ArvoreBinaria(Object element) {
		setRoot(new Node(element, null));
		this.setSize(1);
	}
	
	//---------------------------------------------------------------------------
	//MÉTODOS GENÉRICOS:
	
	public int size() {
		return getSize();
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public int height(Node node) {
		if(node == null) {
			return 0;
		}
		
		if(isExternal(node)) {
			return 0;
		}
		
		int h = 1;
		
		if(node.getLeftSon() != null) {
			h = Math.max(h, height(node.getLeftSon()));
		}
		if(node.getRightSon() != null) {
			h = Math.max(h, height(node.getRightSon()));
		}
		
		return 1+h;
	}
		
	public int profundidade(Node node){
			int profundidade = depth(node);
			return profundidade;
	}
		
	public int depth(Node node) {
		if(isRoot(node)) {
			return 0;
		} else {
			return 1+depth(node.getFather());
		}
	}
	
	public Iterator<Node> nos() {
		listNode = new ArrayList<>();
        inOrder(getRoot());
        return listNode.iterator();
	}
	
	public Iterator<Object> elements() {
		listNode = new ArrayList<>();
        inOrder(getRoot());

        ArrayList<Object> elementsList = new ArrayList<>();
        for (Node node : listNode) {
            elementsList.add(node.getElement());
        }

        return elementsList.iterator();
	}
	
	
	//---------------------------------------------------------------------------
	
	//---------------------------------------------------------------------------
	//MÉTODOS DE CONSULTA:
	public boolean hasLeft(Node node) {
		return node.getLeftSon() != null;
	}
	
	public boolean hasRight(Node node) {
		return node.getRightSon() != null;
	}
	
	public boolean isRoot(Node node) {
		return node == this.root;
	}
	
	public boolean isInternal(Node node) {
		return node.getLeftSon() != null || node.getRightSon() != null;
	}
	
	public boolean isExternal(Node node) {
		return node.getLeftSon() == null && node.getRightSon() == null;
	}
	
	public void inOrder(Node node) {
		if(isInternal(node)) {
			if(node.getLeftSon() != null) {
				inOrder(node.getLeftSon());
			}
		}
		listNode.add(node);
		
		if(isInternal(node)) {
			if(node.getRightSon() != null) {
				inOrder(node.getRightSon());
			}
		}
	}
	
	public void preOrder(Node node) {
		listNode.add(node);
		if(isInternal(node)) {
			if(node.getLeftSon() != null) {
				inOrder(node.getLeftSon());
			}
		}
		
		if(isInternal(node)) {
			if(node.getRightSon() != null) {
				inOrder(node.getRightSon());
			}
		}
	}
	
	public void posOrder(Node node) {
		if(isInternal(node)) {
			if(node.getLeftSon() != null) {
				inOrder(node.getLeftSon());
			}
			listNode.add(node);
		}
		
		if(isInternal(node)) {
			if(node.getRightSon() != null) {
				inOrder(node.getRightSon());
			}
			listNode.add(node);
		}
	}
	
	public Node pesquisar(Node node, Object key) {
		if(isExternal(node) || key == node.getElement()) {
			return node;
		}
		
		if(comp.compare(key, node.getElement()) < 0) {  //SE A CHAVE FOR MENOR QUE O ELEMENTO, DEVO PROCURAR NO LADO ESQUERDO DA ÁRVORE
			if(node.getLeftSon() != null) {
				return pesquisar(node.getLeftSon(), key);
			} else {
				return node;
			}
		} else {										//SE A CHAVE FOR MAIOR QUE O ELEMENTO, DEVO PROCURAR NO LADO DIREITO DA ÁRVORE
			if(node.getRightSon() != null) {
				return pesquisar(node.getRightSon(), key);
			} else {
				return node;
			}
		}
	}
	
	public void mostrar() {
		Object[][] matrizArvore = new Object[height(getRoot()) + 1][getSize()];
        listNode = new ArrayList();
        inOrder(getRoot());
        for (int i = 0; i < getSize(); i++) {
            Object obj = ((Node)listNode.get(i)).getElement();
            matrizArvore[depth((Node)listNode.get(i))][i] = obj;
        }
        for (int i = 0; i < height(getRoot()) + 1; i++) {
            for (int j = 0; j < getSize(); j++) {
                if (matrizArvore[i][j] == null) {
                    System.out.print("\t");
                } else {
                    System.out.printf("\t%d", matrizArvore[i][j]);
                }
            }
            System.out.println();
        }
	}
	
	//---------------------------------------------------------------------------
	
	//---------------------------------------------------------------------------
	//MÉTODOS ADICIONAIS:
	public Node incluir(Object key) {
		Node father = pesquisar(getRoot(), key);	//PROCURO O PAI DE ACORDO COM A CHAVE DADA
		Node newNode = new Node(key, father);
		
		if(comp.compare(newNode.getElement(), father.getElement()) < 0) {	 //SE O PAI FOR MAIOR, ENTÃO NOVO NÓ SERÁ FILHO ESQUERDO
			father.setLeftSon(newNode);
		} else {															//SE O PAI FOR MENOR, ENTÃO NOVO NÓ SERÁ FILHO ESQUERDO
			father.setRightSon(newNode);
		}
		
		size++;
		return newNode;
	}
	
	public Object remover(Object key) {
		Node nodeRemove = pesquisar(getRoot(), key);
		
		if(nodeRemove != null) {
			if(isExternal(nodeRemove)) {
				return removerFolha(nodeRemove);
			} else if(nodeRemove.getLeftSon() == null || nodeRemove.getRightSon() == null) {
				return removerUmFilho(nodeRemove);
			} else {
				return removerDoisFilhos(nodeRemove);
			}
		}
		
		return null; //acontece q n existe o nó
	}
	
	public Object removerFolha(Node node) {
		Node father = node.getFather();
		
		if(father != null) {
			if(father.getLeftSon() == node) {
				father.setLeftSon(null);
			}
			else {
				father.setRightSon(null);
			}
		} else {
			setRoot(null);
		}
		
		size--;
		return node.getElement();
	}
	
	public Object removerUmFilho(Node node) {
		Node son;
		if (node.getLeftSon() != null) {
			son = node.getLeftSon();
		} else {
			son = node.getRightSon();
		}
		
		Node father = node.getFather();
		
		if(father != null) {
			if(father.getLeftSon() == node) {
				father.setLeftSon(son);
			} else {
				father.setRightSon(son);
			}
		} else {
			setRoot(son);
		}
		
		if (son != null) {
	        son.setFather(father);
	    }
		
		size--;
		return node.getElement();
	}
	
	public Object removerDoisFilhos(Node node) {
		Node next = encontrarNovo(node.getRightSon());
		
		node.setElement(next.getElement());
		
		if (next.getLeftSon() != null || next.getRightSon() != null) {
	        return removerUmFilho(next);
	    } else {
	        return removerFolha(next);
	    }
	}
	
	private Node encontrarNovo(Node node) {
	    while (node.getLeftSon() != null) {
	        node = node.getLeftSon();
	    }
	    return node;
	}
	//---------------------------------------------------------------------------
	//GETTERS AND SETTERS
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public Comparator getComparator() {
		return this.comp;
	}
	
	public void setComparator(Comparator comp) {
		this.comp = comp;
	}
	//---------------------------------------------------------------------------
}
