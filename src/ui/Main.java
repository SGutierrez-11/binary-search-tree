package ui;

import java.util.Scanner;

import model.BST;

public class Main {
	
	//private static BST<Integer> bst;

	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		Scanner sc = new Scanner(System.in);
		int option = -1;
		do {
			System.out.println("1. Add \n"+"2. Delete \n"+"3. inOrder \n"+"4. preOrder \n"+"5. posOrder \n"+"6. Search");
			option = sc.nextInt();
		
			switch(option){
			case 1:
				int n = sc.nextInt();
				bst.insert(n);
			break;
				
			case 2:
				int m = sc.nextInt();
				bst.toDelete(m, bst.getRoot());
				break;
				
			case 3:	
				bst.inOrder();
				System.out.println(bst.getToPrint());
				break;
				
			case 4:
				bst.preOrder();
				System.out.println(bst.getToPrint());
				break;
			case 5:
				bst.postOrder();
				System.out.println(bst.getToPrint());
				break;
				
			case 6:
				int s = sc.nextInt();
				if(bst.search(s)==null) {
					System.out.println("Not exist");
				}else {
					System.out.println("Exist");
				}
				break;
			}
		}while(option!=0);
		
		
		
	}

}
