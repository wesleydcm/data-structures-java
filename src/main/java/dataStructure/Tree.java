package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node root;

    public static class Node {
        public String data;
        public Node left;
        public Node right;

        public Node(String data) {
            this.data = data;
        }

        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    public void insert(String data) {
        if (root == null) root = new Node(data);
        else {
            Node newNode = new Node(data);
            Queue<Node> queue = new LinkedList<>();
            // always starts from the root to the left
            queue.add(root);

            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }

                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }

            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node node) {
        // Root - Left - Right
        if (node == null) return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node node) {
        // Left - Root - Right
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }


    public void posOrder() {
        posOrder(root);
    }

    public void posOrder(Node node) {
        // Left - Right - Root
        if (node == null) return;
        posOrder(node.left);
        posOrder(node.right);
        System.out.println(node.data);
    }

    public void BFS() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);

            System.out.println(node.data);
        }


    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");


        System.out.println("#### Tree crossing ######");
          tree.BFS();
//        tree.preOrder();
//        tree.inOrder();
//        tree.posOrder();
        System.out.println("##########");
    }
}
