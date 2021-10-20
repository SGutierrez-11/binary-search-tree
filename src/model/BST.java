package model;


public class BST<T extends Comparable<T>> {
	
	Node<T> root;
	
	String toPrint;
	public BST() {
		
		toPrint = "";
	}
	
	//inorder tree walk
	public void inorder(Node<T> x) {
		
		if(x != null) {
			inorder(x.getLeft());
			System.out.println(x.getValue());
			inorder(x.getRigth());
			
		}
	}
	
	public void insert(T value) {
		
		if(root==null) {
			root = new Node<>(value);
		}else {
			insert(root, value);
		}	
	}
	
	
	private void insert(Node<T> temp, T value) {
			
		Node<T> n= new Node<>(value);
			
		if(n.getValue().compareTo(temp.getValue())>0) {
			if(temp.getRigth()==null) {
					temp.setRigth(n);
				} else {
					insert(temp.getRigth(), value);
				}
		}else {
			if(temp.getLeft()==null) {
					temp.setLeft(n);
			}else {
				insert(temp.getLeft(), value);
			}
		}	
	}
	
	public Node<T>search(T x) {
	
		if(x.compareTo(root.getValue())==0) {
			
		return root;
		}else {
			if(x.compareTo(root.getValue())>0) {
				return search(x,root.getRigth());
				
			}else {
				return search(x, root.getLeft());
			}
		}
		
		
	}
	private Node<T> search(T x, Node<T> toSearch){
		
		if(toSearch==null) {
			return null;
		}else {
			
			if(x.compareTo(toSearch.getValue())==0) {
				
				return toSearch;
				}else {
					if(x.compareTo(toSearch.getValue())>0) {
						return search(x,toSearch.getRigth());
						
					}else {
						return search(x, toSearch.getLeft());
					}
				}
		}
		
	}
	public void inOrder() {
		
		toPrint = "";
		inOrder(root);
		
	}
	private void inOrder(Node<T> node) {
		
		if(node == null) {
			return;
		}else {
			
			inOrder(node.getLeft());
			toPrint+= "" +node.getValue();
			inOrder(node.getRigth());
		}
		
	}
	public void preOrder() {
		
		toPrint = "";
		preOrder(root);
		
	}
	private void preOrder(Node<T> node) {
		
		if(node==null) {
			return;
		}else {
			toPrint+= "" + node.getValue();
			preOrder(node.getLeft());
			preOrder(node.getRigth());
		}
		
	}
	public void postOrder() {
		
	
	}
	public void toDelete(){
		
		
	}
	
}