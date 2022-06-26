package ru.vsu.cs.sviridov_d_v.Utils;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockedQueueUtils {

    public static LinkedBlockingQueue<Integer> intArrayToQueue(int[] array) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        for (int j : array) {
            queue.add(j);
        }
        return queue;
    }

    public static int[] intQueueToArray(LinkedBlockingQueue<Integer> queue) {
        int[] array = new int[queue.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.remove();
        }
        return array;
    }
}
