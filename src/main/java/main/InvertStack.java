package main;

import dataStructure.Stack;

public class InvertStack {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};

        reverse(numbers);

    }

    public static void reverse(final int[] numbers) {
        Stack stack = new Stack(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            stack.push(numbers[i]);

        }

        var node = stack.pop();

        while (node != null) {
            System.out.print(node.getValue());
            node = stack.pop();
        }




    }
}
