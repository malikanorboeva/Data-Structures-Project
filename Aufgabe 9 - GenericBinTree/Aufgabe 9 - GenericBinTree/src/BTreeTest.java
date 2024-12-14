public class BTreeTest {
    public static void main(String[] args) {
        // Test string tree with all traversal types
        testStringTree();

        // Test chemical element tree with all traversal types
        testChemElementTree();
    }

    private static void testStringTree() {
        System.out.println("Testing String Tree:");

        // Test preorder traversal
        BTree<String> preorderTree = new BTree<>(BTree.Traversal.PREORDER);
        fillStringTree(preorderTree);
        System.out.println("Preorder: " + preorderTree);

        // Test inorder traversal
        BTree<String> inorderTree = new BTree<>(BTree.Traversal.INORDER);
        fillStringTree(inorderTree);
        System.out.println("Inorder: " + inorderTree);

        // Test postorder traversal
        BTree<String> postorderTree = new BTree<>(BTree.Traversal.POSTORDER);
        fillStringTree(postorderTree);
        System.out.println("Postorder: " + postorderTree);
        System.out.println();
    }

    private static void fillStringTree(BTree<String> tree) {
        tree.insert("E"); // Root
        tree.insert("B");
        tree.insert("A");
        tree.insert("D");
        tree.insert("C");
        tree.insert("G");
        tree.insert("F");
        tree.insert("I");
        tree.insert("H");
        tree.insert("J");
    }

    private static void testChemElementTree() {
        System.out.println("Testing ChemElement Tree:");

        // Test preorder traversal
        BTree<ChemElement> preorderTree = new BTree<>(BTree.Traversal.PREORDER);
        fillChemTree(preorderTree);
        System.out.println("Preorder: " + preorderTree);

        // Test inorder traversal
        BTree<ChemElement> inorderTree = new BTree<>(BTree.Traversal.INORDER);
        fillChemTree(inorderTree);
        System.out.println("Inorder: " + inorderTree);

        // Test postorder traversal
        BTree<ChemElement> postorderTree = new BTree<>(BTree.Traversal.POSTORDER);
        fillChemTree(postorderTree);
        System.out.println("Postorder: " + postorderTree);
    }

    private static void fillChemTree(BTree<ChemElement> tree) {
        tree.insert(new ChemElement("Fe", 7.87));  // Root
        tree.insert(new ChemElement("H", 0.09));
        tree.insert(new ChemElement("O", 1.43));
        tree.insert(new ChemElement("C", 2.26));
        tree.insert(new ChemElement("Ti", 4.54));
        tree.insert(new ChemElement("Zn", 7.13));
        tree.insert(new ChemElement("Ag", 10.5));
        tree.insert(new ChemElement("Th", 15.4));
        tree.insert(new ChemElement("U", 19.0));
        tree.insert(new ChemElement("Au", 19.32));
    }
}