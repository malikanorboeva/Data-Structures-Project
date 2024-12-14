public class BTree<T extends Comparable<T>> {
    private BTreeNode<T> root;
    private Traversal traversal;

    public enum Traversal {
        PREORDER, INORDER, POSTORDER
    }

    public BTree(Traversal traversal) {
        this.traversal = traversal;
    }

    public void insert(T value) {
        if (root == null) {
            this.root = new BTreeNode<>(value);
            return;
        }
        insert(root, value);
    }

    private void insert(BTreeNode<T> node, T value) {
        // Compare the values directly using compareTo
        int comparison = value.compareTo(node.getValue());

        if (comparison < 0) {
            // Insert left
            if (node.getLeft() == null) {
                node.left = new BTreeNode<>(value);
            } else {
                insert(node.getLeft(), value);
            }
        } else if (comparison > 0) {
            // Insert right
            if (node.getRight() == null) {
                node.right = new BTreeNode<>(value);
            } else {
                insert(node.getRight(), value);
            }
        }
        // If equal (comparison == 0), don't insert (ignore duplicates)
    }

    @Override
    public String toString() {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        switch (traversal) {
            case PREORDER:
                preorderTraversal(root, sb);
                break;
            case INORDER:
                inorderTraversal(root, sb);
                break;
            case POSTORDER:
                postorderTraversal(root, sb);
                break;
        }
        return sb.toString().trim();
    }

    private void preorderTraversal(BTreeNode<T> node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.getValue()).append(" ");
        preorderTraversal(node.getLeft(), sb);
        preorderTraversal(node.getRight(), sb);
    }

    private void inorderTraversal(BTreeNode<T> node, StringBuilder sb) {
        if (node == null) return;
        inorderTraversal(node.getLeft(), sb);
        sb.append(node.getValue()).append(" ");
        inorderTraversal(node.getRight(), sb);
    }

    private void postorderTraversal(BTreeNode<T> node, StringBuilder sb) {
        if (node == null) return;
        postorderTraversal(node.getLeft(), sb);
        postorderTraversal(node.getRight(), sb);
        sb.append(node.getValue()).append(" ");
    }
}
