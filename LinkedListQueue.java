public class LinkedListQueue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // Corrected to initialize next as null
        }
    }

    private Node front, rear;
    private int size;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, can't dequeue");
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dequeuedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, can't peek");
            return -1;
        }
        return front.data; // Added return statement
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }
    public static void main(String[] args){
            LinkedListQueue queue = new LinkedListQueue();
    
            // Enqueue elements
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
    
            // Peek the front element
            System.out.println("Front element is: " + queue.peek());
    
            // Dequeue elements and print them
            System.out.println("Dequeued element is: " + queue.dequeue());
            System.out.println("Dequeued element is: " + queue.dequeue());
    
            // Peek again
            System.out.println("Front element is: " + queue.peek());
    
            // Check size of the queue
            System.out.println("Queue size is: " + queue.getSize());
    
            // Dequeue the remaining element
            System.out.println("Dequeued element is: " + queue.dequeue());
    
            // Attempt to dequeue from an empty queue
            System.out.println("Dequeued element is: " + queue.dequeue());
            
            // Check if the queue is empty
            System.out.println("Is the queue empty? " + queue.isEmpty());
        }
    }

