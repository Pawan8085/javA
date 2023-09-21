package javA.Heap;

import java.util.PriorityQueue;

public class MedianFinder {
    
    private PriorityQueue<Integer> minHeap; 
    private PriorityQueue<Integer> maxHeap; 

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a); 
    }

    public void addNum(int num) {
        if(maxHeap.size()>0 && num>maxHeap.peek()){
            minHeap.offer(num);
        }else{
            maxHeap.offer(num);
        }

        // Balance heap size
        if (maxHeap.size() > minHeap.size()+1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }
}
