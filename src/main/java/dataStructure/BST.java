package dataStructure;



public class BST {
    private Node root;

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) root = newNode;
        else insert(root, newNode);
    }

    public void insert(final Node root, final Node newNode) {
        if (root == null) return;

        if (root.data == newNode.data) return;

        if (newNode.data < root.data) {
            if (root.left == null) root.left = newNode;
            else {
                insert(root.left, newNode);
            }
        } else {
            if (root.right == null) root.right = newNode;
            else {
                insert(root.right, newNode);
            }
        }
    }


    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(final Node node) {
        // Left - Root - Right
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }


    public boolean contains(int data) {
        return contains(root, data);
    }

    private boolean contains(final Node root, final int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        if (data < root.data) {
            return contains(root.left, data);
        }
        return contains(root.right, data);
    }


    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.data;
    }

    public void deleteNode(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(final Node root, final int data) {
        if (root == null) return null;

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minValue(root.left);
                root.data = minValue;
                root.right = deleteNode(root.right, minValue);

            }
        }
        return root;
    }


    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(37);
        tree.insert(66);
        tree.insert(42);
        tree.insert(11);
        tree.insert(72);
        tree.insert(8);
        tree.insert(17);



        System.out.println("#######");
        tree.deleteNode(8);
        tree.inOrder();
    }

}
