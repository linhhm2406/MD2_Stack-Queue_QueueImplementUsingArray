public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head;
    public int tail;
    public int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean conclude = false;
        if (currentSize == capacity) {
            conclude = true;
        }
        return conclude;
    }

    public boolean isQueueEmpty() {
        boolean conclude = false;
        if (currentSize == 0) {
            conclude = true;
        }
        return conclude;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

//    public void enqueue(int item) {
//        if (isQueueFull()) {
//            System.out.println("Full");
//        } else {
////            this.tail++;
//            if (this.tail == this.capacity - 1) {
//                this.tail = 0;
//            } else {
//                queueArr[tail] = item;
//                this.tail++;
//                currentSize++;
//            }
//
//            System.out.println("Push Ok: " + queueArr[tail]);
//        }
//    }
//
//    public void dequeue(){
//        if (isQueueEmpty()){
//            System.out.println("Empty");
//        }else {
//            head++;
//            if (head == capacity - 1) {
//                System.out.println("Pop OK:" + queueArr[head - 1]);
//                head = 0;
//            } else {
//                System.out.println("Pop OK:" + queueArr[head - 1]);
//            }
//            currentSize--;
//        }
//
//    }
}
