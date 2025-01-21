public class Displaymatrix {
    public static void displaymatrix1(int[][] mat) {
        for (int i = 0; i < mat.length; i++) { 
            for (int j = 0; j < mat[i].length; j++) { 
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args){
        int V=4;
        int[][] mat=new int[V][V];
        mat[0][1]=1;
        mat[1][0]=1;
        mat[2][0]=1;
        mat[0][2]=1;
        System.out.println("Adjacency Matrix Representation");
        displaymatrix1(mat);
    }
}
