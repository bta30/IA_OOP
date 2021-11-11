package uk.ac.cam.bta30.IntSet;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class BinaryTreeNodeTest {

    @Test
    public void instantiatedNode_hasValueAndNullLeftRightNodes() {
        BinaryTreeNode node = new BinaryTreeNode(1);

        int value = node.getValue();
        BinaryTreeNode left = node.getLeft();
        BinaryTreeNode right = node.getRight();

        assertThat(value).isEqualTo(1);
        assertThat(left).isEqualTo(null);
        assertThat(right).isEqualTo(null);
    }

    @Test
    public void getValue_returnsNewSetValue_WhenNewValueSet() {
        BinaryTreeNode node = new BinaryTreeNode(1);

        node.setValue(2);
        int value = node.getValue();

        assertThat(value).isEqualTo(2);
    }

    @Test
    public void getLeft_returnsNewLeft_WhenNewLeftSet() {
        BinaryTreeNode node = new BinaryTreeNode(1);
        BinaryTreeNode newLeft = new BinaryTreeNode(2);

        node.setLeft(newLeft);
        BinaryTreeNode left = node.getLeft();

        assertThat(left).isEqualTo(newLeft);
    }

    @Test
    public void getLeft_returnsNewRight_WhenNewRightSet() {
        BinaryTreeNode node = new BinaryTreeNode(1);
        BinaryTreeNode newRight = new BinaryTreeNode(2);

        node.setRight(newRight);
        BinaryTreeNode right = node.getRight();

        assertThat(right).isEqualTo(newRight);
    }
}