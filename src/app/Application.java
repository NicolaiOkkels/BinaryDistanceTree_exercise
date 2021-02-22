package app;

public class Application {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        System.out.println("Distance from Århus:");
        TreePrinter.print(bt.createBinaryTree().root);
    }
}
