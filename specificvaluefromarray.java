public class specificvaluefromarray {
public static void main(String[] args) {
    int[] arr={3,5,2,8,1};
    int ValuetoSearch=8;
    int flag=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==ValuetoSearch){
          flag=1;
          break;
        }
    }
    if(flag>0){
        System.out.println("Value found");
    }
    else{
        System.out.println("Value Not found");
    }
}
}
