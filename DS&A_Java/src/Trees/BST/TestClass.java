package Trees.BST;

public class TestClass {

	public static void main(String[] args) throws Exception {
		BST bst=new BST();
		bst.insert(4);
		bst.insert(2);
		bst.insert(8);
		bst.insert(5);
		bst.insert(10);
		bst.insert(7);
		bst.insert(6);
		bst.delete(8);
		
		bst.printTree();
	}

}
