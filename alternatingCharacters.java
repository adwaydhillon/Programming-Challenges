/* Problem Statement
*
* Shashank likes strings in which consecutive characters are different. 
* For example, he likes ABABA, while he doesn't like ABAA. 
* Given a string containing characters A and B only, he wants to change it into a string he likes. 
* To do this, he is allowed to delete the characters in the string.
*
* Your task is to find the minimum number of required deletions.
*/


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