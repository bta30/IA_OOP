package uk.ac.cam.bta30.IntSet;

public class SearchSet {
    private int mElements;
    BinaryTreeNode mHead;

    public SearchSet() {
        mElements = 0;
        mHead = null;
    }

    public void insert(int elem) {
        if(mHead == null) {
            mHead = new BinaryTreeNode(elem);
            mElements++;
            return;
        }

        BinaryTreeNode curr = mHead;
        BinaryTreeNode newNode = new BinaryTreeNode(elem);
        boolean elemInList = false;

        while(!elemInList) {
            BinaryTreeNode prev = curr;
            if(elem < curr.getValue()) {
                curr = curr.getLeft();
                if(curr == null) {
                    prev.setLeft(newNode);
                    mElements++;
                    elemInList = true;
                }
            }
            else if(elem > curr.getValue()) {
                curr = curr.getRight();
                if(curr == null) {
                    prev.setRight(newNode);
                    mElements++;
                    elemInList = true;
                }
            }
            else {
                elemInList = true;
            }
        }
    }

    public int getNumberElements() {
        return mElements;
    }

    public boolean contains(int elem) {
        BinaryTreeNode curr = mHead;

        while(curr != null && curr.getValue() != elem) {
            curr = curr.getValue() < elem ? curr.getLeft() : curr.getRight();
        }

        return curr != null;
    }

    public static void main(String[] args) {

    }
}