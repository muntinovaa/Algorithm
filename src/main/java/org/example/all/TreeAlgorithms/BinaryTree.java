package org.example.all.TreeAlgorithms;

public class BinaryTree {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    TreeNode root;

    // Inorder Traversal (Left, Root, Right)
    public void inorderTraversal(TreeNode node) {
        if (node == null) return;

        inorderTraversal(node.left);   // Traverse left subtree
        System.out.print(node.value + " "); // Visit the node
        inorderTraversal(node.right);  // Traverse right subtree
    }

    // Preorder Traversal (Root, Left, Right)
    public void preorderTraversal(TreeNode node) {
        if (node == null) return;

        System.out.print(node.value + " "); // Visit the node
        preorderTraversal(node.left);   // Traverse left subtree
        preorderTraversal(node.right);  // Traverse right subtree
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorderTraversal(TreeNode node) {
        if (node == null) return;

        postorderTraversal(node.left);   // Traverse left subtree
        postorderTraversal(node.right);  // Traverse right subtree
        System.out.print(node.value + " "); // Visit the node
    }

    // Recursive function to compute the height of the binary tree
    public int height(TreeNode node) {
        if (node == null) {
            return -1; // Base case: empty tree has height -1
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int getHeight() {
        return height(root);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Preorder Traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        tree.postorderTraversal(tree.root);

        System.out.println("Height of the tree: " + tree.getHeight());
    }
}
