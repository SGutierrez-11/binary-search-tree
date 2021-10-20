package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BSTtest {

	
	 
	 public <T extends Comparable<T>> BST<T> setupStage2() {
		 BST<T> tree = new BST<T>();
		 return tree;
	 }
	 
	 @Test
	 public void insertTest1() {
		 
		 BST<Integer> bst = setupStage2();

		 assertNull(bst.root);
	 }
	 
	 @Test
	 public void insertTest2() {
		 
		 BST<Integer> tree = setupStage2();
		 tree.insert(3);
		 
		 assertEquals(tree.root.getValue(), (Integer) 3);
	 }
	 
	 @Test
	 public void insertTest3() {
		 
		 BST<Integer> tree = setupStage2();
		 
		 tree.insert(5);
		 tree.insert(3);
		 
		 assertEquals(tree.root.getValue(), (Integer) 5);
		 assertEquals(tree.root.getLeft().getValue(), (Integer) 3);
	 }
	 
	 @Test
	 public void insertTest4() {
		 BST<Integer> tree = setupStage2();
		 
		 tree.insert(10);
		 tree.insert(9);
		 tree.insert(14);
		 
		 assertEquals(tree.root.getValue(), (Integer) 10);
		 assertEquals(tree.root.getLeft().getValue(), (Integer) 9);
		 assertEquals(tree.root.getRigth().getValue(), (Integer) 14);
	 }
	 
	 @Test
	 public void searchTest1() {
		 BST<Integer> bst = setupStage2();
		 		 
		 assertNull(bst.search(3));
	 }
	 
	 @Test
	 public void searchTest2() {
		 BST<Integer> tree = setupStage2();
		 
		 tree.insert(3);
		 
		 assertNotNull(tree.search(3));
	 }
	 
	 @Test
	 public void searchTest3() {
		 BST<Integer> tree = setupStage2(); 
		 
		 tree.insert(10);
		 tree.insert(9);
		 tree.insert(14);
		 
		 assertNotNull(tree.search(10));
		 assertEquals(tree.search(9), tree.root.getLeft());
		 assertEquals(tree.search(14), tree.root.getRigth());
	 }
	 
	 @Test
	 public void deleteTest() {
		 BST<Integer> tree = setupStage2();
		 
		 tree.insert(10);
		 tree.insert(9);
		 tree.insert(14);
		 tree.insert(11);
		 tree.delete(10);
		 assertNull(tree.search(10));
	 }
	 
	 @Test
	 public void minimumTest() {
		 BST<Integer> tree = setupStage2();
	        tree.insert(3);
	        tree.insert(4);
	        tree.insert(5);

	        
	        assertEquals(3,tree.minimun(tree.search(3)).getValue());
	 }
	 
	 @Test
	 public void maximunTest() {
		 BST<Integer> tree = setupStage2();
	        tree.insert(3);
	        tree.insert(4);
	        tree.insert(5);

	        
	        assertEquals(5,tree.maximun(tree.search(5)).getValue());
	        assertNotEquals(3,tree.maximun(tree.search(3)).getValue());
	 }
	 
	 @Test
	 public void succesorTest() {
		 BST<Integer> tree = setupStage2();
		 tree.insert(3);
	     tree.insert(4);
	     tree.insert(5);
	     assertEquals(4, tree.succesor(tree.search(3)).getValue());
	 }
	 
	 
}
