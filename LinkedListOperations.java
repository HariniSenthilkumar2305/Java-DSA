class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList {
    private Node head;
    public void add(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new_node;
    }
    public void remove(int data){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node current=head;
        Node prev=null;
        while(current!=null && current.data!=data){
            prev=current;
            current=current.next;
        }
        if(current==null){
            System.out.println("Data is not Found here");
            return;
        }
        prev.next=current.next;
    }
    public void display(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void removeNthNode(int n){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(n==0){
            head=head.next;
            return;
        }
        int idx=0;
        Node current=head;
        Node prev=null;
        while(current!=null && idx!=n){
            prev=current;
            current=current.next;
            idx++;
        }
        if(current==null){
            System.out.println("This is out of bound");
        }
        prev.next=current.next;
    }
}
public class LinkedListOperations{
    public static void main(String[] args){
        LinkedList l=new LinkedList();
        l.add(23);
        l.add(45);
        l.add(87);
        System.out.println("Linked List Elements:");
        l.display();
        l.remove(45);
        System.out.println("Linked List Elements after Deleting");
        l.display();
        l.removeNthNode(1);
        System.out.println("Linked List Elements after Deleting");
        l.display();
    }
}

