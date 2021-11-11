package uk.ac.cam.bta30.IntSet;

public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode mLeft, mRight;

    public BinaryTreeNode(int value) {
        mValue = value;
        mLeft = null;
        mRight = null;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        mValue = value;
    }

    public BinaryTreeNode getLeft() {
        return mLeft;
    }

    public BinaryTreeNode getRight() {
        return mRight;
    }

    public void setLeft(BinaryTreeNode left) {
        mLeft = left;
    }

    public void setRight(BinaryTreeNode right) {
        mRight = right;
    }
}