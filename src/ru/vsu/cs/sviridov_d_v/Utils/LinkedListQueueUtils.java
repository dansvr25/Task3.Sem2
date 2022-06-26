package ru.vsu.cs.sviridov_d_v.Utils;

import ru.vsu.cs.sviridov_d_v.ProjectFiles.LinkedListQueue;

public class LinkedListQueueUtils {

    public static LinkedListQueue<Integer> intArrayToQueue(int[] array) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int j : array) {
            queue.addElement(j);
        }
        return queue;
    }

    public static int[] intQueueToArray(LinkedListQueue<Integer> queue) throws Exception {
        int[] array = new int[queue.count()];
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.removeElement();
        }
        return array;
    }
}
