package model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BSTtest<T extends Comparable<T>> {
	 private Node<Integer> node;
	 private BST<Integer> tree;

	 public void setupStage1() { 
	 }
	 
	 public void setupStage2() {
		 node = new Node<>(3);
	 }
	 
	 public void setupStage3() {
		 tree = new BST<>();
	 }
	 
	 @Test
	 public void insertTest1() {
		 setupStage1();
		 
		 
	 }
	 
	 @Test
	 public void insertTest2() {
		 setupStage2();
		 assertEquals(node.getValue(), (Integer) 3);
	 }
	 
	 @Test
	 public void insertTest3() {
		 setupStage3();
		 
		 tree.insert(5);
		 tree.insert(3);
		 
		 assertEquals(tree.root.getValue(), (Integer) 5);
		 assertEquals(tree.root.getLeft().getValue(), (Integer) 3);
	 }
	 
	
}
