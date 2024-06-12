package main;

import dataStructure.Queue;

import java.util.Random;

public class ServiceQueue {

    public static void main(String[] args) {
        int n = 5;

        var random = new Random();
        int client = random.nextInt(101);

        Queue queue = new Queue(client);
        System.out.println("Client: " + client);

        // Simulates customer arrival
        for (int i = 2; i <= n; i++) {
            client = random.nextInt(101);
            System.out.println("Client: " + client);
            queue.enqueue(client);
        }

        // customer service
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Customer served: " + node.getData());
            node = queue.dequeue();
        }

    }
}
