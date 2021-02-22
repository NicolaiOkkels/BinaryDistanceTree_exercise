package app;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node node, int distance, String name) {
        if (node == null) {
            return new Node<>(new City(name, distance));
        }

        if (distance < node.getObj().hashCode()) {
            node.left = addRecursive(node.left, distance, name);
        } else if (distance >node.getObj().hashCode()) {
            node.right = addRecursive(node.right, distance, name);
        } else {
            return node;
        }

        return node;
    }

    public void add(int distance, String name) {
        root = addRecursive(root, distance, name);
    }

    public BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.add(118, "Aalborg");
        bt.add(154, "Aabenrå");
        bt.add(61, "Viborg");
        bt.add(71, "Vejle");
        bt.add(178, "Tønder");
        bt.add(148, "Thisted");
        bt.add(222, "Skagen");

        return bt;
    }
}
