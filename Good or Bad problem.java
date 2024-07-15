import java.util.ArrayList;
import java.util.Scanner;

public class problems {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfTestCases = input.nextInt();
        ArrayList<String> results =  new ArrayList<>();;
        for (int i = 1; i <= numberOfTestCases; i++) {
            String s = input.next();
            if (s.contains("010") || s.contains("101")) {
                results.add("Good");
            } else {
                results.add("Bad");
            }
        }
       for (String result : results) {
            System.out.println(result); 
        }
    }
}
