import java.util.*;
public class ArrayQueue {
    private int[] queue;
    private int front ;
    private int rear;
    private int size;
    private int capacity;
    public ArrayQueue(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full.Can't add a new Element");
            return;
        }
        rear=(rear+1)%capacity;//circular queue
        queue[rear]=element;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty,Can't dequeue");
            return -1;
        }
        int element=queue[front];
        front=(front+1)%capacity;//circular queue
        size--;
        return element;
    }
    public int peak(){
        if(isEmpty()){
            System.out.println("Queue is Empty,Can't peek");
            return -1;
        }
        return queue[front];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==capacity;
    }
    public int getSize(){
        return size;
    }
        public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        System.out.println("Peak Element is:"+queue.peak());
        queue.dequeue();
        System.out.println(queue.getSize());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
    }
}
