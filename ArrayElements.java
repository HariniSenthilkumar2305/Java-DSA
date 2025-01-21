public class ArrayElements {
 public static void array(int[] arr,int index){
   if(index==arr.length){
    return;
   }
   System.out.println(arr[index]);
   array(arr,index+1);
 } 
 public static void main(String[] args){
     int[] arr={1,2,3,4,5};
     array(arr, 0);
 }  
}
