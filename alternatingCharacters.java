import java.util.*;

public class alternatingCharacters {

    private static int findDeletions(String str) {
        char c = str.charAt(0);
        int deletions = 0;
            for (int i = 1; i < str.length(); i++) {
                if (c == str.charAt(i)) {
                    deletions++;
                }
                c = str.charAt(i);
            }
        return deletions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfCases = sc.nextInt();
        for (int i = 0; i < noOfCases; i++) {
            System.out.println(findDeletions(sc.next()));
        }
    }
}