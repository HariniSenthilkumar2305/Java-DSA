import java.util.Scanner;
public class TwoDArrayOperationusingFunctions {
    public static int[][] InitiaizeArray(int row,int column){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[row][column];
        System.out.println("Enter the elements of an array;");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void Printarray(int[][] arr){
        System.out.println("The elements of the array are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
     // modify an array
    public static void modifyarray(int[][] arr,int row,int column,int newelement){
        /*if(row>=0 && col<arr.length){
         * arr[row][column]=newelement;
        } 
         else{
         System.out.println("invalid index")
    }*/
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(i==row && j==column){
                arr[i][j]=newelement;
            }
        }
       }
    }
    //Sum Of Elements
    public static int sumofelements(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
//maximum element from the array
public static int maximumelement(int[][] arr){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
    return max;
}
//minimum element in an array
public static int minimumelement(int[][] arr){
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]<min){
                min=arr[i][j];
            }
        }
    }
    return min;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column=sc.nextInt();
        int[][] arr=InitiaizeArray(row,column);
        Printarray(arr);
        // modify an array
        System.out.println("Enter the row to get modified");
        int row1=sc.nextInt();
        System.out.println("Enter the column to get modified");
        int column1=sc.nextInt();
        System.out.println("Enter the new Element:");
        int newelement=sc.nextInt();
        modifyarray(arr,row1,column1,newelement);
        Printarray(arr);
         //Sum Of Elements
       int sum=sumofelements(arr);
       System.out.println("Sum of the elements in 2D Array is:"+sum);
       //maximum element from the array
       int max=maximumelement(arr);
       System.out.println("Maximum Element"+max);
       //minimum element from the array
       int min=minimumelement(arr);
       System.out.println("Minimum Element"+min);
        }
        }
