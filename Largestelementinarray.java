public class Largestelementinarray {
public static void main(String[] args){
    int[] arr={76,8,13,1,5};
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>=max){
            max=arr[i];
        }
    }
    System.out.println("Largest Element:"+max);
}
}
