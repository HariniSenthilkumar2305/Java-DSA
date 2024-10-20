package DAY16;
public class StackUsingArray {
    private int[] arr;
    private int idx;
    private int maxSize;
    public StackUsingArray(int size){
        this.maxSize=size;
        this.arr=new int[maxSize];
        this.idx=0;
    }
public void push(int x){
    if(isFull()){
        System.out.println("Stack is full,Cannot push");
        return;
    }
    arr[idx]=x;
    idx++;
}
public int pop(){
    if(isEmpty()){
        System.out.println("Stack is empty Cannot pop");

    }
int top=arr[idx-1];
arr[idx-1]=0;
idx--;
return top;
}
public int peek()
{
    if(isEmpty()){
        System.out.println("Stack is Empty");
    }
    return arr[idx-1];
}
public boolean isEmpty(){
    return (idx==0);
}
public boolean isFull(){
    return (idx==maxSize);
}
public int size(){
    return idx;
}
public int capacity(){
    return arr.length;
}
public static void main(String[] args){
StackUsingArray st=new StackUsingArray(5);
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
for(int i=0;i<st.size();i++){
    System.out.print(st.arr[i]+" ");
}
System.out.println();
System.out.println("Peek "+st.peek());
System.out.println("Pop "+st.pop());
System.out.println(st.isFull());
System.out.println(st.isEmpty());
System.out.println("Size:"+st.size());
System.out.println("Capacity:"+st.capacity());
}
}