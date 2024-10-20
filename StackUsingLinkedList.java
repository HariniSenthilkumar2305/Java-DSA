package DAY16;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Stack {
    private Node head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }

    public int peak() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        Node current = head;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); 
        System.out.println("Top element: " + stack.peak());
        System.out.println("Popped element: " + stack.pop()); 
        stack.printStack(); 

        System.out.println("Stack size: " + stack.size()); 

        System.out.println("Is stack empty? " + stack.isEmpty()); 

        stack.pop();
        stack.pop();
        stack.printStack(); 
        System.out.println("Is stack empty? " + stack.isEmpty()); 
    }
}
