package uk.ac.cam.bta30.IntSet;

public class FunctionalArray {
    BinaryTreeNode root;
    int size;

    private int getNextPow2MinusOne(int x) {
        int pow = 0;
        while(x != 0) {
            x >>= 1;
            pow <<= 1;
            pow++;
        }
        return pow;
    }

    private BinaryTreeNode buildEmptyTree(int size) {
        if(size == 0) {
            return null;
        }

        int adjustedSize = getNextPow2MinusOne(size);
        BinaryTreeNode root = new BinaryTreeNode(0);
        root.setLeft(buildEmptyTree(adjustedSize/2));
        root.setRight(buildEmptyTree(adjustedSize/2));

        return root;
    }

    public FunctionalArray(int size) {
        this.size = size;
        root = buildEmptyTree(size);
    }

    private BinaryTreeNode locateNode(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        BinaryTreeNode curr = root;
        while(index != 0) {
            curr = (index & 0b1) == 0 ? curr.getLeft() : curr.getRight();
            index >>= 1;
        }
        return curr;
    }

    public void set(int index, int value) {
        locateNode(index).setValue(value);
    }

    public int get(int index) {
        return locateNode(index).getValue();
    }
}
