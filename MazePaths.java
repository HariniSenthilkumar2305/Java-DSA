public class MazePaths {
    public static void printMazePath(int sr,int sc,int dr,int dc,String path){
        if(sc==dc&&sr==dr){
            System.out.println(path);
            return;
        }
       if(sc<dc){
    printMazePath(sr, sc+1, dr, dc, path+"h");
       }
       if(sr<dr){
    printMazePath(sr+1, sc, dr, dc, path+"v");
       }
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        printMazePath(0, 0, n-1, m-1, "");
    }
}
