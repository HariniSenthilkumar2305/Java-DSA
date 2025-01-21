import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStrings {
    public static List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        generateStringHelper(n, "", result);
        return result;
    }

    private static void generateStringHelper(int n, String current, List<String> result) {
       
        if (current.length() == n) {
            result.add(current);
            return;
        }

        generateStringHelper(n, current + "0", result);

        if (current.isEmpty() || current.charAt(current.length() - 1) != '1') {
            generateStringHelper(n, current + "1", result);
        }
    }

    public static void main(String[] args) {
        int n = 3; 
        List<String> binaryStrings = generateBinaryStrings(n);
        System.out.println(binaryStrings); 
    }
}
