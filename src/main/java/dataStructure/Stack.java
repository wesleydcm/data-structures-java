package dataStructure;

// Stack with linked list;

public class Stack {
    private Node top;
    private int height;

    public class Node {
        int value;

        Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Stack(int value) {
        top = new Node(value);
        height = 1;
    }

    public void peek() {
        if (top == null) System.out.println("Stack is empty");
        else System.out.println("Peek: " + top.value);
    }

    public int getHeight() {
        return height;
    }

    public void print() {
        Node temp = top;

        System.out.println("###### Printing Stack ########");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("####### End of Stack ########");

    }


    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        height++;
    }

    public Node pop() {
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }


    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(1);
        myStack.print();


        myStack.peek();
        System.out.println("Height: " + myStack.getHeight());

//
//        myStack.push(3);
//        myStack.peek();
//        System.out.println("Height: " + myStack.getHeight());
//        myStack.print();

//        System.out.println("Removed element: "+ myStack.pop().value);
//        myStack.print();
    }

}
