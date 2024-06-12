package dataStructure;

public class Queue {

    private Node first;
    private Node last;
    private int size = 0;

    public class Node {
        int data;

        Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    public Queue(int data) {
        Node newNode = new Node(data);
        first = newNode;
        last = newNode;
        size = 1;
    }

    public void getFirst() {
        if (first != null) {
            System.out.println("First element is " + first.data);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void getLast() {
        if (last != null) {
            System.out.println("Last element is " + last.data);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void getSize() {
        System.out.println("Size of queue is " + size);
    }

    public void print() {
        System.out.println("### Print queue ###");
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("### End print queue ###\n");
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;

        size++;
    }

    public Node dequeue() {
        if (size == 0) return null;
        Node temp = first;

        if (size == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }

        size--;

        return temp;
    }


    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println("Removed element: " + queue.dequeue().data);

        queue.getFirst();
        queue.getLast();
        queue.getSize();
        queue.print();

    }
}
