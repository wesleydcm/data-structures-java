# Personal Data Structures Study Repository

Welcome to my personal Data Structures study repository! This repository is a collection of my personal study notes and
implementations of fundamental data structures using Java. While this repository was created for my own learning, I hope
it can be a useful resource for anyone interested in these topics. Here, you will find comprehensive resources, code
examples, and exercises focused on the following key data structures:

## Linked Lists

Linked lists are a fundamental data structure that consist of a sequence of elements, where each element points to the
next one. This section covers:

- **Singly Linked Lists**: Where each node points to the next node.
- **Doubly Linked Lists**: Where each node points to both the next and the previous node.
- **Circular Linked Lists**: Where the last node points back to the first node.

| Advantages                                   | Disadvantages             |
|----------------------------------------------|---------------------------|
| Dynamic structures                           | Sequential access         |
| Memory usage                                 | Implementation complexity |
| Used in the construction of other structures |                           |

## Stacks

Stacks are a collection of elements that follow the Last In, First Out (LIFO) principle. This section includes:

- Basic operations: push, pop, peek and print.
- Optional operations: getHeight.
- Implementation using arrays and linked lists.
- Applications of stacks, such as expression evaluation and backtracking algorithms.

| Advantages                                      | Disadvantages                                                                 |
|-------------------------------------------------|-------------------------------------------------------------------------------|
| Dynamic Size                                    | Increased Memory Overhead (due to Node objects)                               |
| Efficient Insertions/Deletions (O(1))           | No Efficient Random Access (O(n))                                             |
| No Need to Predefine Capacity                   | Higher Memory Usage due to Node Pointers                                      |
| Easy to Implement Using Java's LinkedList Class | Complex Implementation Compared to Array-based Stacks                         |
| Avoids Issues of Stack Overflow (no fixed size) | Potentially Slower Due to Node Traversal                                      |
| Built-in Support in Java Collections Framework  | Potential Performance Issues with Frequent Insertions/Deletions in the Middle |

## Queues

Queues are a collection of elements that follow the First In, First Out (FIFO) principle. This section explores:

- Basic operations: enqueue, dequeue, and peek.
- Implementation using arrays and linked lists.
- Different types of queues, including circular queues and priority queues.

## Trees

Trees are hierarchical data structures with a root node and child nodes forming a parent-child relationship. This
section covers:

- Basic tree concepts and terminology.
- Tree traversal methods: pre-order, in-order, post-order, and level-order traversal.
- Applications of trees in various domains.

## Binary Search Trees (BSTs)

Binary Search Trees are a specialized form of trees that maintain a sorted order of elements. This section delves into:

- Properties of BSTs and how they ensure efficient search, insertion, and deletion operations.
- Implementation and manipulation of BSTs.
- Balancing techniques, such as AVL trees and Red-Black trees.

## How to Use This Repository

1. **Clone the Repository**: Use the following command to clone the repository to your local machine.
   ```sh
   git clone https://github.com/wesleydcm/data-structures-java.git
   ```
2. **Explore the Code**: Navigate through the folders to find code examples and explanations for each data structure.
3. **Run the Examples**: Open the code examples in your preferred Java IDE (like IntelliJ IDEA or Eclipse) and run them
   to see the data structures in action.
4. **Practice**: Solve the exercises provided at the end of each section to reinforce your understanding and improve
   your coding skills.

## Contribution

While this is a personal study repository, contributions are welcome. If you have code examples, explanations, or
exercises that can benefit others, please feel free to open a pull request.

### Happy Learning!

---