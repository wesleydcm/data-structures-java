package dataStructure;
// Linked lists are a fundamental data structure that consist of a sequence of elements,
// where each element is capable to storing data and points to the next one:
// Singly Linked Lists: Where each node points to the next node.
// Doubly Linked Lists: Where each node points to both the next and the previous node.
// Circular Linked Lists: Where the last node points back to the first node.

public class LinkedList {
    // head, length and tail;
    private Node head;

    private Node tail;

    private int length;

    class Node {
        String data;

        Node next;

        // Node constructor
        Node(String data) {
            this.data = data;
        }
    }


    // LinkedList Constructor
    public LinkedList(String data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    // main operations

    // Read
    public void getHead() {
        if (head == null) {
            System.out.println("List is empty");
        }
        System.out.println("Head: " + this.head.data);
    }

    public void getTail() {
        if (this.tail == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Tail: " + this.tail.data);
        }

    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        if (length == 0) {
            System.out.println("List is empty");
        }
    }

    // Add operations
    public void append(String data) {
        Node newNode = new Node(data);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;

        length++;
    }

    public void prepend(String data) {
        Node newNode = new Node(data);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public boolean insert(String data, int index) {
        if (index < 0 || index >= length) return false;

        if (index == 0) {
            prepend(data);
            return true;
        } else if (index == length - 1) {
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;

        length++;

        return true;
    }


    // Remove operations
    public Node removeLast() {
        if (length == 0) return null;

        // Always start reading from the head in linked lists
        Node current = head;

        if (length == 1) {
            head = null;
            tail = null;
            length = 0;

            return current;
        }


        while (current.next != tail) {
            current = head.next;
        }


        Node itemRemoved = tail;
        tail = current;
        tail.next = null;

        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return itemRemoved;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
            length = 0;

            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;

    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;

        if (index == 0) {
            removeFirst();
        } else if (index == length - 1) {
            removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;

        length--;
        return temp;
    }

    // read operations
    public Node get(int index) {
        if (index < 0 || index >= length) return null;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }


    // update operations
    public boolean set(String data, int index) {
        if (index < 0 || index >= length) return false;

        if (index == 0) {
            head.data = data;
            return true;
        } else if (index == length - 1) {
            tail.data = data;
            return true;
        }

        Node temp = get(index);
        temp.data = data;

        return true;

    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList("Element 1");
        linkedList.append("Element 2");
        linkedList.append("Element 3");
        linkedList.prepend("Element 0");

        linkedList.remove(1);
        linkedList.print();


//        linkedList.print();
//        linkedList.set("Updated successfully", 2);
//        linkedList.print();

//        linkedList.insert("Element 1.5 inserted", 5);

//        System.out.println(linkedList.get(1).data);


//        System.out.println("Item removed: " + linkedList.removeFirst().data);

//        linkedList.prepend("Element 0");

//        System.out.println(linkedList.removeLast().data);

//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
//        linkedList.print();
//        linkedList.makeEmpty();

    }


}
