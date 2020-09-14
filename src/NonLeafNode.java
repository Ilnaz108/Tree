class NonLeafNode implements Node {
    private Node left;
    private Node right;

    NonLeafNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public int count() {
        return this.left.count() + this.right.count();
    }
}