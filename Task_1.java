package cybercube;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] countCharacters = new int[123];

        Scanner scan = new Scanner(System.in);

        while (true) {
            Arrays.fill(countCharacters, 0);
            System.out.println("=================================");
            System.out.println("Input s - (type '000') to escape:");
            // Read input string s
            String s = scan.nextLine();
            if (s.equals("000")) {
                break;
            }

            // Scan each character in string s
            int index;
            for (int i = 0; i < s.length(); i++) {
                index = Integer.valueOf(s.charAt(i));
                countCharacters[index] += 1;
            }

            System.out.println("Input t:");
            // Read next input string t
            String t = scan.nextLine();
            for (int i = 0; i < t.length(); i++) {
                index = Integer.valueOf(t.charAt(i));
                if (countCharacters[index] == 0) {
                    System.out.println("Output: " + t.charAt(i));
                    break;
                } else {
                    countCharacters[index] -= 1;
                }
            }
        }
    }
}
