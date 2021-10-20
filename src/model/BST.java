package model;


public class BST<T extends Comparable<T>> {
	
	Node<T> root;
	
	public BST() {

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
	
	public void search(T x, T k) {
		
	}
	public String inorder() {
		
		
		return "";
	}
	public String preOrder() {
		
		
		return "";
	}
	public String postOrder() {
		
		return "";
	}
	public Node<T> toDelete(){
		
		return null;
	}
	
}