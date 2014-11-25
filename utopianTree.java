/* Problem Statement
* The Utopian tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. 
* The second growth cycle occurs during the summer, when its height increases by 1 meter. 
* Now, a new Utopian tree sapling is planted at the onset of the spring. Its height is 1 meter. 
* Can you find the height of the tree after N growth cycles?
* 
* @ author Adway Dhillon
*/

import java.io.*;
import java.util.*;

public class utopianTree {
    
    private static int findUtopianHeight(int n) {
        long[] heightArr = new long[n + 1];
        heightArr[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                heightArr[i] = heightArr[i - 1] + 1;
            } else {
                heightArr[i] = 2 * heightArr[i - 1];
            }
        }
        return (int) heightArr[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, noOfCases = in.nextInt();
        for (int i = 0; i < noOfCases; i++) {
            n = in.nextInt();
            System.out.println(findUtopianHeight(n));
        }
    }
}