package ru.vsu.cs.sviridov_d_v.ProjectFiles;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.print("Print 0 if you want to use standard queue and 1 if LinkedListQueue: ");
        int n = enterIntValue();

        if (n == 0) {
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            BubbleSort bubbleSort = new BubbleSort();

            addQueueItems(queue);
            bubbleSort.sort(queue);
            printResult(queue);
        }

        if (n == 1) {
            LinkedListQueue<Integer> queue = new LinkedListQueue<>();
            BubbleSort bubbleSort = new BubbleSort();

            addQueueItems(queue);
            bubbleSort.sort(queue);
            printResult(queue);
        }
    }

    private static int enterIntValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void addQueueItems(LinkedBlockingQueue<Integer> queue) {
        System.out.print("Enter the number of items in the queue: ");
        int size = enterIntValue();

        for (int i = 0; i < size; i++) {
            System.out.println("Add an item to the queue: ");
            queue.add(enterIntValue());
        }
    }

    private static void addQueueItems(LinkedListQueue<Integer> queue) {
        System.out.print("Enter the number of items in the queue: ");
        int size = enterIntValue();

        for (int i = 0; i < size; i++) {
            System.out.println("Add an item to the queue: ");
            queue.addElement(enterIntValue());
        }
    }

    private static void printResult(LinkedBlockingQueue<Integer> result) {
        System.out.println("Result:");

        for (Integer i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printResult(LinkedListQueue<Integer> result) throws Exception {
        System.out.println("Result:");

        int lenght = result.count();

        for (int i = 0; i < lenght; i++) {
            System.out.print(result.removeElement() + " ");
        }
        System.out.println();
    }
}
