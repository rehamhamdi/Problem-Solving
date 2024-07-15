import java.util.ArrayList;
import java.util.Scanner;
 
public class problems {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            A.add(input.nextInt());
        }
        for (int i = 1; i <= N; i++) {
            B.add(input.nextInt());
        }
        System.out.println(concatenateArrays(B, A));
    }
 
    static String concatenateArrays(ArrayList<Integer> B, ArrayList<Integer> A) {
        ArrayList<Integer> C = new ArrayList<>();;
        C.addAll(B);
        C.addAll(A);
 
        // Build the string in the expected format
        StringBuilder result = new StringBuilder();
        for (Integer num : C) {
            result.append(num).append(" ");
        }
        return result.toString().trim(); // Trim to remove the trailing space
 
    }
}
