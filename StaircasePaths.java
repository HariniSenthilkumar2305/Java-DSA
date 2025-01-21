public class StaircasePaths {
    public static void printPaths(int n,String path){
        if(n==0){
            System.out.print(path);
            return;
        }
        printPaths(n-1, path+"1");
        printPaths(n-2, path+"2");
    }
    public static void main(String[] args) {
        int n=3;
        printPaths(n, "");
    }
}
