import java.util.Scanner;
public class BuyandSellStock {
    public static int[] initializeArray(int n){
        int[] prices1=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                prices1[i]=sc.nextInt();
        }
        return prices1;
    }
    public static int BuyandSellStock(int[] prices1){
     int minPrice=Integer.MAX_VALUE;
     int maxPrice=0;
     for(int price:prices1){
        minPrice=Math.min(minPrice,price);
        int profit=price-minPrice;
        maxPrice=Math.max(maxPrice,profit);
     }
     return maxPrice;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] prices1=initializeArray(n);
        int Profit=BuyandSellStock(prices1);
        System.out.println("maximum Profit:"+Profit);
    }
}
