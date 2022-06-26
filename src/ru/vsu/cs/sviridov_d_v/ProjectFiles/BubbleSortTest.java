package ru.vsu.cs.sviridov_d_v.ProjectFiles;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.sviridov_d_v.Utils.LinkedBlockedQueueUtils;
import ru.vsu.cs.sviridov_d_v.Utils.LinkedListQueueUtils;

import java.util.concurrent.LinkedBlockingQueue;

public class BubbleSortTest {
    @Test
    public void testNormalLinkedListQueue() throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        int[] queueArr = {6, 5, 8, 3, 7};
        LinkedListQueue<Integer> queue = LinkedListQueueUtils.intArrayToQueue(queueArr);

        bubbleSort.sort(queue);

        int[] queueResultArr = LinkedListQueueUtils.intQueueToArray(queue);
        int[] expectedResult = {3, 5, 6, 7, 8};

        Assert.assertArrayEquals(expectedResult, queueResultArr);
    }

    @Test
    public void testNormalStandardQueue() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] queueArr = {9, 2, 1, 4, 7};
        LinkedBlockingQueue<Integer> queue = LinkedBlockedQueueUtils.intArrayToQueue(queueArr);

        bubbleSort.sort(queue);

        int[] queueResultArr = LinkedBlockedQueueUtils.intQueueToArray(queue);
        int[] expectedResult = {1, 2, 4, 7, 9};

        Assert.assertArrayEquals(expectedResult, queueResultArr);
    }

    @Test
    public void testBigQueue() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] queueArr = {7, 7, 7, 2, 0, 14, 1, 0, 5, 2, 3, 12, 43, 6, 4};
        LinkedBlockingQueue<Integer> queue = LinkedBlockedQueueUtils.intArrayToQueue(queueArr);

        bubbleSort.sort(queue);

        int[] queueResultArr = LinkedBlockedQueueUtils.intQueueToArray(queue);
        int[] expectedResult = {0, 0, 1, 2, 2, 3, 4, 5, 6, 7, 7, 7, 12, 14, 43};

        Assert.assertArrayEquals(expectedResult, queueResultArr);
    }

    @Test
    public void testBigNumQueue() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] queueArr = {5834, 458738539, 2324, 4566456, 978789};
        LinkedBlockingQueue<Integer> queue = LinkedBlockedQueueUtils.intArrayToQueue(queueArr);

        bubbleSort.sort(queue);

        int[] queueResultArr = LinkedBlockedQueueUtils.intQueueToArray(queue);
        int[] expectedResult = {2324, 5834, 978789, 4566456, 458738539};

        Assert.assertArrayEquals(expectedResult, queueResultArr);
    }

    @Test
    public void testSameNumsQueue() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] queueArr = {1, 1, 2, 3, 4, 0, 0, 0};
        LinkedBlockingQueue<Integer> queue = LinkedBlockedQueueUtils.intArrayToQueue(queueArr);

        bubbleSort.sort(queue);

        int[] queueResultArr = LinkedBlockedQueueUtils.intQueueToArray(queue);
        int[] expectedResult = {0, 0, 0, 1, 1, 2, 3, 4};

        Assert.assertArrayEquals(expectedResult, queueResultArr);
    }
}
