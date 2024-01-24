public class QueueClass {
    private int capacity = 2;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public QueueClass() {
        queueArr = new int[this.capacity];
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full, increasing capacity...");
            increaseCapacity();
        }
        rear = (rear + 1) % queueArr.length;
        queueArr[rear] = item;
        currentSize++;
        System.out.println("Enqueued: " + item);
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow: Unable to dequeue, queue is empty");
        } else {
            int dequeuedItem = queueArr[front];
            front = (front + 1) % queueArr.length;
            currentSize--;
            System.out.println("Dequeued: " + dequeuedItem);
        }
    }

    public boolean isQueueFull() {
        return currentSize == queueArr.length;
    }

    public boolean isQueueEmpty() {
        return currentSize == 0;
    }

    private void increaseCapacity() {
        int newCapacity = this.queueArr.length * 2;
        int[] newArr = new int[newCapacity];
        int tmpFront = front;
        for (int i = 0; i < currentSize; i++) {
            newArr[i] = queueArr[tmpFront];
            tmpFront = (tmpFront + 1) % queueArr.length;
        }
        this.queueArr = newArr;
        this.front = 0;
        this.rear = currentSize - 1;
        this.capacity = newCapacity;
        System.out.println("New Array capacity: " + this.queueArr.length);
    }

    public static void main(String[] args) {
        QueueClass que = new QueueClass();
        que.enqueue(4);
        que.dequeue();
        que.enqueue(56);
        que.enqueue(2);
        que.enqueue(60);
        que.dequeue();
        que.enqueue(24);
        que.enqueue(98);
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.enqueue(300);
        que.dequeue();
        que.dequeue();
    }
}
