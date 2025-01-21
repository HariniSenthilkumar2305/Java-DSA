public class PrintSubsequence {
    public static void generatesubsequence(String str,String current,int index){
        if(index==str.length()){
            System.out.println(current);
            return;
        }
        generatesubsequence(str, current+"-", index+1);
        generatesubsequence(str, current+str.charAt(index), index+1);
    }
    public static void main(String[] args) {
       String str="abc";
       System.out.println("Subsequences are:");
       generatesubsequence(str, "", 0);
    }
}
