public class BTreeNode<T> {
    T value;
    BTreeNode<T> left;
    BTreeNode<T> right;

    /**
     * Creates a new node with the given value
     * @param value The value to store in this node
     */
    public BTreeNode(T value) {
        this.value = value;
    }

    /**
     * @return The value stored in this node
     */
    public T getValue() {
        return value;
    }

    /**
     * @return The left child node
     */
    public BTreeNode<T> getLeft() {
        return left;
    }

    /**
     * @return The right child node
     */
    public BTreeNode<T> getRight() {
        return right;
    }
}
