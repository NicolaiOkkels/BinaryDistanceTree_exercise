package app;

import java.util.Objects;

public class Node<T> implements TreePrinter.PrintableNode{

    private T obj;
    Node left, right;

    public Node(T obj) {
        this.obj = obj;
        left = right = null;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public TreePrinter.PrintableNode getLeft() {
        return left;
    }

    @Override
    public TreePrinter.PrintableNode getRight() {
        return right;
    }

    @Override
    public String getText() {
        return obj.toString();
    }


}
